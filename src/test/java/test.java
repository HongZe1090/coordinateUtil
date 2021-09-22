import com.coordinate.Util.coordtrans;
import com.coordinate.service.ExcelOperate;
import org.junit.Test;
import org.osgeo.proj4j.ProjCoordinate;

import java.io.FileNotFoundException;
import java.io.IOException;

public class test {
    @Test
    public void test() throws IOException {
        coordtrans test = new coordtrans();
        ProjCoordinate projCoordinate = new ProjCoordinate(121.976469682, 41.4470288037);
        test.coordtrans().transform(projCoordinate, projCoordinate);
        Double dNorth = projCoordinate.y;
        Double dEast = projCoordinate.x;
        System.out.print(dNorth);
        System.out.print("/");
        System.out.print(dEast);

        ExcelOperate excel = new ExcelOperate();
        excel.Load("RizhaoToKuiShan.xlsx");
        excel.Read();
    }
}
