// COnvert form Binary to decimal (n=101)

public class K_BinToDec {

    public static void binToDec(int binNum){
        int mynum = binNum;
        int pow = 0;
        int decimal = 0;

        while(binNum>0){
            int lastdigit= binNum % 10;

            decimal = decimal + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;

        }
        System.out.println("deicimal of "+ mynum + " is "+ decimal);
    }

    public static void main(String[] args) {
        binToDec(1010);
    }

}

// Output:-

// deicimal of 1010 is 10