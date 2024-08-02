import java.util.Scanner;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        /**Para declarar váriáveis no java precisamos primeiro declarar o tipo de variável depois o nome da variável, seguido de seu valor. Se essa variável for uma constante precisa utilizar a palavra reservada final antes do tipo. Ex: final int ANO_NASCIMENTO = 1990; */
    
        final int ANO_NASCIMENTO = 1996;
        System.out.println(ANO_NASCIMENTO);

        Scanner scan = new Scanner(System.in);
        String primeiroNome;
        String segundoNome;
        double altura;
        double peso;
        double imc;

        System.out.println("Olá, Seja bem vindo!, qual o seu nome primeiro nome?");
        primeiroNome = scan.nextLine();
        System.out.println(primeiroNome + " qual é o seu segundo nome?");
        segundoNome = scan.nextLine();
        System.out.println(primeiroNome + " Digite a sua idade ");
        int idade = scan.nextInt();
        System.out.println(primeiroNome + " Digite a sua altura ");
        altura = scan.nextDouble();
        System.out.println(primeiroNome + " Digite o seu peso ");
        peso = scan.nextDouble();
        imc = peso / (altura * altura);
        String classificacao = classificarIMC(imc);

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("O seu nome completo é " + nomeCompleto + ", você tem " + idade + " Anos e pesa " + peso +" kgs " );
        System.out.println(primeiroNome + " Avaliando o seu IMC, temos o resultado de " + imc + " pontos, portanto, você faz parte da faixa de " + classificacao);
    }

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    return primeiroNome.concat(" ").concat(segundoNome); }

/** diferentes faixas do imc */

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";


}
    }
}