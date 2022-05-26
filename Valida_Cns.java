package gerador_cns;

public class Valida_Cns {
    /*Classe de validação para verificar se o CNS é valido
    FONTE: integracao.esusab.ufsc.br/ledi/documentacao/regras/algoritmo_CNS.html
    */
    public boolean validacao(String cns) {
        float resto, soma;

        soma = ((Integer.valueOf(cns.substring(0, 1)).intValue()) * 15) +
                ((Integer.valueOf(cns.substring(1, 2)).intValue()) * 14) +
                ((Integer.valueOf(cns.substring(2, 3)).intValue()) * 13) +
                ((Integer.valueOf(cns.substring(3, 4)).intValue()) * 12) +
                ((Integer.valueOf(cns.substring(4, 5)).intValue()) * 11) +
                ((Integer.valueOf(cns.substring(5, 6)).intValue()) * 10) +
                ((Integer.valueOf(cns.substring(6, 7)).intValue()) * 9) +
                ((Integer.valueOf(cns.substring(7, 8)).intValue()) * 8) +
                ((Integer.valueOf(cns.substring(8, 9)).intValue()) * 7) +
                ((Integer.valueOf(cns.substring(9, 10)).intValue()) * 6) +
                ((Integer.valueOf(cns.substring(10, 11)).intValue()) * 5) +
                ((Integer.valueOf(cns.substring(11, 12)).intValue()) * 4) +
                ((Integer.valueOf(cns.substring(12, 13)).intValue()) * 3) +
                ((Integer.valueOf(cns.substring(13, 14)).intValue()) * 2) +
                ((Integer.valueOf(cns.substring(14, 15)).intValue()) * 1);

        resto = soma % 11;

        if (resto != 0) {
            return (false);
        } else {
            return (true);
        }
    }
}
