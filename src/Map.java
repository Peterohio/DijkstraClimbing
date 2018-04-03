import java.util.ArrayList;

public class Map 
{
	private ArrayList<Node> route = new ArrayList<Node>();
	Map(int mapNo)
	{
		if(mapNo == 1)
		{
			ArrayList<String> neighbors = new ArrayList<String>();
			neighbors.add("F");
			route.add(new Node("C",18,13,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("C");
			neighbors.add("I");
			route.add(new Node("F",12,21,neighbors));
			
			
			neighbors = new ArrayList<String>();
			neighbors.add("F");
			neighbors.add("K");
			route.add(new Node("I",11,34,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("I");
			neighbors.add("O");
			route.add(new Node("K",11,45,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("K");
			neighbors.add("S");
			route.add(new Node("O",11,55,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("O");
			neighbors.add("U");
			route.add(new Node("S",10,68,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("S");
			neighbors.add("W");
			route.add(new Node("U",11,77,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("U");
			neighbors.add("AA");
			route.add(new Node("W",14,83,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("W");
			neighbors.add("AC");
			route.add(new Node("AA",13,90,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AA");
			neighbors.add("AE");
			route.add(new Node("AC",13,99,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AC");
			neighbors.add("AF");
			route.add(new Node("AE",11,107,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AE");
			route.add(new Node("AF",13,118,neighbors));
		}
		else if(mapNo==2)
		{
			ArrayList<String> neighbors = new ArrayList<String>();
			neighbors.add("A");
			neighbors.add("B");
			neighbors.add("D");
			neighbors.add("F");
			route.add(new Node("C",18,13,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("A");
			neighbors.add("C");
			neighbors.add("F");
			neighbors.add("E");
			route.add(new Node("B",12,10,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("D");
			neighbors.add("B");
			neighbors.add("C");
			route.add(new Node("A",18,4,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("A");
			neighbors.add("C");
			neighbors.add("F");
			route.add(new Node("D",19,15,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("B");
			neighbors.add("G");
			neighbors.add("F");
			route.add(new Node("E",7,15,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("B");
			neighbors.add("C");
			neighbors.add("D");
			neighbors.add("E");
			neighbors.add("G");
			neighbors.add("I");
			neighbors.add("H");
			route.add(new Node("F",12,21,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("E");
			neighbors.add("I");
			neighbors.add("F");
			route.add(new Node("G",7,28,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("F");
			neighbors.add("J");
			neighbors.add("J");
			route.add(new Node("H",15,30,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("G");
			neighbors.add("F");
			neighbors.add("H");
			neighbors.add("J");
			neighbors.add("K");
			route.add(new Node("I",11,34,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("H");
			neighbors.add("I");
			neighbors.add("K");
			neighbors.add("M");
			route.add(new Node("J",14,38,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("I");
			neighbors.add("J");
			neighbors.add("M");
			neighbors.add("L");
			neighbors.add("N");
			neighbors.add("O");
			route.add(new Node("K",11,45,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("P");
			neighbors.add("R");
			neighbors.add("O");
			neighbors.add("K");
			route.add(new Node("L",8,50,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("Q");
			neighbors.add("N");
			neighbors.add("K");
			neighbors.add("J");
			route.add(new Node("M",17,50,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("M");
			neighbors.add("Q");
			neighbors.add("O");
			neighbors.add("K");
			route.add(new Node("N",15,52,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("K");
			neighbors.add("L");
			neighbors.add("R");
			neighbors.add("S");
			neighbors.add("Q");
			neighbors.add("N");
			route.add(new Node("O",11,55,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("R");
			neighbors.add("L");
			route.add(new Node("P",5,56,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("M");
			neighbors.add("N");
			neighbors.add("O");
			neighbors.add("S");
			route.add(new Node("Q",16,58,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("P");
			neighbors.add("L");
			neighbors.add("O");
			neighbors.add("S");
			neighbors.add("T");
			route.add(new Node("R",7,63,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("Q");
			neighbors.add("O");
			neighbors.add("R");
			neighbors.add("T");
			neighbors.add("U");
			route.add(new Node("S",10,68,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("R");
			neighbors.add("S");
			neighbors.add("U");
			neighbors.add("V");
			route.add(new Node("T",6,70,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("S");
			neighbors.add("T");
			neighbors.add("V");
			neighbors.add("X");
			neighbors.add("W");
			route.add(new Node("U",11,77,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AB");
			neighbors.add("Z");
			neighbors.add("X");
			neighbors.add("U");
			neighbors.add("T");
			route.add(new Node("V",7,82,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("U");
			neighbors.add("X");
			neighbors.add("AA");
			neighbors.add("Y");
			route.add(new Node("W",14,83,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("V");
			neighbors.add("U");
			neighbors.add("W");
			neighbors.add("Z");
			neighbors.add("AA");
			route.add(new Node("X",10,86,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AA");
			neighbors.add("W");
			route.add(new Node("Y",17,86,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("V");
			neighbors.add("X");
			neighbors.add("AB");
			neighbors.add("AA");
			route.add(new Node("Z",9,88,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("Y");
			neighbors.add("W");
			neighbors.add("X");
			neighbors.add("Z");
			neighbors.add("AC");
			neighbors.add("AD");
			route.add(new Node("AA",13,90,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("V");
			neighbors.add("Z");
			route.add(new Node("AB",3,93,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AA");
			neighbors.add("AD");
			neighbors.add("AE");
			route.add(new Node("AC",13,99,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AA");
			neighbors.add("AC");
			neighbors.add("AE");
			neighbors.add("AF");
			route.add(new Node("AD",17,104,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AC");
			neighbors.add("AD");
			neighbors.add("AF");
			route.add(new Node("AE",11,107,neighbors));
			
			neighbors = new ArrayList<String>();
			neighbors.add("AE");
			neighbors.add("AD");
			route.add(new Node("AF",13,118,neighbors));
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
