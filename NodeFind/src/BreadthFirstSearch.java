import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    Node startNode;
    Node goalNode;

    public BreadthFirstSearch(Node start, Node goalNode){
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean compute(){

        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found!");
            //System.out.println(startNode);
        }

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);
        for(int i=0; i<explored.size();System.out.println(explored.get(i).getValue()),i++);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.equals(this.goalNode)) {
                return true;
            }
            else{
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }

        return false;

    }

}