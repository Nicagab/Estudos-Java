
public class P0204Operadores {

    public static void main(String[] args) {
        int x = 15, y = 19;
        int soma = x + y;
        int sub = x - 10;
        int mul = y * 68;
        int divInteira = y / 2;
        double div = (64 * x - 12 * y) / 5.4321;
        int resto = y % 5;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(divInteira);
        System.out.println(div);
        System.out.println(resto);

        /*
           Operadores aritméticos:
           
           + | soma | a + b
           - | subtração | a - b
           * | multiplicação | a * b
           / | divisão | a / b
           % | resto da divisão | a % b
           ++ | incremento unitário | ++a ou a++
           -- | decremento unitário | --a ou a--
         */

         double k = 1.5, m = -1.9;
         boolean res0 = k == m;
         boolean res1 = k >= m;
         boolean res2 = k < m;
         boolean res3 = k != m;

        System.out.println(res0);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        /*
           Operadores relacionais:
           
            == | igual | a == b
            != | diferente | a != b
            > | maior | a > b
            >= | maior ou igual | a >= b
            < | menor | a < b
            <= | menor ou igual | a <= b
         */

        int n = 2, o = 3;
        boolean res4 = (n>0) && (o<0);
        boolean res5 = (n==o) || (o>0);
        boolean res6 = !res5;

        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);

        /*
           Operadores lógicos:
           
            && | e (and)| a && b
            || | ou (or)| a || b
            ! | não (not)| !a
            ^ | ou exclusivo (xor) | a ^ b
         */
    }
}
