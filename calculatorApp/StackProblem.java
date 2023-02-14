import java.util.Stack;

class StackProblem {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.add(10);
        st.add(17);
        st.add(23);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());

    }
}