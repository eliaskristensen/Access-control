package com.example.bachelor;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.FintMainObject;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Set;

@Service
@Slf4j
public class ResourceService {
    public static HashMap<String, Boolean> readRessursModel(String ressurs) {
        //pakke = "arkiv";
        HashMap<String, Boolean> ressursMap = new HashMap<>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + ressurs).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            // Tester at vi får tak i informasjonsmodellen
            ressursMap.put(clazz.getSimpleName(), false);
            System.out.println("SIMPLENAME" + clazz.getSimpleName() + clazz.getSimpleName());
            System.out.println("Name" + clazz.getName());
        });
        //List<FintRelation> minListe = FintObject.getAllRelations();
        return ressursMap;
    }
}