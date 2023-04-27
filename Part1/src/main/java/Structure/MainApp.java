package Structure;

public class MainApp {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char sign;

        for(int i = 0; i < 26; i++)
            bigQ.put((char) ('А' + i));

        for(int i=0; i < 26; i++) {
            sign = bigQ.get();
            if (sign != (char) 0) System.out.print(sign);
        }
        System.out.println();

        for (int i = 0; i < 5; i++){
            smallQ.put((char) ('Z' - i));
        }
    }
}
