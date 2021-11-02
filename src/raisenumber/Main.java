package raisenumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(raiseNumber(12, 2));
    }

    public static int raiseNumber(int n, int p){
        if (p == 0){
            return 1;
        }

        return n * raiseNumber(n, p-1);
    }
}
