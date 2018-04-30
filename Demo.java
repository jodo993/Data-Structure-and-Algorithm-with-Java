/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josep
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chain Hash Map
        ChainHashMap<Integer, String> chm = new ChainHashMap();
        
        chm.put(2,"a");
        chm.put(5,"p");
        chm.put(9,null);
        
        int key = 9;
        
        if (chm.get(key) != null)
        {
            System.out.println("Value at key " + key + " is " + chm.get(key) + ".");
        }
        else if (chm.containsKey(key))
        {
            System.out.println("Value at key " + key + " is null.");
        }
        else
        {
            System.out.println("No such key: " + key + ".");
        }
        
        // Probe Hash map
        ProbeHashMap<Integer, String> prb = new ProbeHashMap();
        
        prb.put(4, "b");
        prb.put(6, "t");
        prb.put(8, null);
        
        int key2 = 4;
        
        if (prb.get(key2) != null)
        {
            System.out.println("Value at key " + key2 + " is " + prb.get(key2) + ".");
        }
        else if (prb.containsKey(key2))
        {
            System.out.println("Value at key " + key2 + " is null.");
        }
        else
        {
            System.out.println("No such key: " + key2 + ".");
        }
        
        
    }
    
}
