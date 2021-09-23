import com.coordinate.Util.coordtrans;
import com.coordinate.service.ExcelOperate;
import com.coordinate.service.calculate;
import org.junit.Test;
import java.io.IOException;

public class test {
    @Test
    public void test() throws IOException {
//        其实这里的x和y是反着来的，因为加上了带号，为了统一在计算类中反转
//        System.out.println(new calculate().compute(3923968.479,437998.907));

        ExcelOperate excel = new ExcelOperate();
        excel.Load("RizhaoToKuiShan.xlsx");
        excel.Read();
        excel.handler();
        excel.Write();
    }
}
