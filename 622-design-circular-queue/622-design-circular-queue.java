class MyCircularQueue {
    int[] que;
    int front=-1,rear=-1,size=0,cap=0;
    public MyCircularQueue(int k) {
         que=new int[k];
            cap=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        if(front==-1 && rear==-1){
            front=0;
            rear=0;
            que[front]=value;
            size++;
        }
        else{
            rear=(rear+1)%cap;
            que[rear]=value;
            size++;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        else if(front==rear){
            front=-1;
            rear=-1;
            size--;
            return true;
        }
        else {
            front=(front+1)%cap;
            size--;
            return true;
        }
    }
    
    public int Front() {
        return front==-1?-1:que[front];
    }
    
    public int Rear() {
        return rear==-1?-1:que[rear];
    }
    
    public boolean isEmpty() {
        return size==0?true:false;
    }
    
    public boolean isFull() {
        return cap==size?true:false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */