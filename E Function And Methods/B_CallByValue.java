// Call by value 

public class B_CallByValue {

    public static void swap(int a,int b){
        //swap
        int temp = a;
        a=b;
        b=temp;
        return;
    }

    public static void main(String[] args) {
        int a= 5;
        int b=10;
        swap(a,b);
        System.out.println("a ="+ a);
        System.out.println("b ="+b);
    }
}

// Output:-

//a =5
//b =10