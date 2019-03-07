import java.util.ArrayList;
import java.util.List;

/**
 * @author Stoica Ioana-Dana on 07-Mar-19
 */

public class TravelMap {

    private List<Node> list;

    public TravelMap(List<Node> list)
    {
        list = new ArrayList<Node>();
    }


    /**
     * Adds a new object of type Restaurant to the list of Nodes
     *  @param restaurants the list of restaurants to be added
     */
    public void addNode(Restaurant... restaurants) {
        for (Node i : restaurants) {
            list.add(i);
        }
    }


    /**
     * Adds a new object of type Museum to the list of Nodes
     *  @param museums the list of museums to be added
     */
    public void addNode(Museum... museums) {
        for (Node i : museums) {
            list.add(i);
        }
    }


    /**
     * Adds a new object of type Church to the list of Nodes
     *  @param churches the list of churches to be added
     */
    public void addNode(Church... churches) {
        for (Node i : churches) {
            list.add(i);
        }
    }


    /**
     * Adds a new object of type Hotel to the list of Nodes
     *  @param hotels the list of hotels to be added
     */
    public void addNode(Hotel... hotels) {
        for (Node i : hotels) {
            list.add(i);
        }
    }

    public List<Node> getNodes() {
        return list;
    }



}
