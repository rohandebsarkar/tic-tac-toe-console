class array {
    static boolean equals(char[][] mod1, char[][] mod2) {
        return (mod1[0][0] == mod2[0][0] &&
                mod1[0][1] == mod2[0][1] &&
                mod1[0][2] == mod2[0][2] &&
                mod1[1][0] == mod2[1][0] &&
                mod1[1][1] == mod2[1][1] &&
                mod1[1][2] == mod2[1][2] &&
                mod1[2][0] == mod2[2][0] &&
                mod1[2][1] == mod2[2][1] &&
                mod1[2][2] == mod2[2][2]);
    }

    static char[][] copyarray(char[][] mod) {
        char[][] mod_rtrn = new char[3][3];
        mod_rtrn[0][0] = mod[0][0];
        mod_rtrn[0][1] = mod[0][1];
        mod_rtrn[0][2] = mod[0][2];
        mod_rtrn[1][0] = mod[1][0];
        mod_rtrn[1][1] = mod[1][1];
        mod_rtrn[1][2] = mod[1][2];
        mod_rtrn[2][0] = mod[2][0];
        mod_rtrn[2][1] = mod[2][1];
        mod_rtrn[2][2] = mod[2][2];
        return (mod_rtrn);
    }

    static boolean cpu_check(int[] mod_check, int inp) {
        for (int i = 0; i < 9; i++) {
            if (mod_check[i] == inp)
                return (false);
        }
        return (true);
    }
}