class win {
    static char check(char[][] mod) {
        char wnr;//winner
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
        //Checking  For Winner
        if (A == 'X' && B == 'X' && C == 'X')
            wnr = 'A';
        else if (D == 'X' && E == 'X' && F == 'X')
            wnr = 'A';
        else if (G == 'X' && H == 'X' && I == 'X')
            wnr = 'A';
        else if (A == 'X' && D == 'X' && G == 'X')
            wnr = 'A';
        else if (B == 'X' && E == 'X' && H == 'X')
            wnr = 'A';
        else if (C == 'X' && F == 'X' && I == 'X')
            wnr = 'A';
        else if (A == 'X' && E == 'X' && I == 'X')
            wnr = 'A';
        else if (C == 'X' && E == 'X' && G == 'X')
            wnr = 'A';

        else if (A == 'O' && B == 'O' && C == 'O')
            wnr = 'B';
        else if (D == 'O' && E == 'O' && F == 'O')
            wnr = 'B';
        else if (G == 'O' && H == 'O' && I == 'O')
            wnr = 'B';
        else if (A == 'O' && D == 'O' && G == 'O')
            wnr = 'B';
        else if (B == 'O' && E == 'O' && H == 'O')
            wnr = 'B';
        else if (C == 'O' && F == 'O' && I == 'O')
            wnr = 'B';
        else if (A == 'O' && E == 'O' && I == 'O')
            wnr = 'B';
        else if (C == 'O' && E == 'O' && G == 'O')
            wnr = 'B';
        else
            wnr = 0;
        return (wnr);
    }

    static boolean cpu_check(char[][] mod) {
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
        boolean bool;
        //Checking  For Winner
        if (A == 'X' && B == 'X' && C == 'X')
            bool = true;
        else if (D == 'X' && E == 'X' && F == 'X')
            bool = true;
        else if (G == 'X' && H == 'X' && I == 'X')
            bool = true;
        else if (A == 'X' && D == 'X' && G == 'X')
            bool = true;
        else if (B == 'X' && E == 'X' && H == 'X')
            bool = true;
        else if (C == 'X' && F == 'X' && I == 'X')
            bool = true;
        else if (A == 'X' && E == 'X' && I == 'X')
            bool = true;
        else if (C == 'X' && E == 'X' && G == 'X')
            bool = true;
        else if (A == 'O' && B == 'O' && C == 'O')
            bool = true;
        else if (D == 'O' && E == 'O' && F == 'O')
            bool = true;
        else if (G == 'O' && H == 'O' && I == 'O')
            bool = true;
        else if (A == 'O' && D == 'O' && G == 'O')
            bool = true;
        else if (B == 'O' && E == 'O' && H == 'O')
            bool = true;
        else if (C == 'O' && F == 'O' && I == 'O')
            bool = true;
        else if (A == 'O' && E == 'O' && I == 'O')
            bool = true;
        else bool = C == 'O' && E == 'O' && G == 'O';
        return (bool);
    }
}