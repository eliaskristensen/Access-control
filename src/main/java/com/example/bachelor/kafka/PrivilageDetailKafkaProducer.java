package com.example.bachelor.kafka;

//import com.example.bachelor.PrivilageDetail;
import no.fintlabs.kafka.entity.EntityProducer;
import no.fintlabs.kafka.entity.EntityProducerFactory;
import no.fintlabs.kafka.entity.EntityProducerRecord;
import no.fintlabs.kafka.entity.topic.EntityTopicNameParameters;
import no.fintlabs.kafka.entity.topic.EntityTopicService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan("no.fintlabs.kafka")
public class PrivilageDetailKafkaProducer {

    private final EntityProducerFactory entityProducerFactory;
    private final EntityProducer<PrivilageDetail> entityProducer;
    private final EntityTopicNameParameters entityTopicName;
    private final EntityTopicService entityTopicService;

    public PrivilageDetailKafkaProducer(EntityProducerFactory entityProducerFactory, EntityTopicService entityTopicService) {
        this.entityTopicService = entityTopicService;
        System.out.println("PrivilageDetailKafkaProducer");
        this.entityProducerFactory = entityProducerFactory;
        this.entityProducer = entityProducerFactory.createProducer(PrivilageDetail.class);
        entityTopicName = EntityTopicNameParameters
                .builder()
                .orgId("fintlabs.no")
                .domainContext("fint-core")
                .resource("access.control.privilage.detail")
                .build();
        entityTopicService.ensureTopic(entityTopicName, 86400000); // et døgn
    }

    public void sendPrivilageDetail(PrivilageDetail privilageDetail) {
        entityProducer.send(
                EntityProducerRecord.<PrivilageDetail>builder()
                        .topicNameParameters(entityTopicName)
                        .key(privilageDetail.getUsername() + privilageDetail.getResource())
                        .value(privilageDetail)
                        .build()
        );
        System.out.println("sendPrivilageDetail" + privilageDetail);
    }

}
