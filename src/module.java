class module {
    static char[][] updtr(char[][] mod, int inp, int i) {
        //Initialising Variables
        char
                A = mod[0][0],
                B = mod[0][1],
                C = mod[0][2],
                D = mod[1][0],
                E = mod[1][1],
                F = mod[1][2],
                G = mod[2][0],
                H = mod[2][1],
                I = mod[2][2];
        if (inp == 1 && A == '1') {
            if (i % 2 == 1) {
                A = 'X';
            } else if (i % 2 == 0) {
                A = 'O';
            }
        } else if (inp == 2 && B == '2') {
            if (i % 2 == 1) {
                B = 'X';
            } else if (i % 2 == 0) {
                B = 'O';
            }
        } else if (inp == 3 && C == '3') {
            if (i % 2 == 1) {
                C = 'X';
            } else if (i % 2 == 0) {
                C = 'O';
            }
        } else if (inp == 4 && D == '4') {
            if (i % 2 == 1) {
                D = 'X';
            } else if (i % 2 == 0) {
                D = 'O';
            }
        } else if (inp == 5 && E == '5') {
            if (i % 2 == 1) {
                E = 'X';
            } else if (i % 2 == 0) {
                E = 'O';
            }
        } else if (inp == 6 && F == '6') {
            if (i % 2 == 1) {
                F = 'X';
            } else if (i % 2 == 0) {
                F = 'O';
            }
        } else if (inp == 7 && G == '7') {
            if (i % 2 == 1) {
                G = 'X';
            } else if (i % 2 == 0) {
                G = 'O';
            }
        } else if (inp == 8 && H == '8') {
            if (i % 2 == 1) {
                H = 'X';
            } else if (i % 2 == 0) {
                H = 'O';
            }
        } else if (inp == 9 && I == '9') {
            if (i % 2 == 1) {
                I = 'X';
            } else if (i % 2 == 0) {
                I = 'O';
            }
        } else {
            System.err.println("Wrong Input!");
            System.err.println("EITHER You Have Not Entered A Number From 1 to 9 OR You Have Entered A Number That Has Been Already Entered Previously");
            System.err.println("Enter Your Input Again.");
        }
        return (new char[][]{{A, B, C}, {D, E, F}, {G, H, I}});
    }

    static void print(char[][] mod) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + mod[i][j] + " | ");
            }
            System.out.print("\n -    -    -\n");
        }
    }
}