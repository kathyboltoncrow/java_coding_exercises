package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if(word == null) return null;

        String capitalizedResult = word.substring(0,1).toUpperCase() + word.substring(1);
        return capitalizedResult;
    }

    public String generateInitials(String firstName, String lastName) {
        if(firstName == null || lastName == null) return null;

        String initialsFirstName = firstName.substring(0,1);
        String initialslastName = lastName.substring(0,1);
        String initialsResult = initialsFirstName + "." + initialslastName;
        return initialsResult;
    }

    public double addVat(double originalPrice, double vatRate) {

        double vat = Math.round(originalPrice * vatRate) / 100D;
        double addVatResult = originalPrice + vat;
        return addVatResult;
    }

    public String reverse(String sentence) {
        if (sentence == null) return null;

        StringBuilder reverseStringResult = new StringBuilder(sentence).reverse();
        return reverseStringResult.toString();
    }

    public int countLinuxUsers(List<User> users) {
        if(users == null) return 0;

        int count = 0;
        for(int i = 0; i < users.size(); i++){
            String type = users.get(i).getType();
            if (type.equals("Linux")) {
                count ++;
            }
        }

        return count;
    }
}
