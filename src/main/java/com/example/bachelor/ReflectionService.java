package com.example.bachelor;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.FintMainObject;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.Collections.sort;


@Service
@Slf4j
public class ReflectionService {

    public static HashMap<String, Boolean> readFintModel(String pakke){
        //pakke = "arkiv";
        HashMap<String, Boolean> fintmap = new HashMap<>();
        ArrayList<String> fintlist = new ArrayList<>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + pakke).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            // Tester at vi får tak i informasjonsmodellen
            fintmap.put(clazz.getPackageName(), null);
            //fintlist.add(clazz.getPackageName());
            //fintmap.put(clazz.getSimpleName(), false);
            //System.out.println("Simplename" + clazz.getSimpleName());
            //System.out.println("Name" + clazz.getName());
        });
        //List<FintRelation> minListe = FintObject.getAllRelations();
        return fintmap;

    }
}
