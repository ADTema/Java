import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(128);
        qwe.add(126);
        System.out.println(Arrays.toString(qwe.array));
    }
}