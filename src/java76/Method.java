
package java76;


public class Method {
    public int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public int subNumber(int a, int b){
        int sub = a - b;
        return sub;
    }
    
    public int multNumber(int a, int b){
        int multi = a * b;
        return multi;
    }
    public double divNumber(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        int a = 21, b = 23;
        
        Method obj = new Method();
        
        int result = obj.addNumber(a, b);
        System.out.println("Sum is: "+ result);
        
        int sub = obj.subNumber(a, b);
        System.out.println("Sub is: "+ sub);
        
        int multi = obj.multNumber(a, b);
        System.out.println("Multi is: "+ multi);
        
        double div = obj.divNumber(a, b);
        System.out.println("div is: "+ div);
    }
}
