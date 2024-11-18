public class Q_25_stack {
    int[] stack = new int[100];
    int h = -1;

    int pop(int[] stack){

        if(h == -1){
            System.out.println("Stack underflow");
            return -10000;
        }
        else{
            int y = stack[h];
            h--;
            return y;
        }
    }
    void push(int[] stack, int e){
        int elem = e;
        if(h == stack.length -1){
            System.out.println("Stack overflow");

        }
        else {
            h++;
            stack[h] = elem;

        }
    }

    public static void main(String[] args) {
        Q_25_stack obj = new Q_25_stack();
        obj.push(obj.stack, 5);
        obj.push(obj.stack, 10);
        obj.push(obj.stack, 15);
        obj.push(obj.stack, 20);
        obj.push(obj.stack, 25);
        obj.push(obj.stack, 30);
        System.out.println("Taking out the First top element :" +obj.pop(obj.stack));
        System.out.println("Taking out the Second top element :" +obj.pop(obj.stack));


        System.out.println(obj.stack[0] );
        System.out.println(obj.stack[1] );
        System.out.println(obj.stack[2] );
        System.out.println(obj.stack[3] );
        System.out.println(obj.stack[4] );
        System.out.println("Top element of stack is : " + obj.stack[obj.h] );
    }


}
