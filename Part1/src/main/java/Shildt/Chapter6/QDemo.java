package Shildt.Chapter6;

public class QDemo {

    public static void main(String[] args) {
        Queue queue1 = new Queue(10);
        for(int i = 0; i < 10; i++){
            queue1.put((char) ('A' + i));
        }
        char[] letters = {'A', 'b', 'C'};
        Queue queue2 = new Queue(letters);
        Queue queue3 = new Queue(queue1);

        for(int i = 0; i < queue1.getQ().length; i++){
            System.out.print(queue1.get());
        }
        System.out.println();
        for(int i = 0; i < queue2.getQ().length; i++){
            System.out.print(queue2.get());
        }
        System.out.println();
        for(int i = 0; i < queue3.getQ().length; i++){
            System.out.print(queue3.get());
        }
    }

}
