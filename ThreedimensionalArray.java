public class ThreedimensionalArray {
    public static void main(String a[])
    {
        int nums[][][] = new int[4][3][4];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                for(int k = 0; k < nums[i][j].length; k++)
                {
                    nums[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        for(int n[][] : nums)
        {
            for(int m[] : n)
            {
                for(int o : m)
                {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
