class help {
    private static int choice() {
        System.out.println("Enter From Following Menu :-");
        System.out.println("1. Play With Computer(Player VS CPU).\n2. Play With A Person(Player VS Player).");
        return (input.choice());
    }

    static int print() {
        System.out.println("PLEASE READ THE INSTRUCTIONS :-");
        System.out.println("This is a Tic Tac Toe Game.");
        System.out.println("There Can Only Be Two Players. First Player-'X', Second Player-'O'");
        System.out.println("For Entering Your Input, Enter the the Number Of That Square(Between 1 to 9)");
        int ch = choice();//choice
        System.out.println("Enjoy Your Game!");
        return (ch);
    }

    static void end_print() {
        System.out.println("Thank You For Playing!");
        System.out.println("For Feedbak :- rohandebsarkar@gmail.com");
        System.out.println("VISIT :- 'programmingverse.blogspot.com'");
    }
}
