import java.util.ArrayList;

public class DijkstraCalc 
{	
	public static Double makeDijkstra(Map mapName)
	{
		ArrayList<String> shortestPath = new ArrayList<String>();
		
		mapName.getStart().setDist(0);
		mapName.getStart().setBoxTrue();
		
		Node latestNode = mapName.getStart();
		
		while(mapName.getEnd().isBoxed() == false ) 
		{
			//This block calculates new distances for the neighboring nodes to the latestNode
			//if the new distance is shorter, the new distance replaces the old one
			for(String neighborNode: latestNode.getLinks())
			{
				if(mapName.getHold(neighborNode).isBoxed() == false)
				{
					double testDist = latestNode.getDistFromStart() + mapName.getDist(latestNode, mapName.getHold(neighborNode));
					
					if(testDist < mapName.getHold(neighborNode).getDistFromStart())
					{
						mapName.getHold(neighborNode).setDist(testDist);
					}
				}
			}
			
			//this block indexes through the route and chooses the unboxed node with the shortest distance from the start
			double shortestDist = 1000000000000000.1; 
			
			for(Node nextNode: mapName.getRoute())
			{
				if(nextNode.isBoxed() == false)
				{
					if(nextNode.getDistFromStart() < shortestDist)
					{
						latestNode = nextNode;
						shortestDist= latestNode.getDistFromStart();
					}
				}
			}
			System.out.println(latestNode.getName());
			latestNode.setBoxTrue();
		}
		
		return mapName.getEnd().getDistFromStart();
		
	}
	
	public static void main(String[] args)
	{
		Map test = new Map(1);
		System.out.println(makeDijkstra(test));
		for(Node check: test.getRoute())
		{
			System.out.println(check.getName() + " - " + check.getDistFromStart());
		}
	}
}
