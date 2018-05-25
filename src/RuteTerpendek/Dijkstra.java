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
public class Dijkstra{
    public int nodeAwal;
    public int nodeAkhir;
    public String rute;
    public Dijkstra(int nodeAwal, int nodeAkhir){
    //Inisialisasi graph
		Graph g = new Graph(19);
    //tambah simpul
                g.tambahEdge(0, 1, 727);g.tambahEdge(0, 4, 1700); 
                g.tambahEdge(1, 2, 201);g.tambahEdge(1, 9, 554);g.tambahEdge(1, 0, 727);
                g.tambahEdge(2, 3, 302);g.tambahEdge(2, 8, 236);g.tambahEdge(2, 1, 201);
                g.tambahEdge(3, 7, 400);g.tambahEdge(3, 2, 302);
                g.tambahEdge(4, 5, 294);g.tambahEdge(4, 10, 300);g.tambahEdge(4, 0, 1700);
                g.tambahEdge(5, 6, 379);g.tambahEdge(5, 11, 281);g.tambahEdge(5, 4, 294);
                g.tambahEdge(6, 7, 400);g.tambahEdge(6, 9, 173);g.tambahEdge(6, 12, 147);
                g.tambahEdge(6, 5, 379);
                g.tambahEdge(7, 8, 377);g.tambahEdge(7, 13, 500);g.tambahEdge(7, 3, 400);
                g.tambahEdge(7, 6, 400);
                g.tambahEdge(8, 9, 267);g.tambahEdge(8, 2, 236);g.tambahEdge(8, 7, 377);
                g.tambahEdge(9, 1, 554);g.tambahEdge(9, 6, 173);g.tambahEdge(9, 8, 267);
                g.tambahEdge(10, 11, 233);g.tambahEdge(10, 14, 500);g.tambahEdge(10, 4, 300);
                g.tambahEdge(11, 12, 451);g.tambahEdge(11, 5, 281);g.tambahEdge(11, 10, 233);           
                g.tambahEdge(12, 13, 431);g.tambahEdge(12, 6, 147);g.tambahEdge(12, 11, 451);
                g.tambahEdge(13, 16, 400);g.tambahEdge(13, 7, 500);g.tambahEdge(13, 12, 431);
                g.tambahEdge(14, 15, 1700);g.tambahEdge(14, 10, 500);
                g.tambahEdge(15, 16, 144);g.tambahEdge(15, 17, 1200);g.tambahEdge(15, 14, 1700);
                g.tambahEdge(16, 18, 900);g.tambahEdge(16, 15, 144);g.tambahEdge(16, 18, 900);
                g.tambahEdge(17, 18, 582);g.tambahEdge(17, 15, 1200);
		g.tambahEdge(18, 16, 900); g.tambahEdge(18, 17, 582);
                
                hitung(g.getVertex(nodeAwal));
                	for(Vertex v:g.getVertices()){
                        if(v.node==nodeAkhir){
                            rute = "Jarak - "+ v.jarakMinimal+" meter , Rute :  ";
			for(Vertex pathvert:v.jalur) {
				rute+= pathvert.node+" ";
                                
			}
                        rute+=""+v.node;
                        }
			
		}
}

    public void hitung(Vertex source){
		
		
		source.jarakMinimal = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(source);
		
		while(!queue.isEmpty()){
			
			Vertex u = queue.poll();
		
			for(Edge tetannga:u.nodeTetangga){
				Double newDist = u.jarakMinimal+tetannga.jarak;
				
				if(tetannga.target.jarakMinimal>newDist){
					queue.remove(tetannga.target);
					tetannga.target.jarakMinimal = newDist;
					
					tetannga.target.jalur = new LinkedList<Vertex>(u.jalur);
					tetannga.target.jalur.add(u);
					
					queue.add(tetannga.target);					
				}
			}
		}
	}
}

