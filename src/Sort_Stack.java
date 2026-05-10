import java.util.Stack;

public class Sort_Stack {

    static void insert(Stack<Integer> st, int x) {

        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }


        int top = st.pop();


        insert(st, x);


        st.push(top);
    }

    static void sortStack(Stack<Integer> st) {


        if (st.isEmpty()) {
            return;
        }

        int x = st.pop();

        sortStack(st);

        insert(st, x);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(41);
        st.push(3);
        st.push(32);
        st.push(2);
        st.push(11);

        System.out.println("Before Sorting: " + st);

        sortStack(st);

        System.out.println("After Sorting: " + st);
    }
}