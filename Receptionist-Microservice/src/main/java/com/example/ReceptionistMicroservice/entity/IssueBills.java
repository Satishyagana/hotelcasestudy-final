package com.example.ReceptionistMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "IssueBills")
public class IssueBills {
    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";
    @Id
    private int billNo;

    private int roomNo;

    private int price;

    private int taxes;

    private  String date;

    private int service;

    private int total;
}
