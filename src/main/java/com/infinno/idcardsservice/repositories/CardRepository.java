package com.infinno.idcardsservice.repositories;

import com.infinno.idcardsservice.models.Card;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CardRepository extends CrudRepository<Card, Integer> {
    @Query("SELECT * FROM cards WHERE status = INVALID")
    ArrayList<Card> getInvalidCards();
}
