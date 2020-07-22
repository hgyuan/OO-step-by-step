package practice09;

public class Student extends Person {
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
}
