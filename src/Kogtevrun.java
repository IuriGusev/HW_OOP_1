public class Kogtevrun extends Hogwarts{
    private int smart;
    private  int wisdom;
    private int wit;
    private int creation;

    public Kogtevrun (String name, String surname, int magic, int transgression,
                      int smart, int wisdom, int wit, int creation){
        super (name, surname, magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Kogtevrun{" +
                super.toString() +
                ", smart = " + smart +
                ", wisdom = " + wisdom +
                ", wit = " + wit +
                ", creation = " + creation +
                '}';
    }
    public void compareTo(Kogtevrun other){
        int countThis = this.smart + this.wisdom + this.wit + this.creation;
        int countOther = other.smart + other.wisdom + other.wit + other.creation;
        if (countThis > countOther){
            printCamparableStudent(this, other);
        } else if (countThis < countOther) {
            printCamparableStudent(other, this);
        }else {
            System.out.println("студенты равны по возможностям");
        }
    }
    private void printCamparableStudent(Kogtevrun bestStudent, Kogtevrun badStudent){
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший студент Когтевран, чем " + badStudent.getName() + " " +
                badStudent.getSurname());
    }
}
