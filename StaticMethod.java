public class StaticMethod{
    public static int calc(double x, double y){
        if (x > 0 && y > 0){
            return 1;
        }
        else if (x > 0 && y < 0){
            return 4;
        }
        else if (x < 0 && y > 0){
            return 2;
        }
        else if (x < 0 && y < 0){
            return 3;
        }
        return 0;
    }
    public static boolean isVowel(String s){
      if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") || s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("u")){
        return true;
      }
      return false;
    }
}
