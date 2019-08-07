package com.example.demo.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class ClientInfo {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    private List<Fund> funds = new ArrayList<Fund>();

    public ClientInfo(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ClientInfo(String id, String firstName, String lastName,List<Fund> funds) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.funds = funds ;
    }

    public void addFund(Fund fund){
        if(funds.add(fund)){
            System.out.println("add quote seccess");
        }
    }

    public Fund getFund(int id){
        return funds.get(id);
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Fund> getAllFunds() {
        return funds;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFunds(List<Fund> funds) {
        this.funds = funds;
    }
}
