public class Main {
    public static void main(String[] args) {

        byte age = 19;
        if (age >= 18) {
            System.out.println("Пользователь совершеннолетний");
        } else {
            System.out.println("Пользователь несовершеннолетний");
        }

        byte temp = 30;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        byte speed = 60;
        if (speed > 60) {
            System.out.println("скорость превышена");
        }else {
            System.out.println("превышения скорости нет");
        }

        byte age2 = 17;
        if (2 <= age2 && age2 <= 6){
            System.out.println("нужно ходить в детский сад");
        } else if (7 <= age2 && age2 <= 17) {
            System.out.println("нужно ходить в школу");
        } else if (18 <= age2 && age2 <= 24) {
            System.out.println("нужно ходить в универ");
        }else {
            System.out.println("нужно работать");
        }

        byte ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Ты не может кататься на аттракционе");
        }else if (5 <= ageChild && ageChild < 14) {
            System.out.println("Ты можешь кататься, но только со взрослым");
        }else {
            System.out.println("Ты можешь кататься без сопровождения взрослого");
        }

        byte allPositions = 102;
        byte  seatingPositions = 60;
        byte occupiedPositions = 101;
        if (occupiedPositions < seatingPositions) {
            System.out.println("Есть сидячие места");
        }else if (occupiedPositions >= seatingPositions && occupiedPositions < allPositions) {
            System.out.println("Нет сидячих мест, придется стоять");
        }else {
            System.out.println("Вагон забит");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        }else if (two > one && two > three) {
            System.out.println("Число" + two + " большее");
        } else{
            System.out.println("Число " + three + " большее");
        }
    }

}