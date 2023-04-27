package Structure;

public class Queue {
    char q[] ; // массив для хранения элементов очереди
    int putloc, getloc; //индексы для вставки и извлечения

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char sign){
        if(q.length == putloc){
            return;
        }
        q[putloc++] = sign;
    }

    char get(){
        if(putloc == getloc){
            return (char) 0;
        }
        return q[getloc++];
    }
}
