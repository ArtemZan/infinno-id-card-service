package com.infinno.idcardsservice.controllers.card;

import com.infinno.idcardsservice.models.Card;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/card")
public class CardController {
    @PostMapping("")
    void createCard(@RequestBody Card body) {

    }
}
