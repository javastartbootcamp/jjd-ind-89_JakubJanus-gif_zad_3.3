public class Operation {
        void add(int a, int b,double pi,double radius, int d) {
                boolean aisEven = (a % 2 == 0);
                System.out.println("Wyświetl true jeśli liczba jest parzysta lub false jak jest nieparzysta: " + aisEven);

                boolean bisOdd = (b % 2 == 1);
                System.out.println("Wyświetl true jeśli liczba jest nieparzysta lub false jak jest parzysta: " + bisOdd);

                double circleField = pi * (radius * radius);
                System.out.println("Pole koła: " + circleField);

                int power = d * d;
                System.out.println("Kwadrat liczby: " + power);
        }
}