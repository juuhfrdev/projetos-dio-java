package edu.java.anatomia_de_classe;
public class AnatomiaClasse03
{
    public static void main(String[] args) 
    {
        String primeiroNome = "Julia";
        String segundoNome = "Freire";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome ,String segundoNome)
    {
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
/*
 * -------------- Estrutura de métodos --------------
 * 
 * Exemplos :
 * 1 - int somar (int numeroUm, int numero2)
 * 
 * 2 - String formatarCep (long cep)
 * 
 */