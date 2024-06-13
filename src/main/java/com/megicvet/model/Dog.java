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
                + ", size = " + getSize()
                + ", ownerName = " + super.getOwnerName()
                + ", petRegistrationDate = " + super.getReistrationDate().format(getFORMATTER())
                + "}";
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

        public static Size fromString(String value) {
            for(Size size : values()) {
                if (size.toString().equals(value)){
                    return size;
                }
            }

            System.out.println("Unable to parse value '" + value
                    + "'. Using default value: " + UNKNOWN);

            return UNKNOWN;
        }
        public int getValue() {
            return value;
        }
    }
}

