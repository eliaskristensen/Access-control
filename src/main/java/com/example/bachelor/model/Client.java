package com.example.bachelor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import no.fint.model.FintMainObject;
import no.fint.model.FintObject;
import org.reflections.Reflections;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String role;
    private String key;
    private boolean value;
    private String packageName;
    private String access;



    public Client() {
    }

    public Client(String name, String role, String key, boolean value, String access) {
        this.name = name;
        this.role = role;
        this.key = key;
        this.value = value;
        this.access = access;

    }

    // Prøver å lage en metode som kan hente ressurser.
    /*mulig må flyttes
    public void getFintObject(String pakke){
        HashMap<String, Boolean> testliste = new HashMap<String, Boolean>();
Set<Class<? extends FintMainObject>> subTypesOf = new Reflections("no.fint.model." + pakke).getSubTypesOf(FintMainObject.class);
        subTypesOf.forEach(clazz -> {
            testliste.put(clazz.getSimpleName(), false);
        });

    }*/


}

