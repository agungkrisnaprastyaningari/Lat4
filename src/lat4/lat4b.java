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
public class lat4b {
    public static void main(String[] args){
        
        int sukuAwal = 5;
        int selisih = 5;
        int updateNilai;
        int total =0;
        
      for(int a = 0; a < 4; a++ ){
          for(int b = a ; b < 4; b++){
              updateNilai = sukuAwal;
              sukuAwal += selisih;
              
          
          System.out.print(" " + updateNilai);
          total += updateNilai;
      }
          System.out.println(" ");
    }
}
}
