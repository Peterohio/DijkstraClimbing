import java.util.ArrayList;

public class Map 
{
	private ArrayList<Node> route = new ArrayList<Node>();
	Map(int mapNo)
	{
		if(mapNo == 1)
		{
			ArrayList<String> neighbors = new ArrayList<String>();
			neighbors.add("B");
			neighbors.add("G");
			neighbors.add("F");
			route.add(new Node("A",0,0,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("A");
			neighbors.add("C");
			neighbors.add("G");
			route.add(new Node("B",16,12,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("B");
			neighbors.add("D");
			neighbors.add("G");
			route.add(new Node("C",4,2,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("D");
			neighbors.add("G");
			neighbors.add("F");
			route.add(new Node("E",11,21,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("E");
			neighbors.add("A");
			neighbors.add("G");
			route.add(new Node("F",43,26,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("A");
			neighbors.add("B");
			neighbors.add("C");
			neighbors.add("D");
			neighbors.add("E");
			neighbors.add("F");
			route.add(new Node("G",3,4,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("E");
			neighbors.add("C");
			neighbors.add("G");
			route.add(new Node("D",6,8,neighbors));
		}
	}
	
	public Node getHold(String nodeName)
	{
		for(Node match: route)
		{
			if(nodeName.compareTo(match.getName()) == 0)
			{
				return match;
			}
		}
		return null;
	}
	
	public ArrayList<Node> getRoute()
	{
		return route;
	}
	
	public Node getStart()
	{
		return route.get(0);
	}
	
	public Node getEnd()
	{
		int last = route.size()-1;
		return route.get(last);
	}
	
	public double getDist(Node start, Node finish)
	{
		double dist = Math.sqrt(Math.pow(start.getXCoord() - finish.getXCoord(), 2) + Math.pow(start.getYCoord() - finish.getYCoord(), 2));
		return dist;
	}
}
