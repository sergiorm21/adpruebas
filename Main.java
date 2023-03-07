package calculadora;

/**
 *
 * @author Sergio Reina Montes
 */
public class Main {
    public double pruebaRecuperacionEntradaString (String numero1, String numero2) throws IllegalArgumentException{
        Calculando c = new Calculando();
        double resultado = 0d;
        try{
            resultado = c.add(Double.valueOf(numero1), Double.valueOf(numero2));
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Solo se admiten numeros");
        }
        return resultado;
    }

}
