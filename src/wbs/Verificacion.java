
package wbs;

import javax.swing.JOptionPane;

/**
 *
 * @author ESTU-5K
 */
public class Verificacion {
    
    /**CLASE DE VERIFICACIONES
     * MÉTODOS NO ESTÁTICOS PARA VERIFICACIONES
     */
    
    
    
//_____________________________________________________________________________    
    
    //VERIFICA QUE LA CONTRRASEÑA NO CONTENGA CARACTERES QUE GENEREN ERRORES Y CUMPLA CON UN TAMAÑO DETERMINADO
    public boolean varifRegistrarPsw(String psw)
    {
        
        if(psw.length()>3 && psw.length()<9)
        {
            if(psw.contains(";")||psw.contains("/")||psw.contains(",")||psw.contains("="))
            {
                JOptionPane.showMessageDialog(null,"la contraseña contiene un caracter inválido");
            }
            else
            {
                    return true;
            }
        }
        else
            {
                JOptionPane.showMessageDialog(null,"la contraseña debe tener entre 4 y 8 caracteres");
            }
        return false;
    }
    
    
    //VERIFICA QUE UN CAMPO DE TEXTO NO ESTÉ VACIO NI RELLENADO CON ESPACIOS
    public boolean estaVacio(javax.swing.JTextField tx, String nombre)
    {
        
        String vacios="                                                     ";
        
        //comprueba si el texto del textfield enviado esta vacio.
        //recibe el objeto del textField y el nombre que desee mostrarse de este
        
        if(tx.getText().equals("") || vacios.contains(tx.getText()))
                                                                                {
            System.out.println("vacio");
            JOptionPane.showMessageDialog(null, "el campo "+nombre+" no puede estar vacio");
            return false;
                                                                                }
        else
                                                                                {
            return true;
                                                                                }
        // solo retornará verdadero si el campo no está vacio
        
    }
    
    //VERIFICA QUE UN VALOR SEA NUMERICO
    public boolean numerico (String entrada, String nombre)
    {
        int retorno;
        try
        {
            retorno=Integer.parseInt(entrada);
            return true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "el campo "+nombre+ " solo acepta valores numéricos");
            return false;
        }
        
       
    }
    
    //VERIFICA QUE UN VALOR SOLO SE COMPONGA DE TEXTO Y NO TENGA CARACTERES ESPECIALES
    public boolean texto(String entrada,String nombre)
    {
        //abcdario en minúsculas  y mayúsculas
        String numeros="abcdefghijklmnopqrstu ",
               numerosM=numeros.toUpperCase();
        
        
        
        for (int i = 0; i < entrada.length(); i++) 
        {
            
            
                if (numeros.contains(entrada.substring(i,i+1))||numerosM.contains(entrada.substring(i,i+1))) 
                {
                    System.out.println("verificando caracter "+entrada.substring(i,i+1));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "el campo "+nombre+ " solo acepta texto,"+
                                            "\nsin números o caracteres especiales");
                    return false;
                }
            
        }
        
        
        
        
            
            return true;
        
        
    }
    
    public boolean correo(String correo)
    {
        int arroba=0,punto=0;
        
        for (int i = 0; i < correo.length(); i++) 
        {
            if (correo.charAt(i)=='@') 
            {
                arroba=i;
            }
            if(correo.charAt(i)=='.')
            {
                punto=i;
            }
        }
        
        if (arroba==0 || punto==0 || punto<arroba) 
           {
               JOptionPane.showMessageDialog(null, "El correo es inválido");
               return false;
           }
        else
        {
            return true;
        }
        
        
    
    }
    
    public boolean verifSalario(String salmin)
    {
        if(numerico(salmin,"Aspiración salarial")&&
                Integer.parseInt(salmin)>=781_242)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El salario mínimo no puede ser\ninferior a COP: 781242");
            return false;
        }
    
    }
    
    public boolean verifCampoError(String campo,String nombre)
    {
        if (campo.contains(";")||campo.contains("/")||campo.contains(",")||campo.contains("|")) 
        {
            JOptionPane.showMessageDialog(null, "El campo "+nombre+" tiene caracteres inválidos");
            return false;
        }
        else
        {
            return true;
        }
    
    }
    
    public boolean verifTelefono(String telefono)
    {
        if(numerico(telefono,"teléfono")&&telefono.length()==7)
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El telefono solo puede contener números y debe ser de 7 dígitos");
            return false;
        }
    }
    
}
