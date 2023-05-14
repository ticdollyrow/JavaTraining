package Shildt.Chapter8;

public class CircularQueue implements ICharQ{
    private char[] q;
    private int getloc, putloc;

    CircularQueue(int size){
        putloc = getloc = 0;
        q = new char[size + 1];
    }
    @Override
    public void put(char ch) {
        //Очередь считается полной, если индекс putloc на единицу меньше
        //индекса getloc или если индекс putloc указывает 11 на конец массива, а индекс getloc - на его начало
        if(putloc+1 == getloc || ( putloc == q.length-1 && getloc == 0)){
            return;
        }
        q[putloc++] = ch;
        if(putloc == q.length) putloc = 0;
    }

    @Override
    public char get() {
        if(putloc == getloc)
            return (char) 0;

        char ch = q[getloc++];
        if(getloc == q.length) getloc = 0;
        return ch;
    }
}
