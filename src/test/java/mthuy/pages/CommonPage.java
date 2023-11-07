package mthuy.pages;

public class CommonPage {
    public LoginPage loginPage;
    public DashboardPage dashboardPage;
    public DashboardPage getDashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }




}
