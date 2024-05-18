package com.example.bachelor;

import com.example.bachelor.kafka.PrivilageDetail;
import com.example.bachelor.kafka.PrivilageDetailKafkaProducer;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final PrivilageDetailKafkaProducer privilageDetailKafkaProducer;

    public TestService(PrivilageDetailKafkaProducer privilageDetailKafkaProducer) {
        this.privilageDetailKafkaProducer = privilageDetailKafkaProducer;
    }

    @PostConstruct
    private void test(){
        PrivilageDetail test1 = new PrivilageDetail();
        test1.setUsername("username@fintlabs.no");
        test1.setResource("arkiv.kodeverk.format");
        test1.setAccess(true);

        privilageDetailKafkaProducer.sendPrivilageDetail(test1);
    }
}
