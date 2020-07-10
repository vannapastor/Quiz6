/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz6;

/**
 *
 * @author user
 */
public class Quiz6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      linkedPositionallist<String> list = new linkedPositionallist<>();
        Position p1 = list.addFirst("position1");
        Position p2 = list.addAfter(p1, "after position 1");
        Position p3 = list.addBefore(p2, "before p2");
        Position p4 = list.addLast("last position");
        
        list.showPositionList();
        
        list.remove(p2);
        System.out.println();
        list.showPositionList();  
        list.moveToFront(p4, "last position");
        System.out.println();
        list.showPositionList();
        System.out.println();
    }
    
}