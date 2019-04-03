import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(65);// 128 это количество бит, тут будет 4 числа по 32 бита
        qwe.add(17); // 126 это номер бита который мы меняем
        System.out.println(Arrays.toString(qwe.array));
        qwe.remuve(17);
        System.out.println(Arrays.toString(qwe.array));
    }
}