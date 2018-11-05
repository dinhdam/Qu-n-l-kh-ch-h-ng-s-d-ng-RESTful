package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name ="Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    private String firstname;
    private String lastname;
    public Customer(){
    }
    public Customer(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;

    }
    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstname, lastname);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
}
