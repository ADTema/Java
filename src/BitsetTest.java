import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(96);// 128 это количество бит, тут будет 4 числа по 32 бита
        qwe.remuve(30); // 126 это номер бита который мы меняем
        System.out.println(Arrays.toString(qwe.array));
    }
}