package com.infinno.idcardsservice.models;

import com.infinno.idcardsservice.utils.CardStatus;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public record Card(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer id,
        Date expDate,
        String egn,
        String personId,
        String serviceUrl,
        CardStatus cardStatus,
        Integer dateCheckPeriod,
        Integer centralRegisterPeriod,
        Integer localRegisterPeriod

) {
}
