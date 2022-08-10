
public class StackAsMyArrayList<E> extends MyArrayList
{   
	MyArrayList<E> theStack;
    public StackAsMyArrayList()
    {  theStack = new MyArrayList<E>();       
    }
	
    public void push(E newElement) //insert at end of array!
    {  
		   if (!theStack.checkSpace())
		   throw new IndexOutOfBoundsException
                    ("Stack out of bounds");
		   theStack.add(theStack.getSize(),newElement);
    }
	
	public E pop() //remove end of array
    {  
		E temp = null;
		
		boolean isDone = false;
		if (theStack.getSize() > 0)
			temp=theStack.remove(theStack.getSize()-1);
		return temp; // temp will be null in special case of empty list
    }
    
	public String toString()
	{
		return theStack.toString();
	}

	//added method
	public E peek() {
    	return theStack.peek();
	}
	//added method
	public int getStackSize(){
    	return theStack.getSize();
	}
	//added method
	public boolean checkStackUniform(){
    	return theStack.checkUniform();
	}
}//end class

