import com.elioCamison.bigNumber.BigNumber;

public class Main {

    public static void main(String[] args) {
        BigNumber n1 = new BigNumber("456235768978078934523523452345456");
        BigNumber n2 = new BigNumber("567456234578945345234234456");

        //n1.compareTo(n2);

        System.out.println(n1.add(n2));
        System.out.println(n1.compareTo(n2));




    }
}
