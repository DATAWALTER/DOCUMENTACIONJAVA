package principal;

import metodos.MandarPantalla;

/**
 * Progama principal que usa los métodos auxiliares para salto de línea de la
 * clase MandarPantalla
 *
 * @author Walter Ismael Sagastegui Lescano
 * @author sagastegui.w@gmail.com
 * @version 1.1
 * @see <a href="http://www.datawalter.com"> datawalter.com - Aprender a
 * programa </a>
 */
public class Main {

    /**
     * Punto de entrada único para el proyecto
     *
     * <ul>
     * <li> Utiliza método sinSalto
     * <li> Utiliza método conSalto
     * </ul>
     *
     * @param args es un arreglo de tipo String
     */
    public static void main(String[] args) {
        MandarPantalla mp = new MandarPantalla();
        mp.conSalto("Esto es una línea con salto");
        mp.sinSalto("Esto es una línea sin salto");
    }

}
