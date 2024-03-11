public class multiDimensional {
    public static void main(String a[]) {
        int nums[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print(nums[i][j] + " "); // Use print instead of println
            }
            System.out.println(); // Add a newline after each row
        }

        System.out.println();
        
        for(int n[] : nums) {
            for(int m : n) { // Specify the type of elements m
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
