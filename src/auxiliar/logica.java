/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Random;
 
public class logica {
    
    public int[] barajear() {
        
        int[] num = new int[16];
        int count = 0;
        
        while(count < 16) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 16; i++) {
                if(num[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                num[count] = na;
                count++;
            }
            
        }
        
        
        return num;
    }
            
}
