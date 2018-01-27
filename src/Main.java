import com.elioCamison.bigNumber.BigNumber;

public class Main {

    public static void main(String[] args) {
        BigNumber n1 = new BigNumber("00022");
        BigNumber n2 = new BigNumber("090");

        /*String aux = n1.getNumero();

        for (int i = 0; i < aux.length(); i++) {
            System.out.println("Resultat de i " + i);

            if (i == aux.length()-1){
                System.out.println("hooooola");
            }
        }


        System.out.println(aux.length());*/

        //n1.compareTo(n2);

        System.out.println(n1.add(n2));
        System.out.println(n1.compareTo(n2));




    }
}
