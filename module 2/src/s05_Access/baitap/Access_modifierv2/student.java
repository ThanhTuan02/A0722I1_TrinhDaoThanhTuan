package s05_Access.baitap.Access_modifierv2;

public class student {
    private String name = "John";
    private String Class = "CO2";
    public student(){}

    public student(String name, String Class) {
        this.name = name;
       this.Class = Class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClass(String aClass) {
        Class = aClass;
    }
}
