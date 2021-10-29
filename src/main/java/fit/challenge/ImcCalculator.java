package fit.challenge;

public class ImcCalculator {

    public static String calculate(double peso, double altura) {

        double result = 0.0;

        result = peso / (altura * altura);

        if ( result < 18.5 ) return "Magreza";
        if ( result >= 18.5 && result < 24.9) return "Normal";
        if ( result >= 24.9 && result < 30) return "Sobrepeso";
             
        return "Obesidade";
     }
    
}
