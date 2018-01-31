import com.elioCamison.bigNumber.BigNumber;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigNumber n1 = new BigNumber("500");
        BigNumber n2 = new BigNumber("500");
        //7597597597597595158042042039597590

        System.out.println(n1.add(n2));
        System.out.println(n1.compareTo(n2));

        /*BigInteger pruebas = new BigInteger("234890456345345345345345234456456456345345");
        BigInteger pruebas2 = new BigInteger("1228");


        System.out.println(pruebas.multiply(pruebas2));*/




    }
}
