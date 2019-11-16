import java.util.Scanner;

class input {
    private static final Scanner sc = new Scanner(System.in);

    static int choice() {
        int ch = sc.nextInt();//choice
        switch (ch) {
            case 1:
                return (1);
            case 2:
                return (2);
            default:
                System.err.println("Wrong Input!");
                return (0);
        }
    }

    static int playerA(String A) {
        System.out.print("Enter Your Input (Player " + A + ") :- ");
        return (sc.nextInt());
    }

    static int playerB(String B) {
        System.out.print("Enter Your Input (Player " + B + " ) :- ");
        return (sc.nextInt());
    }

    static int cpu(char[][] mod, int[] mod_check) {
        int inp = cpu_player.input(mod, mod_check);
        System.out.println("CPU Input (Player O) :- " + inp);
        return (inp);
    }
}