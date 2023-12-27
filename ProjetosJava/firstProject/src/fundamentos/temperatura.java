package fundamentos;

public class temperatura {

    public static void main(String[] args) {
        double farenheit = 86;
        final double temp = 32;
        final double division = 5.0/9.0;
        final double teste = 0.5;

        double calculoTemp = (farenheit - temp) * division;
        System.out.println("A temperatura convertida é de: " + calculoTemp + "Cº");
    }
}
