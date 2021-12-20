/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment_6;

import java.math.BigDecimal;

/**
 *
 * @author GeNDii
 */
public class driver_adapter  implements devide_interface {
 
    
     multi_interface multi_interface;
 
    public driver_adapter(String TypeOFoperation)
    {
        if(TypeOFoperation.equalsIgnoreCase("*"))
            multi_interface=new multiplier();
    }


    @Override
    public BigDecimal Divide(BigDecimal num1 , BigDecimal num2  , String TypeOFoperation) 
    {
        if(TypeOFoperation.equalsIgnoreCase("*"))
        {
           return multi_interface.Multiply(num1, num2, TypeOFoperation);
             
        }    
        return null;
       
    }
    
}
