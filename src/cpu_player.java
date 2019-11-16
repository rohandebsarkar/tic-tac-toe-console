class cpu_player {
    static int input(char[][] mod, int[] mod_check) {
        char[][] letmod;
        //
        if (mod[1][1] == '5') {
            if (array.cpu_check(mod_check, 5))
                return (5);
        }
        //
        letmod = array.copyarray(mod);
        letmod[0][0] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 1))
                return (1);
        }
        letmod = array.copyarray(mod);
        letmod[0][1] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 2))
                return (2);
        }
        letmod = array.copyarray(mod);
        letmod[0][2] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 3))
                return (3);
        }
        letmod = array.copyarray(mod);
        letmod[1][0] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 4))
                return (4);
        }
        letmod = array.copyarray(mod);
        letmod[1][1] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 5))
                return (5);
        }
        letmod = array.copyarray(mod);
        letmod[1][2] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 6))
                return (6);
        }
        letmod = array.copyarray(mod);
        letmod[2][0] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 7))
                return (7);
        }
        letmod = array.copyarray(mod);
        letmod[2][1] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 8))
                return (8);
        }
        letmod = array.copyarray(mod);
        letmod[2][2] = 'O';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 9))
                return (9);
        }
        //
        letmod = array.copyarray(mod);
        letmod[0][0] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 1))
                return (1);
        }
        letmod = array.copyarray(mod);
        letmod[0][1] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 2))
                return (2);
        }
        letmod = array.copyarray(mod);
        letmod[0][2] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 3))
                return (3);
        }
        letmod = array.copyarray(mod);
        letmod[1][0] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 4))
                return (4);
        }
        letmod = array.copyarray(mod);
        letmod[1][1] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 5))
                return (5);
        }
        letmod = array.copyarray(mod);
        letmod[1][2] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 6))
                return (6);
        }
        letmod = array.copyarray(mod);
        letmod[2][0] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 7))
                return (7);
        }
        letmod = array.copyarray(mod);
        letmod[2][1] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 8))
                return (8);
        }
        letmod = array.copyarray(mod);
        letmod[2][2] = 'X';
        if (win.cpu_check(letmod)) {
            if (array.cpu_check(mod_check, 9))
                return (9);
        }
        //
        return (input_rndm(mod_check));
    }

    private static int input_rndm(int[] mod_check) {
        int rndm;
        while (true) {
            rndm = (int) ((Math.random() * 9) + 1);
            if (!(array.cpu_check(mod_check, rndm)))
                continue;
            break;
        }
        return (rndm);
    }
}