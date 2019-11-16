/**
 * A Tic Tac Toe Game
 *
 * @author Rohan Deb Sarkar
 * @version 1
 */
public class ttt {
    public static void main(String[] args) {
        char[][] mod = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        int ch = help.print();//choice
        module.print(mod);
        String A = "X";
        String B = "O";
        boolean game_end = false;
        int i = 1;
        int inp;//input
        int wnr = 0;//winner
        int[] mod_check = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (!game_end) {
            if (ch == 0)
                break;
            inp = (i % 2 == 1) ? input.playerA(A) : (ch == 1) ? input.cpu(mod, mod_check) : input.playerB(B);
            //preserving module
            char[][] prv_mod = array.copyarray(mod);
            mod = module.updtr(mod, inp, i);
            if (array.equals(prv_mod, mod))
                continue;
            mod_check[i - 1] = inp;
            module.print(mod);
            wnr = win.check(mod);
            game_end = !(wnr == 0);
            if (i == 9) {
                if (wnr == 0)
                    wnr = 'D';
                break;
            }
            i++;
        }
        if (wnr == 'A')
            System.out.println("Winner is 'X'");
        else if (wnr == 'B')
            System.out.println("Winner is 'O'");
        else if (wnr == 'D')
            System.out.println("It's A Draw. No One Won.");
        else
            System.err.println("ERROR : class-ttt, method-main, code-#1.\nPlease Restart The Game.");
        help.end_print();
    }
}
