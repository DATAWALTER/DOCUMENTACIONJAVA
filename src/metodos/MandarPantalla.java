package metodos;

/**
 * Progama que implementa una clase con métodos auxiliares para salto de línea y
 * línea continua
 *
 * @author Walter Ismael Sagastegui Lescano
 * @author sagastegui.w@gmail.com
 * @version 1.1
 * @see <a href="http://www.datawalter.com"> datawalter.com - Aprender a
 * programa </a>
 */
public class MandarPantalla {

    /**
     * Método para línea continua
     *
     * @param s Un String que se muestra en pantalla sin salto
     */
    public void sinSalto(String s) {
        System.out.print(s);
    }

    /**
     * Método para salto de línea
     *
     * @param s Un String que se muestra en pantalla con salto
     */
    public void conSalto(String s) {
        System.out.println(s);
    }

}
