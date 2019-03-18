
public class Tests {
    @org.junit.Test
    public void accessory() {
        Quaternion first = new Quaternion(10, -5, 0, 15);
        Quaternion second = new Quaternion(30, -15, 0, 45);
        Assert.assertTrue(first.accessory{1}.equalsRound(second, 1));
    }
}
