package practice08;

public class Person {
    protected String name;
    protected Integer age;
    protected Integer id;

    public Person(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Person)
            return this.id.equals(((Person)other).getId());
        return false;
    }
}
