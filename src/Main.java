import com.elioCamison.bigNumber.BigNumber;

public class Main {

    public static void main(String[] args) {
        BigNumber n1 = new BigNumber("2");
        BigNumber n2 = new BigNumber("02");


        System.out.println(n1.add(n2));
    }
}
