package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class comparator {
    static void main(String[] args) {
        Student Ivan = new Student(188);
        Student Roma = new Student(190);
        Student[] students = new Student[]{Roma, Ivan};
        System.out.println(Arrays.toString(students));

        //System.out.println(Roma.getHight() - Ivan.getHight());
        //System.out.println(compare(Roma, Ivan));

        Comparator<Student> studentComparator = (st1, st2) -> st1.getHight()- st2.getHight();

        System.out.println(studentComparator.compare(Roma, Ivan));
        sortStudents(students, studentComparator);
        System.out.println(Arrays.toString(students));
     }

     public static int compare(Student st1, Student st2){
        return st1.getHight() - st2.getHight();

    }

    public static void sortStudents (Student[] students, Comparator<Student> comparator){
        //190, 188
       int result = comparator.compare(students[0], students[1]);
       if(result>0)
       {
           //temp save
           Student temp = students[0];
           students[0] = students[1];
           students[1] = temp;
       }

    }
}
