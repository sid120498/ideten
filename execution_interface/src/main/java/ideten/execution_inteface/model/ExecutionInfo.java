package ideten.execution_inteface.model;

public class ExecutionInfo {
    private String code;
    private String id;
    private String lang;
    public ExecutionInfo(String id, String code, String lang, String callBackUrl){
        this.code = code;
        this.id = id;
        this.lang = lang;
    }

    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }
}
