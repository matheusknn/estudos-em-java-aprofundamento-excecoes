public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println("Exceção Aritimética> algum número está inválido" + e.getMessage());
            e.getStackTrace();
        }catch (NullPointerException e) {
            System.out.println("a variável está nula verifique seu código " + e.getMessage());
        }catch (MinhaExcecao e) {
            System.out.println(e.getMessage());
        }
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("algum número está dando erro"); //instanciando um erro
//        System.out.println("Fim do metodo2");
    }
}
