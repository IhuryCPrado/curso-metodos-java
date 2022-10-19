public class Main {

    public static void main(String[] args) {

        //Imitação
        System.out.println("Cálculos Básicos");
        Imitacao.operacoes(16, 7);


        //Cumprimento
        System.out.println("Palavinha Mágica");
        Cumprimento.cumprimente(7);
        Cumprimento.cumprimente(14);
        Cumprimento.cumprimente(21);


        //Empréstimo
        System.out.println();
        Agiota.cobrar(3500, Agiota.getDuasParcelas());
        Agiota.cobrar(3500, Agiota.getTresParcelas());
        Agiota.cobrar(3500, 5);
    }
}
