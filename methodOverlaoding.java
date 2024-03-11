class Overloading
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2)
    {
        return n1 + n2;
    }
}

public class methodOverlaoding {
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        int result = obj.add(2,5,6);
        System.out.println(result);
        double result3 = obj.add(3.5, 4.5);
        System.out.println(result3);
    }
}
