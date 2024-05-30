package main.java.com.megicvet.model;

public class Dog extends Pet{

    private Size size;

    public Dog(){

    }

    public Dog(Size size){

        this.size = size;

    }

    @Override
    public String toString() {
        return "Pet {"
                + "type = " + super.getType()
                + ", sex = " + super.getSex()
                + ", age = " + super.getAge()
                + ", name = " + super.getName()
                + ", size = " + size
                + ", ownerName = " + super.getOwnerName()
                + ", petRegistrationDate = " + super.getReistrationDate().format(getFORMATTER())
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

        if (super.getType() != ((Pet) object).getType()){
            return false;
        }

        if (super.getSex() != ((Pet) object).getSex()){
            return false;
        }

        if (super.getName() != ((Pet) object).getName()){
            return false;
        }

        if (!super.getOwnerName().equals(((Pet) object).getOwnerName())){
            return false;
        }

        if (this.getSize() != ((Dog) object).getSize()){
            return false;
        }

        return super.getName() !=null ? super.getName().equals(((Pet) object).getName()) : ((Pet) object).getName() == null;
    }

    @Override
    public int hashCode(){
        int result = 13;
        result = 17 *
                getName().hashCode() *
                getAge().hashCode() *
                getSex().hashCode() *
                getType().hashCode() *
                getOwnerName().hashCode() *
                getSize().hashCode();
        return result;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public enum Size{

        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);
        private final int value;

        Size(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}

