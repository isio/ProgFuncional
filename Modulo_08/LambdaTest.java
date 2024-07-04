package Modulo_08;

public class LambdaTest {
    public static void main(String[] args) {
        Operaciones op = (num_1, num_2) -> System.out.println(num_1 + num_2);
        // op.imprimeSuma(377,1);

        LambdaTest lT = new LambdaTest();
        lT.miMethodo(op, 330, 44);

        lT.miMethodo((value_1, value_2) -> System.out.println("Val_1 " + value_1 + " Val_2 " + value_2), 22, 22);
        lT.miMethodo((value_1, value_2) -> System.out.println(value_1 + value_2), 22, 22);
        lT.miMethodo((value_1, value_2) -> System.out.println(value_1 * value_2), 22, 22);
        lT.miMethodo((value_1, value_2) -> System.out.println(value_1 / value_2), 22, 22);
        lT.miMethodo((value_1, value_2) -> System.out.println(value_1 - value_2), 22, 22);
    }

    public void miMethodo(Operaciones op, int param_1, int param_2) {
        op.imprimeOperacion(param_1, param_2);
    }
}
