package Lec_42;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
      Stack st = new Stack();
      st.push(10);
      st.push(20);
      st.peek();
      st.push(30);
      st.display();
      System.out.println(st.pop());

    }
    
}
