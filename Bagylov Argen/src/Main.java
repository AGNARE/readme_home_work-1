public class Main {
    public static void main(String[] args) {
        String myPhoneColor = " Цвет моего телефона ";

        final int NUM = 1;

        String word = "black";
        System.out.println(myPhoneColor + word + " " + NUM);

        System.out.println(myPhoneColor + NUM + " " + word);

        if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
            if (NUM < 0){
                System.out.println("Вы сохранили отрицательное число");
            } else {
                System.out.println("Вы сохранили ноль");
            }
        }
    }
}