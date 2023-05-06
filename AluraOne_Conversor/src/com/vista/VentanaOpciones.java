package com.vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.prueba.ControladorMonedas;
import com.prueba.ControladorVelocidad;

public class VentanaOpciones extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOpciones frame = new VentanaOpciones();
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
	public VentanaOpciones() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMoneda = new JButton("");
		btnMoneda.setToolTipText("Conversor de Monedas");
		btnMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorMonedas controlador = new ControladorMonedas();
				VentanaConversionMoneda frame = new VentanaConversionMoneda(controlador);
				frame.setVisible(true);
				VentanaOpciones.this.dispose();
			}
		});
		btnMoneda.setIcon(new ImageIcon("C:\\Users\\HOME\\eclipse-workspaceJEE\\AluraOne_Conversor\\imagenes\\conversion_moneda150.png"));
		btnMoneda.setBounds(80, 130, 150, 150);
		contentPane.add(btnMoneda);
		
		JLabel lblTitulo = new JLabel("APP DE CONVERSIONES");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 24));
		lblTitulo.setBounds(120, 60, 340, 40);
		contentPane.add(lblTitulo);
		
		JButton btnVelocidad = new JButton("");
		btnVelocidad.setToolTipText("Conversor de Velocidades");
		btnVelocidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControladorVelocidad controlador = new ControladorVelocidad();
				VentanaConversionVelocidad frame = new VentanaConversionVelocidad(controlador);
				frame.setVisible(true);
				VentanaOpciones.this.dispose();
			}
		});
		btnVelocidad.setIcon(new ImageIcon("C:\\Users\\HOME\\eclipse-workspaceJEE\\AluraOne_Conversor\\imagenes\\speed_icon150.png"));
		btnVelocidad.setBounds(340, 130, 150, 150);
		contentPane.add(btnVelocidad);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\HOME\\eclipse-workspaceJEE\\AluraOne_Conversor\\imagenes\\among_Usicon700.png"));
		lblFondo.setBounds(0, 0, 686, 359);
		contentPane.add(lblFondo);
	}
}
