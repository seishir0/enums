package com.example;

public class DayAdvisorApp implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Будь продуктивним! Плануй свій день, розстав пріоритети.");
            case FRIDAY ->
                    System.out.println("Happy Friday!");
            case SATURDAY, SUNDAY ->
                    System.out.println("Час для відпочинку! Рекомендуємо відвідати парк, музей або кінотеатр.");
        }
    }

    public static void main(String[] args) {
        DayAdvisorApp advisor = new DayAdvisorApp();


        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            advisor.advise(day);
        }
    }
}