public class Tugas_Perulangan {
    public static void main(String[] args) {
        // loop while E
        int b = 1;
        int a = 1;
        while (a <= 5) {
            int x = 1;
            while (x <= 5) {
                System.out.print(a == x ? "0" : "*");
                x++;
            }
            System.out.println("");
            a++;
        }
        System.out.println();
        // loop for e
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j == i ? "0" : "*");
            }
            System.out.println("");
        }
        System.out.println();
        // loop do while
        do {
            int x = 1;
            do {
                System.out.print(b == x ? "0" : "*");
                x++;
            } while (x <= 5);
            System.out.println();
            b++;
        } while (b <= 5);
        System.out.println();
        // loop while c
        int c = 1;
        while (c <= 5) {
            int x = 1;
            while (x <= 5) {
                System.out.print(x == 5 ? "0" : "*");
                x++;
            }
            System.out.println();
            c++;
        }
        System.out.println();
        // loop for
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j == 5 ? "0" : "*");
            }
            System.out.println();
        }
        System.out.println();
        // loop do while
        int d = 1;
        do {
            int x = 1;
            do {
                System.out.print(x == 5 ? "0" : "*");
                x++;
            } while (x <= 5);
            System.out.println();
            d++;
        } while (d <= 5);
        System.out.println();
        // loop while d
        int e = 1;
        while (e <= 5) {
            int x = 1;
            while (x <= 5) {
                System.out.print(e == 1 || x == 1 ? "0" : "*");
                x++;
            }
            System.out.println();
            e++;
        }
        System.out.println();
        // loop for
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i == 1 || j == 1 ? "0" : "*");
            }
            System.out.println();
        }
        System.out.println();
        // loop do while
        int f = 1;
        do {
            int x = 1;
            do {
                System.out.print(f == 1 || x == 1 ? "0" : "*");
                x++;
            } while (x <= 5);
            System.out.println();
            f++;
        } while (f <= 5);
        System.out.println();
        // loop while f
        int g = 1;
        while (g <= 5) {
            int x = 1;
            while (x <= 5) {
                System.out.print(g == 5 || x ==5 ? "0" : "*");
                x++;
            }
            System.out.println();
            g++;
        } 
        System.out.println();
        // loop for
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i == 5 || j == 5 ? "0" : "*");
            }
            System.out.println();
        }
        System.out.println();
        // loop do
        int h = 1;
        do {
            int x = 1;
            do {
                System.out.print(h == 5 || x == 5 ? "0" : "*");
                x++;
            } while (x <= 5);
            System.out.println();
            h++;
        } while (h <= 5);
    }
}