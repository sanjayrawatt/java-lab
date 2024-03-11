class Students
{
    String name;
    int rollNo;
    int marks;
}

public class ArrayOfObjects
{
    public static void main(String a[])
    {
        Students s1 = new Students();
        s1.name = "sanjay";
        s1.rollNo = 58;
        s1.marks = 90;

        Students s2 = new Students();
        s2.name = "kobe";
        s2.rollNo = 24;
        s2.marks = 99;

        Students s3 = new Students();
        s3.name = "steph";
        s3.rollNo = 30;
        s3.marks = 98;
        
        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name  + ": " + students[i].rollNo + "RN " + students[i].marks);
        }
    }  
}
