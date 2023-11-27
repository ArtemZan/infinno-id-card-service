package com.infinno.idcardsservice.controllers.card;

import com.infinno.idcardsservice.models.Card;
import com.infinno.idcardsservice.repositories.CardRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/card")
public class CardController {
    private CardRepository cardRepository;

    @PostMapping("")
    void createCard(@RequestBody Card body)
    {
        cardRepository.save(body);
    }

    @GetMapping("/invalid")
    ArrayList<Card> getInvalidCards()
    {
        return cardRepository.getInvalidCards();
    }
}
