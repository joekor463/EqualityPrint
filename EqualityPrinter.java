public class IntEqualityPrinter {

        public static void main (String args []) {

            printEqual(1, 1, 1);
            printEqual(1, 1, 2);
            printEqual(-1, -1, -1);
            printEqual(1, 2, 3);
        }
        public static void printEqual(int first, int second, int third) {
            if ((first < 0)|(second < 0)|(third <0)) System.out.println ( "Invalid Value" );
            if ((first == second)&(second == third)) System.out.println ( "All number are equal" );
            if ((first != second)&(second != third)) System.out.println ( "All number are different" );
            System.out.println ( "Neither all are equal or different" );
        }
                //System.out.println ( minutes + " minutes = "+ years +" y " + days + " d ");
}


