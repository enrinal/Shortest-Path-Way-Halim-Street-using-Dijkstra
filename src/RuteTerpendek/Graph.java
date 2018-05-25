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
public class Graph {
  private ArrayList<Vertex> simpul;
	public Graph(int nomorSimpul){
		simpul = new ArrayList<Vertex>(nomorSimpul);
		for(int i=0;i<nomorSimpul;i++){
			simpul.add(new Vertex(i));
		}
	}
	
	public void tambahEdge(int asal, int tujuan, int jarak){
		Vertex s = simpul.get(asal);
		Edge edge_baru = new Edge(simpul.get(tujuan),jarak);
		s.nodeTetangga.add(edge_baru);
	}
	
	public ArrayList<Vertex> getVertices() {
		return simpul;
	}
	
	public Vertex getVertex(int simp){
		return simpul.get(simp);
	}
}

