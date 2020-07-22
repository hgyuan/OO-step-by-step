package practice10;


public class Klass {
    private String displayName;
    private Integer number;
    private Student leader;

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

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void assignLeader(Student student) {
        if(!student.getKlass().number.equals(this.number)){
            System.out.printf("It is not one of us.\n");
            return ;
        }
        this.leader = student;
        return ;
    }


    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public Boolean isIn(Student student){
        return student.getKlass().getNumber().equals(this.number);
    }
}
