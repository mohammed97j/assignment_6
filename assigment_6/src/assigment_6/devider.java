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
public class devider implements devide_interface{
 
   driver_adapter driver_adapter;
    multiplier  multiplier;
    

    BigDecimal  num1=new BigDecimal("4") , num2=new BigDecimal("2"), num3=num1.divide(num2);
    @Override
    public BigDecimal Divide(BigDecimal num1 , BigDecimal num2 , String TypeOFoperation)
    {
        if(TypeOFoperation.equalsIgnoreCase("/"))
            return num3;
        else if(TypeOFoperation.equalsIgnoreCase("*"))
        {
          driver_adapter=new  driver_adapter(TypeOFoperation);
         
           return  driver_adapter.Divide(num1, num2, TypeOFoperation);
        }
        return null;
    }
    
}
