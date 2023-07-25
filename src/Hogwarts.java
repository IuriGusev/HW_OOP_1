public abstract class Hogwarts {
    private String name;
    private String surname;
    private int magic;
    private int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return  " name = '" + name + '\'' +
                "', surname = '" + surname + '\'' +
                "', magic = " + magic +
                ", transgression = " + transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void compareTo(Hogwarts other){
        int countThis = this.magic + this.transgression;
        int countOther = other.magic + other.transgression;
        if (countThis > countOther){
            printCamparableStudent(this, other);
        } else if (countThis < countOther) {
            printCamparableStudent(other, this);
        }else {
            System.out.println("студенты равны по возможностям");
        }
    }
    private void printCamparableStudent(Hogwarts bestStudent, Hogwarts badStudent){
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучший студент Хогвардца, чем " + badStudent.getName() + " " +
                badStudent.getSurname());
    }
}

