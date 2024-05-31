package com.example.bachelor;

import lombok.extern.slf4j.Slf4j;
import no.fint.model.FintMainObject;
import org.reflections.Reflections;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@Slf4j
public class ReflectionService {

    public static HashMap<String, Boolean> readFintModel(String packages){
        HashMap<String, Boolean> fintmap = new HashMap<>();
        Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + packages).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            fintmap.put(clazz.getPackageName(), null);
        });
        return fintmap;
    }
}
