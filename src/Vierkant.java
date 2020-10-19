public class Vierkant {
    public static void main(String[] args) {

        int getal;
        int nwregel;
        int startrij;

        for (getal = 1; getal <= 9; getal++) {
            System.out.print(" 0");
            System.out.print(getal);
        }
        System.out.print(" 10");

        for (nwregel=1; nwregel<10; nwregel++) {
            startrij = nwregel * 10+1;
            System.out.println();
            for (getal = startrij; getal <= startrij+9; getal++) {
                System.out.print(" ");
                System.out.print(getal);
            }
        }
    }
}

