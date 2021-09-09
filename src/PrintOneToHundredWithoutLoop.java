
/**
 * print 1 to 100 without any loop
 */


public class PrintOneToHundredWithoutLoop {
    public static void main(String[] args) {

        int n = 1;
        print(n);
        
    }

    public static void print(int n){


        if(n > 100){
            return;
        }

        System.out.println(n);
        n++;
        print(n);
        

    }
    
}
