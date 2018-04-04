/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

/**
 *
 * @author sebdeveloper6952
 */
public class CPaciente implements Comparable<CPaciente>
{
    protected String nombre;
    protected String sintoma;
    protected String prioridad;
    
    public CPaciente(String n, String s, String p)
    {
        nombre = n;
        sintoma = s;
        prioridad = p;
    }

    @Override
    public int compareTo(CPaciente o) 
    {
        return prioridad.compareTo(o.prioridad);
    }
}
