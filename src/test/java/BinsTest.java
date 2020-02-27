import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void TestBins() {
        Bins bins = new Bins(2, 12);
        Integer actual = bins.getBinMap().get(5);
        Integer notAKey = bins.getBinMap().get(1);
        Integer mapSize = bins.getBinMap().size();
        Assert.assertEquals(new Integer(0), actual);
        Assert.assertNull(notAKey);
        Assert.assertEquals(new Integer(11), mapSize);
    }

    @Test
    public void TestGetBinValues() {
        Bins bins = new Bins(2, 12);
        Integer expected = 2;
        bins.getBinMap().replace(5, expected);
        Integer actual = bins.getBinsValue(5);
        Integer zeroValue = bins.getBinsValue(12);
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(new Integer(0), zeroValue);
    }

    @Test
    public void TestIncrementBins(){
        Bins bins = new Bins(5, 30);
        bins.getBinMap().replace(7, 8);
        bins.incrementBin(7);
        Integer actual = bins.getBinsValue(7);
        bins.incrementBin(5);
        Integer actualBin = bins.getBinsValue(5);
        Assert.assertEquals(new Integer(9), actual);
        Assert.assertEquals(new Integer(1), actualBin);
    }
}