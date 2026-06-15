
public class minheap {

    int[] heap;
    int size;
    int capacity;
    minheap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }
    int parent(int i) {
        return (i - 1) / 2;
    }
    int left(int i) {
        return 2 * i + 1;
    }
    int right(int i) {
        return 2 * i + 2;
    }
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap overflow");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
    }
    public static void main(String[] args) {
 
        minheap h = new minheap(10);

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(20);
        h.insert(60);
        h.insert(70);

        System.out.println("Heap elements:");
        h.printHeap();
    }
}
