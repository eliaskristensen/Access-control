package com.example.bachelor.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int resourceid;
    private int roleid;
    private String packagename;
    private String componentname;
    private String resourcename;
    private String hasaccess;
    private Date created;
    private String deleted;
    private int changedbyuserid;


    public Resource(int resourceid, int roleid, String packagename, String componentname, String resourcename, String hasaccess, Date created, String deleted, int changedbyuserid) {
        this.resourceid = resourceid;
        this.roleid = roleid;
        this.packagename = packagename;
        this.componentname = componentname;
        this.resourcename = resourcename;
        this.hasaccess = hasaccess;
        this.created = created;
        this.deleted = deleted;
        this.changedbyuserid = changedbyuserid;
    }

    public Resource() {

    }
}
