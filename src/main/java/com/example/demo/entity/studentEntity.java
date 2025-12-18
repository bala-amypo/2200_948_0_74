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

     @Email(message ="")
 }