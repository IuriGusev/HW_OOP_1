public class Griffindor extends Hogwarts{
private int nobility;
private int honor;
private int bravery;

public Griffindor (String name, String surname, int magic, int transgression,
                   int nobility, int honor, int bravery){
    super(name, surname, magic, transgression);
    this.nobility = nobility;
    this.honor = honor;
    this.bravery = bravery;
}
@Override
    public String toString (){
    return "Griffindor{" +
            super.toString() +
            ", nobility = " + nobility +
            ", honor = " + honor +
            ", bravery = " + bravery +
            '}';
}
    public void compareTo(Griffindor other){
    int countThis = this.nobility + this.honor + this.bravery;
    int countOther = other.nobility + other.honor + other.bravery;
    if (countThis > countOther){
            printCamparableStudent(this, other);
    } else if (countThis < countOther) {
        printCamparableStudent(other, this);
    }else {
        System.out.println("студенты равны по возможностям");
    }
    }
    private void printCamparableStudent(Griffindor bestStudent, Griffindor badStudent){
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
            " лучший студент Гриффиндора, чем " + badStudent.getName() + " " +
            badStudent.getSurname());
    }
}
