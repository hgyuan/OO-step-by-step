package practice11;


import java.util.Observable;
import java.util.Observer;

public class Student extends Person implements Observer {
    private Klass klass;

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.klass.getLeader()!=null && this.klass.getLeader().getId().equals(this.getId())){
            return super.introduce()+" I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
        }else {
            return super.introduce()+" I am a Student. I am at Class "+klass.getNumber()+".";

        }
    }

    public void addToKlass(Klass klass){
        this.klass = klass;
        klass.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Teacher teacher = (Teacher)arg;
        teacher.say(o,this);
    }
}
