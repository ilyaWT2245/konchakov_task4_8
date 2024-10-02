public class Main {
    public static void main(String[] args) {
        Pythagoras(20);
    }

    public static void Pythagoras(int n){
        for (int i = 1; i <= n; i++){
            for ( int j = i; j <= n; j++){
                double d = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));
                if (d - (int)d == 0){
                    System.out.printf("(%d ,%d ,%.0f)\n", i, j, d);
                }
            }
        }
    }
}