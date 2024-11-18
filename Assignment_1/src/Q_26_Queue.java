

public class Q_26_Queue {
    int[] Queue = new int[100];
    int F = -1;
    int R = -1;

    int Dequeue(int[] Queue) {

        if (F == -1 ) {
            System.out.println("Queue underflow");
            return -10000;
        } else {
            int y = Queue[F];
            F++;

            if (F > R) {
                F = R = -1;
            }return y;



        }
    }

    void Enqueue(int[] Queue, int e) {
        int elem = e;
        if (R == Queue.length - 1) {
            System.out.println("Queue overflow");

        } else {
            if(R == -1 ){
                R = F = 0;

            }else{
            R++;}
            Queue[R] = elem;

        }

    }

    public static void main(String[] args) {
        Q_26_Queue obj = new Q_26_Queue();
        obj.Enqueue(obj.Queue, 5);
        obj.Enqueue(obj.Queue, 10);
        obj.Enqueue(obj.Queue, 15);
        obj.Enqueue(obj.Queue, 20);

        System.out.println("First object of the Queue : "+obj.Dequeue(obj.Queue));
        System.out.println("Second object of the Queue : "+obj.Dequeue(obj.Queue));
        System.out.println("Third object of the Queue : "+obj.Dequeue(obj.Queue));
        System.out.println("Fourth object of the Queue : "+obj.Dequeue(obj.Queue));


    }
}
