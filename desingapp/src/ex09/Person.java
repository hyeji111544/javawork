package ex09;

public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String email;

    private Person(){}

    public static Person builder(){
        return new Person();
    }

    public Person id(Integer id){
        this.id = id;
        return this;
    }

    public Person name(String name){
        this.name = name;
        return this;
    }

    public Person age(Integer age){
        this.age = age;
        return this;
    }

    public Person email(String email){
        this.email = email;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}





