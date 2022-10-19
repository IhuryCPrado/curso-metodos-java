public class Agiota {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getJurosDuasParcelas() {
        return 0.3;
    }

    public static double getJurosTresParcelas() {
        return 0.45;
    }

    public static void cobrar(double valor, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = valor + (valor * getJurosDuasParcelas());

            System.out.println("Você me deve " + valorFinal + " pilas, morô?");
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getJurosTresParcelas());

            System.out.println("Você me deve " + valorFinal + " pilas, morô?");
        } else {
            System.out.println("Não divido mais que isso não, amigo");
        }
    }
}