/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat4;

/**
 *
 * @author MOKLET-2
 */
public class Lat4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int sukuAwal = 5; 
            int selisih = 5;
            int updateNilai;
            int total;
            
            for(int a = 0; a < 5 ; a++){ 
                for(int b = 0; b< a; b++){
                    updateNilai = sukuAwal;
                    sukuAwal += selisih;
                    System.out.print(" " +updateNilai);
                }
                System.out.println(" ");
            }
    }
    }
    
}
