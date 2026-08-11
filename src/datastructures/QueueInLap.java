package datastructures;

public class QueueInLap {
	String queueArr[];
	int front;
	int rear;

	public QueueInLap(int capacity) {
		int queueCapacity = capacity;
		queueArr = new String[queueCapacity];
		front = 0;
		rear = -1;
		
	}
	public void enqueue(String com) {
		if(rear == queueArr.length -1) {
			System.out.println("Queue is full");
			return;
		}
		queueArr[++rear] = com;
		System.out.println("Enqueued element is:" + queueArr[rear]);
	}
	
	public String pick() {
		String c1 = null;
		if(front > rear) {
			System.out.println("Queue is empty");
		}
		else {
			c1 = queueArr[front];
			System.out.println("Element picked is:" + c1);
		}
		return c1;
	}

	public static void main(String[] args) {
		QueueInLap queues = new QueueInLap(18);
		
		queues.enqueue("A");
		queues.enqueue("B");
		queues.enqueue("C");
		queues.enqueue("C1");
		queues.enqueue("C2");
		queues.enqueue("D");
		queues.enqueue("P");
		queues.enqueue("Q");
		queues.enqueue("T");
		queues.enqueue("T1");
		queues.enqueue("W");
		queues.enqueue("Y");
		queues.enqueue("Z");
		
		queues.pick();
	}

}
