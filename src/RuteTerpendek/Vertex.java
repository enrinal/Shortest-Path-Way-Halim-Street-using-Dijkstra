/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuteTerpendek;

/**
 *
 * @author muham
 */
import java.util.*;
public class Vertex implements Comparable<Vertex>{
  public final int node;
	public ArrayList<Edge> nodeTetangga;
	public LinkedList<Vertex> jalur;
	public double jarakMinimal = Double.POSITIVE_INFINITY;
	public Vertex sebelum;
	public int compareTo(Vertex lain){
		return Double.compare(jarakMinimal,lain.jarakMinimal);		
	}
	public Vertex(int name){
		this.node = name;
		nodeTetangga = new ArrayList<Edge>();
		jalur = new LinkedList<Vertex>();
	}
}
        
