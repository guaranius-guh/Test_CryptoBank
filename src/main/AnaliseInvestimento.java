package main;

public class AnaliseInvestimento {

    public boolean analisarInvestimento(PerfilInvestidor perfil, double variacao) {
        double riscoMaximo;
        switch (perfil) {
            case CONSERVADOR:
                riscoMaximo = 0.1;
                break;
            case MODERADO:
                riscoMaximo = 0.3;
                break;
            case OUSADO:
                riscoMaximo = 0.5;
                break;
            default:
                throw new IllegalArgumentException("Perfil desconhecido");
        }

        System.out.println("Variação da criptomoeda: " + String.format("%.2f", variacao * 100) + "%");

        if (Math.abs(variacao) <= riscoMaximo) {
            System.out.println("Investimento recomendado para o perfil " + perfil);
            return true;
        } else {
            System.out.println("Investimento não recomendado para o perfil " + perfil);
            return false;
        }
    }
}
