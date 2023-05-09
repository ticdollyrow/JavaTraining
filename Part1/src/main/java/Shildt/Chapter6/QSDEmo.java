package Shildt.Chapter6;

public class QSDEmo {
    public static void main(String[] args) {
        char[] item = { 'c', 'l', 'w', 'a', 'r', 'e','f'};
        QuickSort qs1 = new QuickSort();
        qs1.sort(item);

        for (char sign:item){
            System.out.print(sign);
        }
    }
}

