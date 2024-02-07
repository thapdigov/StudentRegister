package bean;

//* @author Behruz Tapdiqov
public class Student {

    private String name;
    private String surname;
    private String group;
    private int yas;

    public Student() {
    }

    public Student(String name, String surname, String group, int yas) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.yas = yas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYas() {
         if (yas == 0 && yas < 0) {
            throw new IllegalArgumentException("Yasi duzgun daxil edin!!!");
        }
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
       
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", group=" + group + ", yas=" + yas;
    }

}
