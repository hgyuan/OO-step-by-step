package practice07;

public class Klass {
    private String displayName;
    private Integer number;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class "+this.number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getNumber() {
        return number;
    }
}
