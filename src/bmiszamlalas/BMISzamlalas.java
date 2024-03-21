package bmiszamlalas;

import java.util.Scanner;

public class BMISzamlalas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       bmiSzamlalas();
    }
    private static void bmiSzamlalas(){
        kiir("BMI kiszámítása");
        int testsuly = beker("Testsúly(kg)[40;150]", 40, 150);
        int magassag = beker("Magasság(cm)[100;200]", 100, 200);
        double bmi = bmiSzamitas(testsuly, magassag);
        ertekeles(bmi, magassag, testsuly);
    }
    private static int beker(String uzenet, int min, int max){
        System.out.print(uzenet);
        int ertek = sc.nextInt();
        while(ertek<min || ertek>max){
            System.out.print(uzenet);
            ertek = sc.nextInt();
        }
        return ertek;
    }
    private static void kiir(String uzenet){
        System.out.println(uzenet);
    }
    private static double bmiSzamitas(int t, int m){
        return t/Math.pow(m/100.0,2);
    }
    private static void ertekeles(double bmi, int m, int t){
        kiir("Ön " + m + " cm magas és "+t+" kg tömegű");
        if(bmi < 20){
            kiir(" sovány");
        }else if(bmi < 25){
            kiir(" normál");
        }else if(bmi <30){
            kiir(" túlsúlyos");
        }else if(bmi <40){
            kiir(" elhízott");
        }else{
            kiir(" kórosan elhízott");
        }
    }
}
