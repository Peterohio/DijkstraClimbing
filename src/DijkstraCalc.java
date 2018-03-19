import java.util.ArrayList;

public class DijkstraCalc 
{
	private Map leftHand = new Map(1);
	private Map rightHand = new Map(2);
	private Map leftFoot = new Map(3);
	private Map rightFoot = new Map(4);
	
	public ArrayList makeDijkstra(Map mapName)
	{
		ArrayList<String> shortestPath = new ArrayList<String>();
		ArrayList<String> visitedNodes = new ArrayList<String>();
		ArrayList<Double> distToNode = new ArrayList<Double>();
		
		for(Node currentNode: mapName.getRoute())
		{
			for(String adjacent: currentNode.getLinks())
			{
				
			}
		}
	}
	
	public double getDist(Node start, Node finish)
	{
		double dist = Math.sqrt(Math.pow(start.getXCoord() - finish.getXCoord(), 2) + Math.pow(start.getYCoord() - finish.getYCoord(), 2));
		return dist;
	}
	
	//put main here and generate the paths
}
