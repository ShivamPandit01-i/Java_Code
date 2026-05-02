import java.util.Stack;

 class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
//Stack LIFO
      //  System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("SKyrim");
        stack.push("Doom");
        stack.push("Ben10");

//push is used to add.
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
//pop is used to remove.

    }
}
