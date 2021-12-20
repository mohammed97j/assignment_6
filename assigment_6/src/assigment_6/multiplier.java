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
public class multiplier implements multi_interface
{
     BigDecimal num1=new BigDecimal("4") , num2=new BigDecimal("2") , num3=num1.multiply(num2);
   
    @Override
    
    public BigDecimal Multiply(BigDecimal num1 , BigDecimal num2  , String TypeOFoperation)
    {
        return num3;
        
    }
}
