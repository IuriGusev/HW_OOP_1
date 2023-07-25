public class Puffenduy extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Puffenduy (String name, String surname, int magic, int transgression,
                      int hardworking, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
    this.hardworking = hardworking;
    this.loyalty = loyalty;
    this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                super.toString() +
                ", hardworking = " + hardworking +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                '}';
    }
    public void compareTo(Puffenduy other){
        int countThis = this.hardworking + this.loyalty + this.honesty;
        int countOther = other.hardworking + other.loyalty + other.honesty;
        if (countThis > countOther){
            printCamparableStudent(this, other);
        } else if (countThis < countOther) {
            printCamparableStudent(other, this);
        }else {
            System.out.println("студенты равны по возможностям");
        }
    }
    private void printCamparableStudent(Puffenduy bestStudent, Puffenduy badStudent){
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший студент Пуффендуй, чем " + badStudent.getName() + " " +
                badStudent.getSurname());
    }
}
