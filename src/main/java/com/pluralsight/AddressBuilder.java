package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        // * create a StringBuilder object
        StringBuilder sbOne = new StringBuilder();

        // * create a Scanner for user input
        Scanner sc = new Scanner(System.in);

        //TODO - Prompt the user for their name, billing, and shipping info.
        System.out.println("Please provide your full name: ");
        String userFullName = sc.nextLine();
        System.out.println("Please provide your Billing Street address: ");
        String userBillingAddress = sc.nextLine();
        System.out.println("Please provide your Billing City: ");
        String userBillingCity = sc.nextLine();
        System.out.println("Please provide your Billing State: ");
        String userBillingState = sc.nextLine();
        System.out.println("Please provide your Billing Zip code: ");
        String userBillingZip = sc.nextLine();
        System.out.println("Please provide your Shipping Street address: ");
        String userShippingAddress = sc.nextLine();
        System.out.println("Please provide your Shipping City: ");
        String userShippingCity = sc.nextLine();
        System.out.println("Please provide your Shipping State: ");
        String userShippingState = sc.nextLine();
        System.out.println("Please provide your Shipping Zip code: ");
        String userShippingZip = sc.nextLine();

        //TODO - Use a StringBuilder to dynamically build the string that holds all the address information.
        sbOne.append(userFullName);
        sbOne.append("\n\n");
        sbOne.append("Billing Address: \n");
        sbOne.append(userBillingAddress);
        sbOne.append("\n");
        sbOne.append(userBillingCity + ", ");
        sbOne.append(userBillingState + " ");
        sbOne.append(userBillingZip);
        sbOne.append("\n\n");
        sbOne.append("Shipping Address: \n");
        sbOne.append(userShippingAddress);
        sbOne.append("\n");
        sbOne.append(userShippingCity + ", ");
        sbOne.append(userShippingState + " ");
        sbOne.append(userShippingZip);
        sbOne.append("\n");
        String userInformation = sbOne.toString();
        System.out.println(userInformation);
        //TODO - Display the built string to the screen / user

    } // ! main method cBracket
} // ! main class cBracket
