import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(32);
        qwe.add(2);
        System.out.println(Arrays.toString(qwe.array));
    }
}