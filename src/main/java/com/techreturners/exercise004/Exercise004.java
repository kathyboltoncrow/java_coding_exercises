package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private static final int GIGA_SEC = 1000000000;
    LocalDateTime gigaDate;


    public Exercise004(LocalDate date) {
       gigaDate = date.atStartOfDay().plusSeconds(GIGA_SEC);
    }

    public Exercise004(LocalDateTime dateTime) {
        gigaDate = dateTime.plusSeconds(GIGA_SEC);

    }

    public LocalDateTime getDateTime() {
        return gigaDate;
    }
}
