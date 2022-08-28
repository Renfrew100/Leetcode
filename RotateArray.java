public class RotateArray {
    public void rotate(int[] nums, int k){
        k = 3;
        int[] newArr = new int[7];
        int[] anotherArr = new int[7];

        int[] rotateRight = new int[7];
        int[] rotateRightAgain = new int[7];
        int[] rotateRightOnceAgain = new int[7];

        int[] output = new int[7];

        int[] output2 = new int[7];

        if(newArr == rotateRight){
            anotherArr = rotateRightAgain;
                anotherArr = output2;
                    anotherArr = rotateRightOnceAgain;
        }    
    }
}
