import com.elioCamison.bigNumber.BigNumber;

public class Main {

    public static void main(String[] args) {
        BigNumber n1 = new BigNumber("34535233");
        BigNumber n2 = new BigNumber("04533453");



        /*String aux1 = n1.getNumero();
        String aux2 = n2.getNumero();

        int cont =aux1.length() - aux2.length();
        System.out.println(cont);*/

        //System.out.println(aux.length());

        //n1.compareTo(n2);

        System.out.println(n1.sub(n2));
        System.out.println(n1.compareTo(n2));




    }
}
