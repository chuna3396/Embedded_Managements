package Models;

public class TaiKhoan {

    public void setTdn(String tdn) {
        this.tdn = tdn;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public void setMk2(String mk2) {
        this.mk2 = mk2;
    }

    public void setnick(String nick) {
        this.nick = nick;
    }

    public String getTdn() {
        return tdn;
    }

    public String getMk() {
        return mk;
    }

    public String getMk2() {
        return mk2;
    }

    public Object getnick() {
        return nick;
    }
    private Object nick;
    private String tdn, mk, mk2;

    public TaiKhoan() {
        tdn = mk = "";
    }

    public TaiKhoan(String tdn, String mk) {
        this.tdn = tdn;
        this.mk = mk;
    }

}
