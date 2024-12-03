public class StackUsingArray{
    static class Stacka<T>{
        private T[] stackArray;
        private int top;
        private int capacity;
        
        @SuppressWarnings("unchecked")
        public Stacka(int capacity){
            this.capacity=capacity;
            this.top=-1;
            this.stackArray=(T[]) new Object[capacity];
        }

        public void push(T data){
            if(isFull()){
                System.out.println("Stack OverFlow");
            }else{
                stackArray[++top]=data;
                System.out.println(data + "pushed in the stack");
            }
        }

        public void pop(){
            if(isEmpty()){
                System.out.println("Stack UnderFlow");
            }else{
                top--;
                System.out.println("popped succesfully");
            }
        }

        public T peek(){
            if(isEmpty()){
                System.out.println("Stack UnderFlow");
                return null;
            }else{
                return stackArray[top];
            }
        }

        public boolean isEmpty(){
            if(top==-1)
                return true;
            return false;
        }

        public boolean isFull(){
            if(top==capacity-1)
                return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Stacka<Integer> stack = new Stacka<>(5);

        // Pushing elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Trying to push when the stack is full
        stack.push(40);  // Output: Stack OverFlow

        // Peeking the top element
        System.out.println("Top element is: " + stack.peek());  // Output: 30

        // Popping an element
        stack.pop();  // Output: popped succesfully

    }
}