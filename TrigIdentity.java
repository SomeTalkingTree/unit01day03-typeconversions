// good
public class TrigIdentity {
    public static void main(String[] args) {
        Double theta = Double.parseDouble(args[0]);
        Double num = Math.pow(Math.sin(theta),2) + Math.pow(Math.cos(theta),2);
        System.out.println(num);
    }
}
