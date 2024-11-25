public class Main {
    public static void main(String[] args) {

        System.out.println("Задание№1.");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен меньше 18, то он не совершеннолетний");
        }

        System.out.println("Задание№2.");

        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Задание№3");

        int speedKmH = 60;
        if (speedKmH >= 60) {
            System.out.println("Если скорость больше " + speedKmH + "км/ч то прийдется заплотить штраф");
        } else {
            System.out.println("Если скорость меньше " + speedKmH + "км/ч можно ездить спокойно");
        }

        System.out.println("Задание№4");

        int childsAge = 6;
        if (childsAge >= 2 && childsAge <= 6) {
            System.out.println("Если возраст ребенка от 2 до 6 лет то он долженн ходить в детский сад");
        } else System.out.println("Если возраст ребенка меньше 2 и больше 6 он не должен ходить в детский сад");

        int ageOfThePerson = 17;
        if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
            System.out.println("Если возраст ребенка от 7 до 17 лет то он должен ходить в школу");
        } else System.out.println("Если возраст ребенка менше 7 и больше 17 он не должен ходить в школу");

        int ageOfThePerson1 = 24;
        if (ageOfThePerson1 >= 18 && ageOfThePerson1 <= 24) {
            System.out.println("Если возраст подростка от 18 до 24 лет то он должен ходить в университет");
        } else System.out.println("Если возраст подростка меньше 18 и больше 24 он не должен ходить в университет");
        if (ageOfThePerson1 > 24) {
            System.out.println("Если возраст подростка больше 24 то он должен ходить на работу");}


        System.out.println("Задание№5");

        int childAge = 5;

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

            System.out.println("Задание#6");

            int carSeat = 60;
            if (carSeat > 60) {
                System.out.println("Если место под номером " + carSeat + ",то место стоячее");
            }
            if (carSeat <= 60 && carSeat != 102) {
                System.out.println("Если место под номером " + carSeat + ",то место сидячее");
            } else {
                System.out.println("Если мест " + carSeat + ",то вагон уже полностью забит ");
            }

            System.out.println("Задание№7");

            int one = 10;
            int two = 2;
            int three = 3;

            if (one > two && one > three) {
                System.out.println("Максимальное число равное " + one);
            } else if (two > one && two > three) {
                System.out.println("Максимальное число равное " + three);
            } else if (three > one && three > two) {
                System.out.println("Максимальное число равное " + three);
        }
    }
}