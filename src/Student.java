class Marks {
    int physics;
    int chemistry;
    int painting;

    public Marks(int physics, int chemistry, int painting) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.painting = painting;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "physics=" + physics +
                ", chemistry=" + chemistry +
                ", painting=" + painting +
                '}';
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getPainting() {
        return painting;
    }
}

public class Student {
    int roll_id;
    String firstName;
    String lastName;
    int standard;
    Marks marks;

    public Student(int roll_id, String firstName, String lastName, int standard, Marks marks) {
        this.roll_id = roll_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.standard = standard;
        this.marks = marks;
    }

    public int getRoll_id() {
        return roll_id;
    }

    public Marks getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_id=" + roll_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", standard=" + standard +
                ", marks=" + marks +
                '}';
    }


}


