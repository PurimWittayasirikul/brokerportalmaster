package com.example.demo.model;

import org.springframework.data.annotation.Id;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientInfo {

    @Id
    private String id;

    private String firstName,lastName,gender;
    private Date dateBirth;
    private List<Fund> funds = new ArrayList<Fund>();


    public ClientInfo(String id, String firstName, String lastName, String gender, String dateBirth) throws ParseException {
        this.gender = gender;
        this.dateBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateBirth);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ClientInfo(String id, String firstName, String lastName,String gender, String dateBirth,List<Fund> funds) throws ParseException {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.funds = funds ;
        this.gender = gender;
        this.dateBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateBirth);
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateBirth() {
        return dateBirth;
    }
}
