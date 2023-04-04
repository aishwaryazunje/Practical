package assignments;

public class Student {
    private int id;
    private String name;
    private int age;
    private String department;

    public Student() {
        id = 0;
        name = "";
        age = 0;
        department = "";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        age = 0;
        department = "";
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        department = "";
    }

    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
