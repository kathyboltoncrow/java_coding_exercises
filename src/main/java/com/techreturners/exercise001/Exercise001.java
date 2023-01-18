package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String capitalizedResult = word.substring(0,1).toUpperCase() + word.substring(1);
        return capitalizedResult;
    }

    public String generateInitials(String firstName, String lastName) {
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
        StringBuilder reverseStringResult = new StringBuilder(sentence).reverse();
        return reverseStringResult.toString();
    }

    public int countLinuxUsers(List<User> users) {
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
