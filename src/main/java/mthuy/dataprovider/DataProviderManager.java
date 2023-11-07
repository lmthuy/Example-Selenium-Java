package mthuy.dataprovider;

import mthuy.helpers.ExcelHelper;
import mthuy.helpers.SystemsHelper;
import org.testng.annotations.DataProvider;

public class DataProviderManager {

    @DataProvider(name = "data_provider_login_from_excel", parallel = true)
    public Object[][] dataLoginHRMFromExcel() {

        ExcelHelper excelHelpers = new ExcelHelper();

        Object[][] data = excelHelpers.getDataHashTable(SystemsHelper.getCurrentDir() + "data/Login.xlsx", "Sheet1",1,3);

        return data;
    }
}
