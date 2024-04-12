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

    public static HashMap<String, Boolean> test(String pakke){
        //pakke = "arkiv";
        HashMap<String, Boolean> testliste = new HashMap<>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + pakke).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            // Tester at vi får tak i informasjonsmodellen
            testliste.put(clazz.getSimpleName(),false);
            //testliste.put(clazz.getSimpleName(), false);
            //System.out.println(clazz.getSimpleName());
        });
        //List<FintRelation> minListe = FintObject.getAllRelations();
        return testliste;

    }
}
