package session1;

public class CountingBits {

    //method 1
    public int[] countBits(int number) {

        int[] bitsOf1sList = new int[number + 1];

        for (int num = 0; num <= number; num++) {
            int countBits1s = countBits1s(num);
            bitsOf1sList[num] = countBits1s;
        }

        return bitsOf1sList;
    }


    private int countBits1s(int num) {

        int counter = 0;
// classic method
//        while (num > 0) {
//            int quotient = num / 2;
//            counter += num % 2;
//            num = quotient;
//        }

// classic method
        while (num > 0) {
            //bitwise AND operator checks if the least significant bit is set
            // If it is set, increment the count
            counter += num & 1;

            // Right shift n to move to the next bit
            num = num >> 1;

            // The correlation between bitwise right shifting by 1 and division by 2 arises because, in binary representation, each right shift is equivalent to dividing the number by 2.
        }
        return counter;
    }

}
