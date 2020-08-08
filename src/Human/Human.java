//package Human;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Human {
//
//
//    String humanName;
//    String humanType;
//    int humanAge;
//    public String Gatherer;
//    public String Hunter;
//
//    int yes = 1;
//    int no = 2;
//    Scanner scanner = new Scanner(System.in);
//    int userResponce = scanner.nextInt();
//
//    public static int generateRandomInt(int number) {
//        Random random = new Random();
//        return random.nextInt(number);
//    }
//
//    public Human(String humanName, String humanType, int humanAge) {
//        this.humanName = humanName;
//        this.humanType = humanType;
//        this.humanAge = humanAge;
//    }
//
//    public void WhatType() {
//        System.out.println("This human is " + humanType);
//    }
//
//    public void Dishes() {
//        switch (humanType) {
//            case (Gatherer):
//                System.out.println("Do you want to eat? Choose 1 for yes or 2 for no");
//
//                if (userResponce == yes) {
//                    System.out.println("What do you want to eat?");
//
//                    String[] FoodOptions = new String[]{"apples", "grapes", "nuts", "mashrooms"};
//                    for (int i = 0; i <= FoodOptions.length; i++) {
//                        Scanner userChoice = new Scanner(System.in);
//                        String Choice = userChoice.next();
//                        if (Choice == FoodOptions[i]) {
//                            System.out.println(humanName + "eats" + generateRandomInt(10) + userChoice);
//                        }
//                    }
//
//                }
//                if (userResponce == no) {
//                    System.out.println("Good for you!");
//                }
//                break;
//
//            case (Hunter):
//                System.out.println("Do you want to eat? Choose 1 for yes or 2 for no");
//                if (userResponce == yes) {
//                    System.out.println("What do you want to eat?");
//
//                    String[] FoodOptions = new String[]{"chicken", "pork", "fish"};
//                    for (int i = 0; i <= FoodOptions.length; i++) {
//                        Scanner userChoice = new Scanner(System.in);
//                        String Choice = userChoice.next();
//                        if (Choice == FoodOptions[i]) {
//                            System.out.println(humanName + "eats" + generateRandomInt(10) + userChoice);
//                        }
//                    }
//
//                }
//                if (userResponce == no) {
//                    System.out.println("Good for you!");
//                }
//                break;
//
//            default:
//                System.out.println("No food for you today");
//                break;
//        }
//
//    }
//
//
//}
