package hdt8;

/**
 * @author Alexis Hengstenberg 17699
 * @author Sebastian Arriola 11463
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
