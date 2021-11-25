package guis;

import clases.*;
import arreglos.*;
import libreria.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class DlgMatricula extends JDialog implements ActionListener, KeyListener, MouseListener {
	
	private JLabel lblImgMatricula;
	private JLabel lblnumMatricula;
	private JTextField txtnumMatricula;
	private JTextField txtcodAlumno;
	private JComboBox <String> cbocodAlumno;
	private JComboBox <String> cbocodAlumno;
	private JComboBox <String> cbocodAlumno;
	private JButton btncodAlumno;
	private JButton btncodAlumno;
	private JButton btnQuitar;
	private JButton btnAgregar;
	private JButton btnAtender;
	private JButton btnProceder;
	private JScrollPane scrollPane;
	private JTable tblConsulta;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgMatricula dialog = new DlgMatricula();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgMatricula() {
		setResizable(false);
		setTitle("Registro | Matricula");
		setBounds(100, 100, 710, 410);
		getContentPane().setLayout(null);
	
		lblImgMatricula = new JLabel();
		lblImgMatricula.setIcon(new ImageIcon("imagenes/dlgMatricula.png"));
		lblImgMatricula.setBounds(400, 10, 89, 89);
		getContentPane().add(lblImgMatricula);
		
		lblnumMatricula = new JLabel("C\u00F3digo");
		lblnumMatricula.setBounds(10, 10, 60, 23);
		getContentPane().add(lblnumMatricula);
		
		btncodAlumno = new JButton("A");
		btncodAlumno.addMouseListener(this);
		btncodAlumno.setForeground(Color.BLUE);
		btncodAlumno.setBounds(10, 40, 50, 23);
		getContentPane().add(btncodAlumno);
	
		btncodAlumno = new JButton("A");
		btncodAlumno.addMouseListener(this);
		btncodAlumno.setForeground(Color.BLUE);
		btncodAlumno.setBounds(10, 70, 50, 23);
		getContentPane().add(btncodAlumno);
		
		txtnumMatricula = new JTextField();
		txtnumMatricula.setBounds(70, 10, 85, 23);
		getContentPane().add(txtnumMatricula);
		txtnumMatricula.setColumns(10);
		
		txtcodAlumno = new JTextField();
		txtcodAlumno.setBounds(70, 40, 85, 23);
		getContentPane().add(txtcodAlumno);
		txtcodAlumno.setColumns(10);
		
		cbocodAlumno = new JComboBox <String> ();
		cbocodAlumno.addActionListener(this);
		cbocodAlumno.addMouseListener(this);
		cbocodAlumno.setBounds(190, 40, 100, 23);
		getContentPane().add(cbocodAlumno);
		colocarCodAlumno();

		cbocodAlumno = new JComboBox <String> ();
		cbocodAlumno.addMouseListener(this);
		cbocodAlumno.setBounds(70, 70, 85, 23);
		getContentPane().add(cbocodAlumno);
		
		cbocodAlumno = new JComboBox <String> ();
		cbocodAlumno.addMouseListener(this);
		cbocodAlumno.setBounds(190, 70, 100, 23);
		getContentPane().add(cbocodAlumno);
		
		btnQuitar = new JButton(new ImageIcon("imagenes/quitar.gif"));
		btnQuitar.addActionListener(this);
		btnQuitar.addMouseListener(this);
		btnQuitar.setBounds(161, 70, 23, 23);
		getContentPane().add(btnQuitar);
	
		btnAgregar = new JButton(new ImageIcon("imagenes/agregar.gif"));
		btnAgregar.addActionListener(this);
		btnAgregar.addMouseListener(this);
		btnAgregar.setBounds(296, 70, 23, 23);
		getContentPane().add(btnAgregar);
		
		btnAtender = new JButton("Atender");
		btnAtender.addActionListener(this);
		btnAtender.addMouseListener(this);
		btnAtender.setForeground(Color.BLUE);
		btnAtender.setBounds(535, 10, 150, 23);
		getContentPane().add(btnAtender);
		
		btnProceder = new JButton("Proceder");
		btnProceder.addActionListener(this);
		btnProceder.addMouseListener(this);
		btnProceder.setForeground(Color.BLUE);
		btnProceder.setBounds(189, 10, 102, 23);
		getContentPane().add(btnProceder);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 110, 675, 250);
		getContentPane().add(scrollPane);

		tblConsulta = new JTable();
		tblConsulta.addKeyListener(this);
		tblConsulta.addMouseListener(this);
		tblConsulta.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblConsulta);

		modelo = new DefaultTableModel();
		modelo.addColumn("Matricula");
		modelo.addColumn("Alumno");
		modelo.addColumn("Curso");
		modelo.addColumn("fecha");
		modelo.addColumn("hora");
		
		tblConsulta.setModel(modelo);
		
		txtnumMatricula.setEditable(false);
		txtcodAlumno.setEditable(false);
		btnProceder.setEnabled(false);
		if (aa.tamaño() == 0)
			visibleInvisible(false);
		ajustarAnchoColumnas();
		listar();
		editarFila();
	}

	/**
	 * Create the dialog.
	 */
	public DlgMatricula() {
		setBounds(100, 100, 450, 300);

	}

}
