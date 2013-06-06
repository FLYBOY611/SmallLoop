/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smallloop;

/**
 *
 * @author richard.eaton
 */
public class SmallLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8};
        for (int i =0; i < x.length; i++){
            if(x[i] == 2){
                x=y;
            }
            y[i] = y[i] * 2;
            System.out.println(x[i]);
        }
    }
}
