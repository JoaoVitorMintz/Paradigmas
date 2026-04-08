
// javac -g teste_circulo.java Ponto2D_06.java Circulo.java

public class teste_circulo{
    static void test_assert(boolean expr, String msg) {
        if (!expr) {
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();

            StackTraceElement caller = stack[2]; // quem chamou test_assert

            System.out.println(
                "[FALHA] " + msg +
                " em " + caller.getFileName() +
                ":" + caller.getLineNumber() +
                " metodo: " + caller.getMethodName()
            );
            System.exit(1); // PARA O TESTE SE FALHAR
        }

    }
    
    // Testa a operacao
    // verificar se um Ponto2D_06 está dentro de um círculo
    static void test_contains() {

        Ponto2D_06 p1 = new Ponto2D_06(3,4);
        Circulo_06 c1 = new Circulo_06(2.0, 2.0, 3.0);

        test_assert(c1.contains(p1) == true,"Ponto deveria estar dentro do Circulo");
       
        c1 = new Circulo_06(2.0, 0, 0);
        test_assert(c1.contains(p1) == false,"Ponto nao esta dentro do Circulo");

    }


    public static void main(String[] args) {

        System.out.println("Executando testes ...");
        System.out.println("================");

        test_contains();
        System.out.println("test_contains [PASS]\n");


        System.out.println("================");
        System.out.println("TODOS TESTES PASS");
    }
}