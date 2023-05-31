public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();


    }

    public static void task1() {
        System.out.println("task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("task 2");
        for (int i = 10; i <= 10 && i >= 1; i--) {
            System.out.println(i);

        }
    }

    public static void task3() {
        System.out.println("task 3");
        for (int i = 0; i <= 16; i = i + 2) {
            System.out.println(i);

        }
    }
    public static void task4() {
        System.out.println("task 4");
        for (int i = 10; i <= 10 && i >=-10; i --) {
            System.out.println(i);

        }
    }
    public static void task5() {
        System.out.println("task 5");
        for (int i = 1904; i <=2096; i = i +4){
            System.out.println(i + " it's leap year");
        }
    }
    public static void task6() {
        System.out.println("task 6");
        for(int i = 7; i <=98; i = i + 7){
            System.out.println(i);
        }
    }
    public static void task7() {
        System.out.println("task 7");
        for(int i = 1; i <=512; i = i + i){
            System.out.println(i);
        }
    }
    public static void task8() {
        System.out.println("task 8");
        int inPot = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + inPot;
            System.out.println("month " + i + " the amount of annual savings " + total + " RUB" );
        }

    }

    public static void task9() {
        System.out.println("task 9");
        int inPot = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total +total/100;
            total = total + inPot;
            System.out.println("month " + i + " the amount of annual savings " + total + " RUB!" );
        }
    }

    public static void task10() {
        System.out.println("task 10");
        int a = 2;
        int c = 0;
        for(int b =1;b <= 10;b++){
            c=a*b;
            System.out.println("2*" + b + "=" + c);
        }




    }
}