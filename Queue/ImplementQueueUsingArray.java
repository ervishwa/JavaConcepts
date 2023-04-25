package JavaConcepts.Queue;

class QueueArray{
    int size ;
    int Array[];
    int front = -1;
    int rear = -1;

    QueueArray(int n){
        size = n ;
        Array = new int[n];
    }

    void enque(int num ){
        //adding in Queue
//        if(rear<=size-1) {
//           if(front==-1) front++;
//           rear++;
//           Array[rear] = num;
//        }else{
//            System.out.println("Queue is Full !");
//        }
        if(rear==size-1) System.out.println("Queue IS Full !");
        else{
            if(front==-1) front++;
            rear++;
            Array[rear] = num;
        }

    }
    void deque(){
        //removing from the queue.
        if(front<=rear && front!=-1){
            System.out.println("removing Element: "+Array[front]);
            front++;
        }else{
            System.out.println("Queue is Empty !");
        }
    }
    void peek(){
        if(front>rear || front==-1){
            System.out.println("Queue is Empty !");
        }else{
            System.out.println("peek Element : "+Array[front]);
        }
    }


}
public class ImplementQueueUsingArray {
    public static void main(String[] args) {

        QueueArray myqueue = new QueueArray(5);

        myqueue.enque(10);
        myqueue.enque(20);
        myqueue.enque(30);
        myqueue.enque(40);
        myqueue.enque(50);
        myqueue.enque(60);
        myqueue.peek();
        myqueue.deque();
        myqueue.peek();

    }
}
