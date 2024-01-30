public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет,то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет,то он не достиг совешеннолетия,нужно немного подождать.");
        }
        //task2
        System.out.println("task2");
        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти в шапке и без шапки.");
        }
        //task3
        System.out.println("task3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        } else if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        //task4
        System.out.println("task4");
        int ageHuman = 25;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + " лет, то ему нужно ходить в детский сад.");
        } else if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + " лет, то ему нужно ходить в школу.");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " лет, то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + " лет, то можно заниматься чем хочешь.");
        }
        //task5
        System.out.println("task5");
        int ageChild = 13;
        boolean adult = false;
        if (ageChild <= 5) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " лет, то он не может кататься на аттракционе.");
        } else if (ageChild > 5 && ageChild < 14 && adult) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " лет, то он может кататься на аттракционе только в сопровождении взрослого.");
        } else if (ageChild > 5 && ageChild < 14 && !adult) {
            System.out.println("Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребёнка больше 14 лет, то он может кататься без взрослого.");
        }
        //task6
        System.out.println("task6");
        int capacity = 100;
        int sit = 60;
        boolean overNorm = capacity < 102;
        boolean overSit = sit < 60;
        if (!overNorm && !overSit) {
            System.out.println("Вагон полностью забит.");
        } else if (overSit) {
            System.out.println("В вагоне есть сидячие места.");
        } else {
            System.out.println("В вагоне есть стоячие места.");
        }
        //task7
        System.out.println("task7");
        int one = 6;
        int two = 8;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("one самое большое");
        } else if(two > one && two > three) {
            System.out.println("two самое большое");
        } else if(three > one && three > two) {
            System.out.println("three самое большое");
        } else if (one == two || one == three || two ==three) {
            System.out.println("что-то между собой равно)");
        }

    }
}