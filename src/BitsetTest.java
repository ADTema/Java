import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(32);// 128 это количество бит, тут будет 4 числа по 32 бита
        qwe.add(32); // 126 это номер бита который мы меняем
        qwe.add(30);
        Bitset qw=new Bitset(32 );
        qw.add(32);
        qw.add(31);
        qwe.intersection(qw);
        System.out.println(Arrays.toString(qwe.array));
        System.out.println(Arrays.toString(qw.array));

    }
}