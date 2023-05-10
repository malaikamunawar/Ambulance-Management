/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambulance.system;

/**
 *
 * @author Malaika
 */
public class queue {
    int size = 15;
    int queue [] = {1,2,3,4,5,6,7,8,9,10};

    int front ;
    int rear;  
    
    public void enqueue (int data){
        queue[rear] = data;
        rear = rear + 1;
        size = size+1;
        
    }
    
    public void dequeue (int data) {
        queue[front] = data;
        front = front +1;
        size = size+1;
    }
}
 
