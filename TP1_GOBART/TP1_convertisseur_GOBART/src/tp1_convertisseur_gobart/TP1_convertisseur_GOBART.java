/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_gobart;

/**
 *
 * @author Lucie, TP1 Convertisseur, 04/10/2023
 */
import java.util.Scanner;

public class TP1_convertisseur_GOBART {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir une valeur de température en degrés Celsius : ");
        double tempCelsius = sc.nextDouble();

        System.out.println("Vous avez saisi " + tempCelsius + 273 + " degrés Celsius");

        System.out.println("Saisir la conversion que vous souhaitez effectuer:");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        int choix = sc.nextInt();

        switch (choix) {
            case 1 ->
                System.out.println(tempCelsius + " degrés Celsius équivalent à " + CelciusVersKelvin(tempCelsius) + " Kelvin");
            case 2 ->
                System.out.println(tempCelsius + " Kelvin équivalent à " + KelvinVersCelcius(tempCelsius) + " degrés Celsius");
            case 3 ->
                System.out.println(tempCelsius + " Farenheit équivalent à " + FarenheitVersCelcius(tempCelsius) + " degrés Celsius");
            case 4 ->
                System.out.println(tempCelsius + " degrés Celsius équivalent à " + CelciusVersFarenheit(tempCelsius) + " Farenheit");
            case 5 ->
                System.out.println(tempCelsius + " Kelvin équivalent à " + KelvinVersFarenheit(tempCelsius) + " Farenheit");
            case 6 ->
                System.out.println(tempCelsius + " Farenheit équivalent à " + FarenheitVersKelvin(tempCelsius) + " Kelvin");
            default ->
                System.out.println("Choix invalide");
        }

        sc.close();
    }

    public static double CelciusVersKelvin(double tempCelsius) {
        return tempCelsius + 273;
    }

    public static double KelvinVersCelcius(double tempKelvin) {
        return tempKelvin - 273;
    }

    public static double FarenheitVersCelcius(double tempFarenheit) {
        return (tempFarenheit - 32) * 5.0 / 9.0;
    }

    public static double CelciusVersFarenheit(double tempCelsius) {
        return (tempCelsius * 9.0 / 5.0) + 32;
    }

    public static double KelvinVersFarenheit(double tempKelvin) {
        return (tempKelvin - 273.15) * 9.0 / 5.0 + 32;
    }

    public static double FarenheitVersKelvin(double tempFarenheit) {
        return (tempFarenheit - 32) * 5.0 / 9.0 + 273;
    }
}
