package Shildt.Chapter6;

public class QuickSort {
    public void sort(char[] item){
        qsort(item, 0, item.length - 1);
    }

    private void qsort(char[] item, int left, int right){
        int i = left;
        int j = right;
        char x = item[ (left + right) / 2];

        do{
            while (item[i] < x && i < right) i++;
            while (item[j] > x && j > left) j--;

            if(i<=j){
                char y = item[j];
                item[j] = item[i];
                item[i] = y;
                i++; j--;
            }

            if(left < j) qsort(item,left, j);
            if(right > i) qsort(item, i, right);

        }while (x<=j);
    }
}
