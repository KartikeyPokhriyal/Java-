import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Student katy = new Student(34, "Katy", "Perry", 10, new Marks(90, 100, 89));
        Student taylor = new Student(14, "Taylor", "Swift", 7, new Marks(99, 100, 78));
        Student ariana = new Student(64, "Ariana", "Grande", 6, new Marks(40, 67, 80));

        ArrayList<Student> students = new ArrayList<>();

        students.add(katy);
        students.add(taylor);
        students.add(ariana);

        System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return ((Integer)s1.getRoll_id()).compareTo(s2.getRoll_id());
            }
        });

      System.out.println(students);

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return ((Integer)s1.getMarks().getPainting()).compareTo(s2.getMarks().getPainting());
            }
        });

    }
}
