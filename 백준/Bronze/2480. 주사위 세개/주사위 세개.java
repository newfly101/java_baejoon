import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());

        int prise;

        if (n1 == n2 && n1 == n3) {
            prise = 10000 + n1 * 1000;
        } else if ( n1 == n2 || n1 == n3) {
            prise = 1000 + n1 * 100;
        } else if ( n2 == n3) {
            prise = 1000 + n2 * 100;
        } else {
            prise = Math.max(n1, Math.max(n2, n3))*100;
        }
        System.out.println(prise);
    }
}