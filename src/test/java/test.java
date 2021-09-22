import com.coordinate.Util.coordtrans;
import com.coordinate.service.ExcelOperate;
import com.coordinate.service.calculate;
import org.junit.Test;
import java.io.IOException;

public class test {
    @Test
    public void test() throws IOException {
        System.out.println(new calculate().compute(3923968.479,437998.907));

//        ExcelOperate excel = new ExcelOperate();
//        excel.Load("RizhaoToKuiShan.xlsx");
//        excel.Read();
//        excel.handler();
//        excel.Write();
    }
}
