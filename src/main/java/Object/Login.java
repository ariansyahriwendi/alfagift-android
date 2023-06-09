package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Login extends BaseSetUp {

    private final By masuk = new By.ById("btn_login");
    public void setMasuk() {
        click(masuk);
    }

    private final By nomorHP = new By.ById("etPhonePontaNumber");
    public void setNomorHP(String x) {
        input(nomorHP, x);
    }

    private final By password = new By.ById("etPassword");
    public void setPassword(String x) {
        input(password, x);
    }

    private final By lanjut = new By.ById("btnNext");
    public void setLanjut() {
        click(lanjut);
    }

    private final By visiblePassword = new By.ById("imgPassword");
    public void setVisiblePassword() {
        click(visiblePassword);
    }

    private final By welcomeLogin = new By.ById("iv_shalma");
    public void setWelcomeLogin() {
        displayed(welcomeLogin);
    }

    private final By errorPasswordSalah = new By.ById("tvPasswordError");
    public void setErrorPasswordSalah() {
        displayed(errorPasswordSalah);
    }

    private final By errorDeviceTerhubung = new By.ById("txtTitle");
    public void setErrorDeviceTerhubung() {
        displayed(errorDeviceTerhubung);
    }

    private final By errorPhoneNumber = new By.ById("tvPhoneNumberError");
    public void setErrorPhoneNumber() {
        displayed(errorPhoneNumber);
    }

    private final By errorPassword = new By.ById("tvPasswordError");
    public void setErrorPassword() {
        displayed(errorPassword);
    }



}
