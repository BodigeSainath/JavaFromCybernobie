package demo.CgJavaBook.InheritanceNDpolymorphsim.ex1;

public class Person  extends Account{
    private String name;
    private float age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }

public  Person(String name,float age){
        this.name=name;
        this.age=age;
}
}
