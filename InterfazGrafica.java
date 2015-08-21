/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 30/07/2015
 * Hoja de Trabajo 2
 *
 */

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;


/**
 * Esta es la clase <InterfazGrafica> y muestra una Interfaz
 * mas amigable con el usuario al tener un botón para buscar el
 * archivo deseado para realizar las operacinoes. Busca el archivo
 * y tienen otro botón que permite realizar el cálculo de la operacion.
 * Por útltimo, tiene un área de texto en el cual muestra el resultado
 * de la operación.
 * 
 * @author André Rodas
 * @author Rudy Garrido 
 * @author Yosemite Meléndez
 *
 */
public class InterfazGrafica {

		private int tipo = 1;
		private JFrame frame;
		private JSlider slider;
		private JLabel label;
		private JTextField textField;
		private JFileChooser fc;
		private File file;
		private Calculadora<Integer> calculadora = new Calculadora<Integer>();
		private JButton btnSeleccionarArchivo;
		private JButton buttonCalcular;
		private JTextArea textArea;
		private JRadioButton RBList;
		private JRadioButton RBSimple;
		private JRadioButton RBDoble;
		private JRadioButton RBListCir;
		private JRadioButton RBVec;
		private JRadioButton RBArrayList;
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						InterfazGrafica window = new InterfazGrafica();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public InterfazGrafica(){
			initialize();
		}
		/**
		 * Crea los elementos de la interfaz gráfica.
		 *El frame principal, etiquetas para nombre y 
		 *resultado, botones buscar archivo y calcular 
		 *y un área de texto para mostrar el resultado.
		 */
		public void initialize(){
			frame = new JFrame();
			frame.setBounds(100, 100, 650, 381);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblCalculadoraPostfix = new JLabel("Calculadora Postfix");
			lblCalculadoraPostfix.setFont(new Font("Tahoma", Font.BOLD, 50));
			lblCalculadoraPostfix.setBounds(10, 11, 586, 106);
			frame.getContentPane().add(lblCalculadoraPostfix);
			
			btnSeleccionarArchivo = new JButton("Seleccionar Archivo");
			btnSeleccionarArchivo.setBounds(422, 128, 174, 23);
			btnSeleccionarArchivo.addActionListener(new Evento());
			frame.getContentPane().add(btnSeleccionarArchivo);
			
			textField = new JTextField();
			textField.setBounds(20, 128, 378, 23);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			buttonCalcular = new JButton("Calcular");
			buttonCalcular.setBounds(20, 164, 174, 23);
			buttonCalcular.addActionListener(new Evento());
			frame.getContentPane().add(buttonCalcular);
			
			JLabel lblResultados = new JLabel("Resultados:");
			lblResultados.setBounds(20, 199, 100, 21);
			frame.getContentPane().add(lblResultados);
			
			textArea = new JTextArea();
			textArea.setBounds(20, 218, 150, 113);
			frame.getContentPane().add(textArea);
			
			fc = new JFileChooser();
			
			//---------------------
			
			RBList = new JRadioButton("Lista");
			RBList.setSelected(true);
			RBList.setBounds(220, 220, 100, 25);
			RBList.addActionListener(new Evento());
			frame.getContentPane().add(RBList);
			
			RBSimple = new JRadioButton("Lista Simpl. Enlazada");
			RBSimple.setBounds(220, 250, 200, 25);
			RBSimple.addActionListener(new Evento());
			frame.getContentPane().add(RBSimple);
			
			RBDoble = new JRadioButton("Lista Dobl. Enlazada");
			RBDoble.setBounds(220, 280, 200, 25);
			RBDoble.addActionListener(new Evento());
			frame.getContentPane().add(RBDoble);
			
			RBListCir = new JRadioButton("Lista Circular");
			RBListCir.setBounds(220, 310, 140, 25);
			RBListCir.addActionListener(new Evento());
			frame.getContentPane().add(RBListCir);
			
			RBVec = new JRadioButton("Lista tipo Vector");
			RBVec.setBounds(320, 220, 120, 25);
			RBVec.addActionListener(new Evento());
			frame.getContentPane().add(RBVec);			
			
			RBArrayList = new JRadioButton("Lista tipo ArrayList");
			RBArrayList.setBounds(440, 220, 140, 25);
			RBArrayList.addActionListener(new Evento());
			frame.getContentPane().add(RBArrayList);
			
		}
		/**
		 * Clase interna <Evento> para poder obtener el botón al cual se le realiza 
		 * la acción y asi realizar la operación deseada por el u qsuario.
		 * Un evento en <btnSeleccionarArchivo> permite abrir el buscador de archivos
		 * Un envento en <btnCalcular> permite realizar el cálculo de la operacion
		 *
		 */
		private class Evento implements ActionListener{


			public void actionPerformed(ActionEvent a) {
			
				if(a.getSource()==btnSeleccionarArchivo){
					int returnVal = fc.showOpenDialog(frame);
			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			        	System.out.println("Seleccion");
			            file = fc.getSelectedFile();
			            textField.setText(file.getAbsolutePath());
			        } 
				}else if(a.getSource()==buttonCalcular) {
					try {
						calculadora.setPila(tipo);
						calculadora.readFile(file.getAbsolutePath());
						textArea.setText(String.valueOf("El resultado final de su operacion es: " +calculadora.calcular()));
					} catch ( Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
}