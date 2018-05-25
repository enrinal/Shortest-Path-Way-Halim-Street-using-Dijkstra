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

public class Edge{
  public final Vertex target;
	public final double jarak;
	public Edge(Vertex target, double jarak){
		this.target = target;
		this.jarak = jarak;
	}
}

