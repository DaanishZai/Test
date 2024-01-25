class Quadrant{
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
}
