package com.techreturners.exercise002;

public class Exercise002 {
    public static final String MANCHESTER = "Manchester";
    public boolean isFromManchester(Person person) {
        if (person == null){
            return false;
        }

        if (person.getCity().equals(MANCHESTER)){
            return true;
        }else{
            return false;
        }
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person == null){
            return false;
        }

        if (person.getAge() >= ageLimit){
            return true;
        }else{
            return false;
        }
    }
}
