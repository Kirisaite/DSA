package kirisaite;


public class Stack {
	private int capacity;
	private int top = 0;
	private String[] storage;

	// constructor = initialize an object instance of the class
	public Stack(int size) {
		//assign the value of size to capacity
		capacity = size;
		storage = new String[capacity]; 
	}

	public void show() {
		//the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit 
		for(int i = capacity - 1; i >= 0; i--){
			System.out.println("Stack["+i+"] = "+ storage[i]);
			/* print like this: 
		      stack[9]   = 10th value
		      stack[8]   = 9th value
		      stack[7]   = 8rd value
		      ....  
		      stack[1]   = 2nd value
		      stack[0]   = 1st value
		      */
		  }
			 System.out.println();
		  }
		  
		  private boolean isEmpty() {
		    if (storage[0] == null) {
		      // print error message
		      System.out.println("ERROR, Storage is empty.");
		      return true;
		    } 
		    return false;
		  }

		  private boolean isFull() {
		    if (top == capacity) {
		    	System.out.println("ERROR, Storage is full.");
		      // print error message
		      return true;
		    } 
		    return false;
		  }

		  public void push(String value) {
		    if (isFull()) {
		    	System.out.println("ADD FAILED, Storage is full");
		      // print error message
		      System.out.println();
		    } else {
		      System.out.println("... trying to push on stack[" + top + "] ...");
		      storage[top] = value;
		      /* increment or decrement top*/;
		      top++;
		      System.out.println(value + " was successfully added.");
		      System.out.println();
		    }
		  }

		  public void pop() {
		    if (isEmpty()) {
		    	System.out.println("REMOVE FAILED, Storage is empty.");
		      // print error message
		      System.out.println();
		    } else {
		      System.out.println("... trying to pop stack[" + (top-1) + "] ...");
		      storage[top] = null;
		      /* increment or decrement top*/
		      top--;
		      System.out.println(storage[top] + " was successfully removed.");
		      System.out.println();
		    }
		  }

		  public void peek() {
		    if (storage[top] == storage[0]) {
		      System.out.println("PEEK TOP = " + storage[top]);
		      System.out.println();
		    } else {
		      System.out.println("PEEK TOP = " + storage[top-1]);
		      System.out.println();
		    }
		  }
		  
		  public static void main(String [] args) {
			  Stack storage = new Stack(10);
		    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
		    System.out.println("STORAGE CAPACITY = " + storage.capacity/* return the size limit */);
		    System.out.println();
		    // show empty stack
		    storage.show();
		    // try removing on an empty stack
		    storage.pop();
		    // peek top element of an empty stack
		    storage.peek();
		    storage.push("one");
		    // show the updated stack
		    storage.show();
		    // peek if top element is "one"
		    storage.peek();
		    storage.push("two");
		    // show the updated stack
		    storage.show();
		    // peek if top element is "two"
		    storage.peek();
		    storage.push("three");
		    // show the updated stack
		    storage.show();
		    // peek if top element is "three"
		    storage.peek();
		    storage.push("four");
		    // show the updated stack
		    storage.show();
		    storage.push("five"); 
		    // show the updated stack
		    storage.show();
		    // try removing "five"
		    storage.pop();
		    storage.push("six"); 
		    storage.push("seven"); 
		    storage.push("eight"); 
		    storage.push("nine");    
		    storage.push("ten"); 
		    // show the updated stack
		    storage.show();
		    // peek if top element is "ten"\
		    storage.peek();
		    // try adding "eleven"
		    storage.push("eleven");
		    // try adding "twelve"
		    storage.push("twelve");
		    // show the updated stack
		    storage.show();
		  }  
	}


