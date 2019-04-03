import java.util.Arrays;

public class BitsetTest {
    @org.junit.Test
    public void Bitset() {
        Bitset qwe=new Bitset(32);// 128 это количество бит, тут будет 4 числа по 32 бита
        qwe.add(32); // 126 это номер бита который мы меняем
        qwe.accessory(1);
        System.out.println(Arrays.toString(qwe.array));
    }
}