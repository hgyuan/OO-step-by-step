package practice10;


import java.util.List;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        if(classes!=null && classes.size()>0){
            String classList = "";
            for(Klass klass:classes){
                classList += klass.getNumber()+", ";
            }
            return super.introduce()+" I am a Teacher. I teach Class "+classList.substring(0,classList.length()-2)+".";
        }
        return super.introduce()+" I am a Teacher. I teach No Class.";
    }


    public String introduceWith(Student student) {
        for(Klass klass:classes){
            if(student.getKlass().getNumber().equals(klass.getNumber())){
                return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
            }
        }
        return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";

    }

    public boolean isTeaching(Student student) {
        for(Klass klass:classes){
            if(klass.isIn(student)){
                return true;
            }
        }
        return false;
    }
}
