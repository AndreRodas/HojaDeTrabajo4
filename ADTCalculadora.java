/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * @author Diego Morales. Carné: 14012
 * @author Diego Sosa. Carné: 14735
 * @author Julio González. Carné: 14096
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import java.io.FileNotFoundException;


/**
 * Esta es la interfaz ADTCalculadora creada por los propios alumnos para
 * utilizarlo en toda la sección. Practiacamente de esta interfaz se podrán
 * hacer la lectura del archivo y realizar las operaciones. Esta clase recibe
 * datos tipo string P
 *
 * @param <P>	para que los datos sean String
 * 
 */
public interface ADTCalculadora<P> {
	
	/**
	 * Permite la lectura de un archivo tipo String. Este archivo traerá una secuencia
	 * de caracteres que será una operación en formato postifix. 
	 * El método permite traer el arhcivo y luego hará desaparecer los espacios en blanco
	 * para empezar a realizar el proceso de meter operandos a la pila y encontrar operadores.
	 * 
	 * @param file	un archivo tipo String que traerá datos, 
	 * 				en este caso la operación en notación postfix
	 * @throws FileNotFoundException si no lee un archivo o no lo puede acceder
	 * @throws Exception son excepciones que pueden implementarse al ejecutar el constructor o el método
	 * 					 En este método se utiliza un IOException, excepciones por entradas o salidas de
	 * 					 datos incorrectos. 
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;
	
	/**
	 * Este método realizará todas las operaciones deseada. Una vez tomada la cadena de 
	 * caracteres sin espacios, empeiza buscando los operandos y los mete a la pila. 
	 * Cuando va guardando los elementos a la pila push realiza una conversión de String a Integer,
	 * luego los saca pop y ya los opera según la jerarquía de operaciones.
	 * Los operandos serán números de un dígito, de 1-9 y las operaciones a realizar son:
	 * -, +, *, /, ^ Un operador o símbolo distinto de estos cinco, mostrará error. 
	 * 
	 * @return el valor resultante de la operación que está dentro de la pila
	 * 			el dato no es sacado de la pila, sólo retorna su valor.
	 * @throws Exception excepciones que pueden al ejecutar el constructor o el método.
	 * 					 En este caso, retorna error de símbolo o caracter desconocido.
	 */
	public P calcular() throws Exception;
	
	
}