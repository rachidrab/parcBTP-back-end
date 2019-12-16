package com.pfa.parcBTP.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@DiscriminatorValue("admin")
@Table(name = "admin")
public class Admin extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    public Admin() {
    }


}
