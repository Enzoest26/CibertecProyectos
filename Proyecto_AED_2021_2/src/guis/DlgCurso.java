package guis;

import clases.Curso;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class DlgCurso extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	private JLabel lblCiclo;
	private JTextField txtCiclo;
	private JLabel lblAsignatura;
	private JTextField txtAsignatura;
	private JLabel lblCreditos;
	private JTextField txtCreditos;
	private JLabel lblHoras;
	private JTextField txtHoras;
	private JScrollPane scrollPane;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JTable tblTableCurso;
	private DefaultTableModel tabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCurso dialog = new DlgCurso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCurso() {
		setTitle("Cursos");
		setBounds(100, 100, 545, 334);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 57, 46, 14);
		contentPanel.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(77, 54, 86, 20);
		contentPanel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setBounds(10, 91, 46, 14);
		contentPanel.add(lblCiclo);
		
		txtCiclo = new JTextField();
		txtCiclo.setBounds(77, 88, 86, 20);
		contentPanel.add(txtCiclo);
		txtCiclo.setColumns(10);
		
		lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setBounds(10, 127, 57, 14);
		contentPanel.add(lblAsignatura);
		
		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(77, 124, 86, 20);
		contentPanel.add(txtAsignatura);
		txtAsignatura.setColumns(10);
		
		lblCreditos = new JLabel("Creditos:");
		lblCreditos.setBounds(197, 57, 46, 14);
		contentPanel.add(lblCreditos);
		
		txtCreditos = new JTextField();
		txtCreditos.setBounds(263, 54, 86, 20);
		contentPanel.add(txtCreditos);
		txtCreditos.setColumns(10);
		
		lblHoras = new JLabel("Horas:");
		lblHoras.setBounds(197, 91, 46, 14);
		contentPanel.add(lblHoras);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(263, 88, 86, 20);
		contentPanel.add(txtHoras);
		txtHoras.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 155, 509, 129);
		contentPanel.add(scrollPane);
		
		tblTableCurso = new JTable();
		scrollPane.setViewportView(tblTableCurso);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(430, 19, 89, 23);
		contentPanel.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(430, 54, 89, 23);
		contentPanel.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(430, 87, 89, 23);
		contentPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(430, 121, 89, 23);
		contentPanel.add(btnEliminar);
		
		tabla = new DefaultTableModel();
		tabla.addColumn("Código");
		tabla.addColumn("Ciclo");
		tabla.addColumn("Creditos");
		tabla.addColumn("Horas");
		tabla.addColumn("Asignatura");
		tblTableCurso.setModel(tabla);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
		if (e.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(e);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
	}
	protected void actionPerformedBtnConsultar(ActionEvent e) {
		
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
	}
	
	protected void actionPerformedBtnEliminar(ActionEvent e) {
	}
	
}
