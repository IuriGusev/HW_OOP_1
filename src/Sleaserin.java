public class Sleaserin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int powerLust;

    public Sleaserin (String name, String surname, int magic, int transgression,
                       int cunning, int determination, int ambition, int powerLust){
      super(name, surname, magic, transgression);
      this.cunning = cunning;
      this.determination = determination;
      this.ambition = ambition;
      this.powerLust = powerLust;
    }

    @Override
    public String toString() {
        return "Sleaserin{" +
                super.toString() +
                " cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", powerLust = " + powerLust +
                '}';
    }
    public void compareTo(Sleaserin other){
        int countThis = this.cunning + this.determination + this.ambition + this.powerLust;
        int countOther = other.cunning + other.determination + other.ambition + other.powerLust;
        if (countThis > countOther){
            printCamparableStudent(this, other);
        } else if (countThis < countOther) {
            printCamparableStudent(other, this);
        }else {
            System.out.println("студенты равны по возможностям");
        }
    }
    private void printCamparableStudent(Sleaserin bestStudent, Sleaserin badStudent){
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший студент Слизерин, чем " + badStudent.getName() + " " +
                badStudent.getSurname());
    }
}
