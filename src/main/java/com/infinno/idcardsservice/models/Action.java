package com.infinno.idcardsservice.models;

import java.util.Date;
import com.infinno.idcardsservice.utils.ActionType;
import jakarta.persistence.Entity;

@Entity
public class Action {
    Date timestamp;
    ActionType type;
}
