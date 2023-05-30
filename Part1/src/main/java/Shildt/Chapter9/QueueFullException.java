package Shildt.Chapter9;

public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int size){
        this.size = size;
    }

    public String toString(){
        return "Очередь заполнена " + size;
    }
}
