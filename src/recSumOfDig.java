public class recSumOfDig {
    public static void main(String[] args){
        int sum = sum(324345);
        System.out.println(sum);
    }
    // given a number, we have to find the sum of its digits using recursion
    static int sum(int number){
        if(number<10){
            return number;
        }
        int num = number%10;
        int newNum = (number -num)/10;
        // or
        // if(newNum == 0){
        //     return number;
        // }
        return num+ sum(newNum);
    }

    // similarly, we can do product of digits as well
}
