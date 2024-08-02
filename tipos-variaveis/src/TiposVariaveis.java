public class TiposVariaveis {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        /**Para declarar váriáveis no java precisamos primeiro declarar o tipo de variável depois o nome da variável, seguido de seu valor. Se essa variável for uma constante precisa utilizar a palavra reservada final antes do tipo. Ex: final int ANO_NASCIMENTO = 1990; */
    
        final int ANO_NASCIMENTO = 1996;
        System.out.println(ANO_NASCIMENTO);

        String primeiroNome = "Lucas";
        String segundoNome = "Leonardo";
        int idade = 27;
        double peso = 74.56;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("O seu nome completo é " + nomeCompleto + " você tem " + idade + " Anos e pesa " + peso +" kgs " );
        
    }

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    return primeiroNome.concat(" ").concat(segundoNome); }




}
