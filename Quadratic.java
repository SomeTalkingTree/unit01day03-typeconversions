// TODO: rename variables so they're more meaningful
public class Quadratic {
    public static void main(String[] args) {
     Double num = Double.parseDouble(args[0]);
     Double num1 = Double.parseDouble(args[1]);
     Double num2 = Double.parseDouble(args[2]);
     Double test = num1 * -1;
     //b *-1
     Double test4 = Math.sqrt(Math.pow(num1,2)+(-4*num*num2));
     //squared b^2 - (4ac)
     Double part1 = test +test4;
     Double part2 = test - test4;
     Double ans1 = part1/(num * 2);
     Double ans2 = part2/(num * 2);
     System.out.println("A = "+num);
     System.out.println("B = "+ num1);
     System.out.println("C = "+ num2);
     System.out.println("One answer is "+ans1);
     System.out.println("Another anwser is "+ans2);
    }
}
