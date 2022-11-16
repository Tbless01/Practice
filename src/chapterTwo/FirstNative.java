package chapterTwo;

public class FirstNative {
    public static void main(String[] args) {
        Native studentOne = new Native();

        studentOne.setName("Shola");

        studentOne.setAge(24);

        studentOne.setStudentID("228383738923");
        System.out.println(studentOne.getName()+" of "+studentOne.getAge()+" years old has "+studentOne.getStudentID()+ " ID ");

    }
}
