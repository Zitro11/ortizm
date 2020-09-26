package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtIteraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibonacci() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lblFibo = new JLabel("Serie Fibonacci");
		lblFibo.setBounds(0, 0, 434, 25);
		lblFibo.setToolTipText("");
		lblFibo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFibo.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 22));
		lblFibo.setForeground(Color.WHITE);
		lblFibo.setBackground(Color.BLACK);
		
		JLabel lblNewLabel = new JLabel("Numero Y:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setLabelFor(this);
		lblNewLabel.setBounds(180, 36, 108, 74);
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.setLayout(null);
		contentPane.add(lblFibo);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero X:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(21, 36, 108, 74);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIteraciones = new JLabel("Iteraciones:");
		lblIteraciones.setForeground(Color.WHITE);
		lblIteraciones.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblIteraciones.setBounds(332, 36, 92, 74);
		contentPane.add(lblIteraciones);
		
		txtX = new JTextField();
		txtX.setBounds(10, 98, 86, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setBounds(166, 98, 86, 20);
		contentPane.add(txtY);
		txtY.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(321, 98, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int X, Y, Iteraciones, Ciclo=1, Resultado = 0;
				String Cadena = " ";
				X = Integer.parseInt(txtX.getText());
				Y = Integer.parseInt(txtY.getText());
				Iteraciones = Integer.parseInt(txtIteraciones.getText());
				
				while(Ciclo<=Iteraciones)
				{
					Resultado = X + Y;
					Cadena = Cadena + " " + String.valueOf(Resultado);
					X = Y;
					Y = Resultado;
					Ciclo = Ciclo + 1;
				}
				JOptionPane.showMessageDialog(null, Cadena);
			}
		});
		btnImprimir.setBounds(23, 191, 89, 23);
		contentPane.add(btnImprimir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				txtX.setText(null);
				txtY.setText(null);
				txtIteraciones.setText(null);
				JOptionPane.showMessageDialog(null, "Textos borrados");
			}
		});
		btnLimpiar.setBounds(166, 191, 89, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(WIDTH);
			}
		});
		btnSalir.setBounds(321, 191, 89, 23);
		contentPane.add(btnSalir);
	}
}
