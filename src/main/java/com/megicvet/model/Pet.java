package main.java.com.megicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Pet {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");

    private String type;
    private String sex;
    private String age;
    private String name;
    private String ownerName;
    final private LocalDateTime reistrationDate = LocalDateTime.now();

    @Override
    public String toString() {
        return "Pet {"
                + "type = " + type
                + ", sex = " + sex
                + ", age = " + age
                + ", name = " + name
                + ", ownerName = " + ownerName
                + ", petRegistrationDate = " + reistrationDate.format(FORMATTER)
                + "}";
    }

    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }

        if (object == null || this.getClass() != object.getClass()){
            return false;
        }

        Pet pet = (Pet) object;

        if (this.type != ((Pet) object).getType()){
            return false;
        }

        if (this.sex != ((Pet) object).getSex()){
            return false;
        }

        if (this.age != ((Pet) object).getAge()){
            return false;
        }

        if (!this.ownerName.equals(((Pet) object).getOwnerName())){
            return false;
        }

        return this.name !=null ? this.name.equals(((Pet) object).getName()) : ((Pet) object).getName() == null;
    }

    @Override
    public int hashCode(){
        int result = 13;
        result = 17 *
                getName().hashCode() *
                getAge().hashCode() *
                getSex().hashCode() *
                getType().hashCode() *
                getOwnerName().hashCode();
        return result;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public LocalDateTime getReistrationDate() {
        return reistrationDate;
    }

    public static DateTimeFormatter getFORMATTER() {
        return FORMATTER;
    }
}
