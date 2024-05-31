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
    public static HashMap<String, Boolean> readRessursModel(String resources) {
        HashMap<String, Boolean> ressursMap = new HashMap<>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + resources).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            ressursMap.put(clazz.getSimpleName(), false);
        });
        return ressursMap;
    }
}