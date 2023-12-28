package fundamentos;

public class tipoString {
    public static void main(String[] args) {
        String s = "Boa tarde!";

        System.out.println(s.concat("!!!")); //Concatenar com função
        System.out.println(s + "!!!"); //Concatenar com +

        System.out.println(s.startsWith("Boa")); //função startsWith vai ferificar se a String s contém a condição informada
        System.out.println(s.toLowerCase().startsWith("boa")); // toLowerCase() irá deixar a String de s minuscula
        System.out.println(s.toUpperCase().endsWith("TARDE")); // toUpperCase() irá deixar a String s em maiuscula e a endsWith verifica se o texto termina com a condição informada

        System.out.println(s.length()); //verifica o tamanho da String informada
        System.out.println(s.toLowerCase().equals("boa tarde")); //equals retorna True ou False se o texto anterior for igual a condição informada
        System.out.println(s.equalsIgnoreCase("boa tarde")); //Não considera letras maiusculas ou minusculas

        var nome = "Matheus";
        var sobrenome = "Dominici";
        var idade = 21;
        var salario = 20000.6452;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;

        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e recebe R$ %.2f de salário", nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e recebe R$ %.2f de salário", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); // verifica se o texto contem a condição informada
        System.out.println("Frase qualquer".indexOf("qual"));// retorna em qual index a condição informada está
        System.out.println("Frase qualquer".substring(6, 8));// retorna o texto que estiver no index da condição passada

    }

}
