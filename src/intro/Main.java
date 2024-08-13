package intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo");

        // Aufbau von Variablen

        /*
        * int a = 7;
        *
        * int --> Datentyp
        * a --> Bezeichner
        * = --> eine direkte Wertzuweisung
        * 7 --> der initiale Wert
        * ; schließt den Befehl ab
         */


        // int: Ganzzahl -> 32 Bit
        int i=1128937981;

        // long: Ganzzahl --> 64 Bit
        long l = 9812398127398L;

        // double: Fließkommazahl --> 64 Bit
        double d=189237.231918123123123;

        // float: Fließkommazahl --> 32 Bit
        float f=23.123981723F;

        System.out.println("double: " + d);
        System.out.println("float: " + f);

        // char: EIN Zeichen -->
        char c = 'Z';

        // boolean: Wahrheitswert --> 1 Bit
        boolean b=true;

        // short: Ganzzahl mit 16 Bit
        short sh=123;

        // byte: Ganzzahl mit 8 Bit
        byte by=127;

        /*
         * Kontrollstruktur: IF-Anweisung
         *
         * if (Bedingung) {
         *     Anweisungen
         * }
         */

        int zahl=1336;
        if (zahl==1337) {
            System.out.println("Inhalt der Variable ist 1337, IF Anweisung ist true");
        } else {
            System.out.println("Inhalt der Variable ist nicht 1337, IF Anweisung ist false");

        }

        /**
         * Arithmetik
         */

        int zahl1=26;
        zahl1 = zahl1 + 1;  // zahl1 wird zu 27
        System.out.println(zahl1);

        zahl1++;  // zahl1 zu 28
        System.out.println(zahl1);

        zahl1+=1; // zahl1 wird zu 29
        System.out.println(zahl1);

        int zahl2=12;
        System.out.println("Zahl 1: " + zahl1);
        System.out.println("Zahl 2: " + zahl2);
        System.out.println("zahl1-zahl2: " + (zahl1-zahl2));
        System.out.println("zahl1+zahl2: " + (zahl1+zahl2));
        System.out.println("zahl1/zahl2: " + zahl1/zahl2);
        System.out.println("zahl1*zahl2: " + zahl1*zahl2);
        System.out.println("zahl1%zahl2: " + zahl1%zahl2);






    }
}
