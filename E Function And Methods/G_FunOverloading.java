// Function overloading using Data type


public class G_FunOverloading {
    // funtion to cal int sum
    public static int sum(int a,int b){
        return a+b;
    }

    // function to cal float sum
    public static float sum (float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,6));
        System.out.println(sum(4.5f, 3.4f));
        
    }
}

// Output:-

// 9
// 7.9