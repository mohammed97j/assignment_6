/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment_6;

/**
 *
 * @author GeNDii
 */import java.math.BigDecimal;
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        devider d = new devider();
        System.out.println(d.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "*"));
        System.out.println(d.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "/"));
        System.out.println(d.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "+"));
    }
    
}
