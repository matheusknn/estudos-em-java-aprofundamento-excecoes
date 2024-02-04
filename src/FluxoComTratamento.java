public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println("Exceção Aritimética> algum número está inválido" + e.getMessage());
            e.getStackTrace();
        }catch (NullPointerException e) {
            System.out.println("a variável está nula verifique seu código " + e.getMessage());
        }
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = i / 0;
            Conta c = null;
            c.exibeMensagemDeposito();
        }
        System.out.println("Fim do metodo2");
    }
}
