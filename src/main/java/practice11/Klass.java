package practice11;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Klass extends Observable {
    private String displayName;
    private Integer number;
    private Student leader;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;

//    @Override
//    public synchronized void addObserver(Observer o) {
//        if(o instanceof Student){
//            students.add((Student)o);
//            setChanged();
//            notifyObservers((Student)o);
//        }
//    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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
        if(teacher!=null){
            setChanged();
        }
        notifyObservers(teacher);
        return ;
    }


    public void appendMember(Student student) {
        student.addToKlass(this);
        if(teacher!=null){
            setChanged();
        }
        notifyObservers(teacher);
    }

    public Boolean isIn(Student student){
        return student.getKlass().getNumber().equals(this.number);
    }
}
