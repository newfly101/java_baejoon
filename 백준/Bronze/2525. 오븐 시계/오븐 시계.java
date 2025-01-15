import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());

        H = ( H + M / 60 ) % 24;
        M %= 60;

        System.out.println(H + " " + M);
    }
}