package Comparator;

public class Student {
    private int hight;

    public Student(int hight) {
        this.hight = hight;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return "Student{" +
                hight + "}";
    }
}
