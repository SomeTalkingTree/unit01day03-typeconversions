// good 
class DoubleOps {
    public static void main(String[] args) {
        Double num = Math.abs(Double.parseDouble(args[0]));
        Double num1 = Math.abs(Double.parseDouble(args[1]));
        
        Double math = Math.pow(Double.parseDouble(args[0]),Double.parseDouble(args[0]));
        Double tech = Math.sqrt(Double.parseDouble(args[0]));
        
        Double says = Math.random();
        
        System.out.println("This is the value of the first number:"+ num);
        System.out.println("This is the value of the second number:"+ num1);
        System.out.println("This is the squared of the number:"+math);
       
        System.out.println("This is the root of "+args[1]+" of the number:"+tech);
       
        System.out.println("Random number:"+says);
       
    }
}