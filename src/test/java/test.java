import com.coordinate.Util.coordtrans;
import com.coordinate.service.ExcelOperate;
import com.coordinate.service.calculate;
import org.junit.Test;
import java.io.IOException;

public class test {
    @Test
    public void test() throws IOException {
        System.out.println(new calculate().compute(45.5,56.6));

        ExcelOperate excel = new ExcelOperate();
        excel.Load("RizhaoToKuiShan.xlsx");
        excel.Read();
//        excel.Write();
    }
}
