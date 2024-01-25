public class Main{
  public static void main(String[] args){
    System.out.println("-4 and -17 are in quadrant " + Quadrant.calc(-4, -17));
    System.out.println("4 and -17 are in quadrant " + Quadrant.calc(4, -17));
    System.out.println("4 and 17 are in quadrant " + Quadrant.calc(4, 17));
    System.out.println("-4 and 17 are in quadrant " + Quadrant.calc(-4, 17));
    System.out.println("0 and 0 are in quadrant " + Quadrant.calc(0, 0));
  }
}

