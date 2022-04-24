public class evenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {21, 435, 6567, -54, -6, 67};
        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int[] arr){
        int count = 0;
        for (int number: arr){
            if(number< 0){
                number = number*-1;
            }
            if(Integer.toString(number).length()%2 == 0){
                count += 1;
            }
        }
        return count;
    }

}
