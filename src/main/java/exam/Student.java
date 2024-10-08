package exam;

public class Student extends Customer{

    private long studentID;
    private static long studentCount;
    private final double DISCOUNT = .05;

    public Student(String name, Size size, Cloth[] clothingItems) {

        super(name, size, clothingItems);
        studentCount++;
        studentID = studentCount;

    }

    public Student(String name, Size size) {
        super(name, size);
        studentCount++;
        studentID = studentCount;
    }

    @Override
    public double printPriceAfterDiscount(Cloth cloth) {
        return 0;
    }
    public static void printStudentsCount(){
        System.out.println("We have created " + studentCount + "students in our database successfully");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", DISCOUNT=" + DISCOUNT +
                '}';
    }
}
