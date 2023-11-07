package mthuy.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/extentreport/extentreport.html");
        reporter.config().setReportName("Extent Report | Minh Thuy");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Framework Name", "Selenium Java");
        extentReports.setSystemInfo("Author", "Minh Thuy");
        return extentReports;
    }

}
