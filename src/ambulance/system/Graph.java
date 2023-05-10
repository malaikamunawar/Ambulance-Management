/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
 class AnnualGraph {
    ArrayList<ArrayList<Integer>> graphObject;
    int Vertices;
    
    AnnualGraph(int nodes){
        
       
        graphObject=new ArrayList<ArrayList<Integer>>();
        Vertices=nodes;
        for(int i=0; i<Vertices; i++) {
            
            graphObject.add(new ArrayList<Integer>());
            
        }
    }
    void addingEdges(int v,int u) {
    graphObject.get(v).add(u);
    graphObject.get(u).add(v);
    
    }
  
    void Traversion(int node,boolean traversed[]) {
        traversed[node]=true;
        System.out.print(node+" ");
        for(int a:graphObject.get(node)){
            if(traversed[a]==false){
                Traversion(a,traversed);
            }
        }
    }
      void DepthFirstSearch(int initialNode){
        boolean traversed[]=new boolean[Vertices];
       
       Traversion(initialNode,traversed);
      }
    
     void print() {
                System.out.println("The graph shows the nodes between area and ambulance service of previous year");
        for (int i=0; i<Vertices; i++){
            
            System.out.print("Nodes of Graph are " +" " + i);
            
            for (int a:graphObject.get(i))
                
            System.out.print("->"+a);
            
            System.out.println();
            
        }
    }
}

public class Graph{
    
    public static void main(String args[]) {
        AnnualGraph graphx= new AnnualGraph(30);

        graphx.addingEdges(0, 12);
        graphx.addingEdges(15, 5);
        graphx.addingEdges(20, 3);
        graphx.addingEdges(18, 9);
        graphx.addingEdges(10, 10);
        graphx.addingEdges(20, 4);
        graphx.addingEdges(6, 16);
        graphx.addingEdges(21, 7);
        graphx.addingEdges(9, 9);
        graphx.addingEdges(13, 13);
        graphx.addingEdges(16, 10);
        graphx.addingEdges(24, 4);
        
    //    System.out.println("The graph shows the nodes between area and ambulance service of previous year");
        graphx.print();
       
       // graphx.addingEdges(0,1);
        
       graphx.DepthFirstSearch(0);
       
      
        
        
        
    }
}
    
