public class Operadores {

    public static void main (String[] args) throws Exception {
        // Operador de atribuição ' = '
        String meuNome = "Breno Max"; // atribuiu a srting Breno Max à variável meuNome
        int idade = 31; // atribuiu a idade 31 à variável idade

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
        System.out.println(concatenacao);
    }
}
