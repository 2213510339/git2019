package designmodel.prototype;

public class Mail implements Cloneable{
    // 标题
    private String title;
    // 内容
    private String context;
    // 收件人
    private String name;
    // 称谓
    private  String application;
    // 邮件尾部的版权
    private String tail;
    public Mail(AdTemplate adTemplate) {
       this.title = adTemplate.getAdTitle();
        this.context = adTemplate.getAdContext();
    }

    @Override
    public Mail clone()  {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
