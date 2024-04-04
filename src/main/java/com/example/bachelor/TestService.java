package com.example.bachelor;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.model.FintMainObject;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.Collections.sort;


@Service
@Slf4j
public class TestService {
    @PostConstruct
    public void test(){
        String pakke = "felles";
        //HashMap<String, Boolean> testliste = new HashMap<String, Boolean>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + pakke).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            // Tester at vi får tak i informasjonsmodellen
            //testliste.add(clazz.getSimpleName());
            //testliste.put(clazz.getSimpleName(), false);
            //System.out.println(clazz.getSimpleName());
        });
        //System.out.println(testliste);
        //List<FintRelation> minListe = FintObject.getAllRelations();

    }
}
