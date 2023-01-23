package com.techreturners.exercise002;

public class Exercise002 {
    public static final String MANCHESTER = "Manchester";
    public boolean isFromManchester(Person person) {
        if (person == null){
            return false;
        }
        return person.getCity().equals(MANCHESTER);
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person == null){
            return false;
        }
        return person.getAge() >= ageLimit;
    }
}
