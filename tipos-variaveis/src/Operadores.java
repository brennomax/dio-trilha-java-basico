public class Operadores {

    public static void main (String[] args) throws Exception {
        // Operador de atribuição ' = '
        String meuNome = "Breno Max"; // atribuiu a srting Breno Max à variável meuNome
        int idade = 31; // atribuiu a idade 31 à variável idade
        boolean who = true; // atribuiu true à variável who
        boolean why = false;

        // Operadores aritméticos
        int soma = 3 + 4; // Operador ' + ' somou 3 e 4 e o ' = ' atribuiu à soma
        double subtracao = 15.65 - 3.0004; // Operador ' - ' subtraiu 3,0004 de 15,65 e o ' = ' atribuiu à subtracao
        float multplicacao = 3f * 75.77F; // Operador ' * ' multiplicou 3 com 75,77 e ' = ' atribuiu à multiplicacao
        int divisao = 15 / 3; // Operador ' / ' dividiu 5 por 3 e o ' = ' atribuiu o resultado à divisao
        int resto = 15 % 7; // Operador mod que retorna o resto da divisão de 15 por 8
    
        // O operador aritmético ' + ' quando usado em strings assume o papel de concatenador
        String meuNomeCompleto = meuNome + " Firmino";
        System.out.println(meuNomeCompleto);

        // Concatenação de tipo String e tipo numerico (int, double, long, ...)
        String concatenacao;
        concatenacao = 1 + " 2" + " 3";
        System.out.println("Valor da concatenação de números e strings: " +concatenacao);

        // Operadores unários (+, -, ++, --, !)
        System.out.println("Variável idade negativa (-): " + (-idade)); // Uso do ( - ) para alterar o sinal 
        System.out.println("Variável idade incrementada (++): " + (++idade)); // Uso do ( ++ ) para incrementar +1
        System.out.println("Variável idade decrementada (--): " + (--idade)); // Uso do ( -- ) para decrementar -1
        System.out.println("Variável who negada: " + !who); // Uso do ( ! ) para negar o valor booleano
    
        // Operadores ternários (? e :) são análogos ao if e else e relacionais (==, !=, <, >, <=, >=)

        /* if (soma == idade) {
              concatenacao = "verdadeiro";
         else {
              concatenacao = "falso";
        }  */

        concatenacao = (soma == idade) ? "verdadeiro" : "falso";
        System.out.println("Valor da variável concatenacaoo: " + concatenacao);

        // relacional de igualdade e desigualdade
        concatenacao = (soma == idade) ? "verdadeiro" : "falso";
        System.out.println("soma é igual (==) a idade?: " + concatenacao);

        concatenacao = (soma != idade) ? "verdadeiro" : "falso";
        System.out.println("soma é diferente (!=) de idade?: " + concatenacao);

        // relacional maior/menor
        concatenacao = (soma >= idade) ? "verdadeiro" : "falso";
        System.out.println("soma é maior ou igual (>=) a idade?: " + concatenacao);

        concatenacao = (soma <= idade) ? "verdadeiro" : "falso";
        System.out.println("soma é menor ou igual (<=) a idade?: " + concatenacao);

        // Operadores lógicos 'e' e 'ou' (&& e ||) 
        if(who && why){
            System.out.println("Condicional (&&) válida!");
        }
        if(who || why){
            System.out.println("Condicional (||) válida!");
        }





    }
}
