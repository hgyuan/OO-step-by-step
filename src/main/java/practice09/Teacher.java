package practice09;


public class Teacher extends Person {

    private Klass klass;


    public Teacher(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass!=null){
            return super.introduce()+" I am a Teacher. I teach Class "+klass.getNumber()+".";
        }
        return super.introduce()+" I am a Teacher. I teach No Class.";
    }


    public String introduceWith(Student student) {
        if(student.getKlass().getNumber().equals(this.klass.getNumber())){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";

    }

}
