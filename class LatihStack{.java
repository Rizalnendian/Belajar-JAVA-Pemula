import java.util.LinkedList;

class LatihStack {
    public static void main (String[] args) {
        LinkedList L = new LinkedList();
        L.add("N");
        L.addFirst("R");
        L.addLast("R");
        L.remove("N");
        L.addFirst("P");
        for (Object stackList :L){
            System.out.println(stackList+"->");
        }
    }
} 