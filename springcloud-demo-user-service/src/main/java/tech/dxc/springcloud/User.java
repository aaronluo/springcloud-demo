package tech.dxc.springcloud;

public class User {

    private String loginName;
    private String name;
    private String avater;
    private String memos;
    
    public User() {}

    public User(String loginName, String name, String avater, String memos) {
        super();
        this.loginName = loginName;
        this.name = name;
        this.avater = avater;
        this.memos = memos;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater;
    }

    public String getMemos() {
        return memos;
    }

    public void setMemos(String memos) {
        this.memos = memos;
    }
    
    
}
