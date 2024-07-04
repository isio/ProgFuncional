package Modulo_07;

public class LambdaTest {

    public static void main(String[] args) {
        FunctionTest ft = () -> System.out.println("Hola Web!!!!");
        // ft.saludar();
        LambdaTest lT = new LambdaTest();

        lT.miMethodo(ft);
    }

    public void miMethodo(FunctionTest parametro) {
        parametro.saludar();
    }

}
