package com.example.bachelor;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import no.fint.model.FintMainObject;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import static java.util.Collections.sort;

@Service
@Slf4j
public class TestService {
    @PostConstruct
    public void test(){
        ArrayList<String> testliste = new ArrayList<>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model").getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            // Tester at vi får tak i informasjonsmodellen
            testliste.add(clazz.getSimpleName());
            sort(testliste);
            //System.out.println(clazz.getSimpleName());
        });
        System.out.println(testliste);
        System.out.println(testliste.size() + "");
    }
}
