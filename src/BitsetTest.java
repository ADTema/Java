import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(33);// 128 это количество бит, тут будет 4 числа по 32 бита
        qwe.add(33); // 126 это номер бита который мы меняем
        Bitset qw=new Bitset(32);
        qw.add(30);
        qw.association(qwe);
        System.out.println(Arrays.toString(qwe.array));
    }
}