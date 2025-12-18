package com.example.demo.entity;

import jakarta.persistence.*;
import jakarata.validation.constraints.*;
 @Entity
 public class studentEntity{
    @Id
    @Generatedvalue(strategy=GenerationType.IDENTITY)
    private Long id;
     @NotBlank(message = "Name is not Valid")
     private String name;

     @Email(message ="Email Format is not Valid")
     private string email;
     
     public void setId(Long id){
        this.id=id;
     }
     public Long getId(){
        return id;
     }
     public studentEntity(){

     }
     public stundentEntity(Long id ,String name,String email){
        this .id=id;
        this.name=name;
        this.email=email;
     }
 }