public class Subject {
    private String code;
    private String name;
    private Result result;

    public Subject() {

    }

    public Subject(String code, String name, Result result) {
        this.code = code;
        this.name = name;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String toString() {
        return this.name + " with code "
                + this.code + " with result "
                + result.toString();
    }
}
