public class Main{
  public static void main(String[] args){
    System.out.println("-4 and -17 are in quadrant " + StaticMethod.calc(-4, -17));
    System.out.println("4 and -17 are in quadrant " + StaticMethod.calc(4, -17));
    System.out.println("4 and 17 are in quadrant " + StaticMethod.calc(4, 17));
    System.out.println("-4 and 17 are in quadrant " + StaticMethod.calc(-4, 17));
    System.out.println("0 and 0 are in quadrant " + StaticMethod.calc(0, 0));

    System.out.println("a is a vowel: " + StaticMethod.isVowel("a"));
    System.out.println("e is a vowel: " + StaticMethod.isVowel("e"));
    System.out.println("i is a vowel: " + StaticMethod.isVowel("i"));
    System.out.println("o is a vowel: " + StaticMethod.isVowel("o"));
    System.out.println("u is a vowel: " + StaticMethod.isVowel("u"));
    System.out.println("A is a vowel: " + StaticMethod.isVowel("A"));
    System.out.println("t is a vowel: " + StaticMethod.isVowel("t"));
  }
}
