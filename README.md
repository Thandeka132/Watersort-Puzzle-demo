#Requirements

Java Development Kit (JDK) installed on your system.
A Java IDE or compiler to compile and run the program.

#Notes

The program uses generics extensively to make the data structures flexible and reusable.
The Watersort class can be extended or modified to include additional functionality as needed.

#Program Components
1. MyArrayList<E>
    Implements a custom ArrayList to store elements of generic type E.
    Provides methods for adding, removing, and accessing elements.
    Includes additional methods for sorting, checking uniformity, and merging lists.

2. StackAsMyArrayList<E>
    Extends MyArrayList to implement a stack data structure.
    Implements methods for pushing and popping elements from the stack.
    Includes additional methods for checking stack uniformity and accessing the top element (peek).

3. Watersort
    Main class that drives the simulation of sorting colored liquids in bottles.
    Generates random colors and pours them into bottles.
    Provides methods to display the bottles and their content

#Running the Program
1. Compile:
    Open a command prompt or terminal.
    Navigate to the directory containing the Java files (MyArrayList.java, StackAsMyArrayList.java, Watersort.java).
    Compile the Java files using the following command: javac MyArrayList.java StackAsMyArrayList.java Watersort.java

2. Run:
    After successful compilation, run the Watersort class using the following command: java Watersort

3. Usage:
    The program will simulate the pouring of colored liquids into bottles and display the bottles and their contents.


