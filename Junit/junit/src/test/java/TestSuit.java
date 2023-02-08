import com.zemoso.junit.helper.ArraysCompareTest;
import com.zemoso.junit.helper.QuickBeforeAfter;
import org.junit.runner.JUnitCore;

public class TestSuit {
    public static void main(String[] args) {
        JUnitCore.runClasses(ArraysCompareTest.class, QuickBeforeAfter.class);
    }
}
