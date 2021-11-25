package guis;

import java.awt.EventQueue;
import arreglos.ArregloRetiro;
import clases.Retiro;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class DlgRetiro2 extends JDialog implements ActionListener {
	private final JPanel contentPanel = new JPanel();
	private JLabel lblnumRetiro;
	private JTextField txtanumRetiro;
	private JLabel lblnumMatricula;
	private JTextField txtnumMatricula;
	private JLabel lblFecha;
	private JTextField txtFecha;
	private JLabel lblHora;
	private JTextField txtHora;
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgRetiro dialog = new DlgRetiro();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	/**
	 * Create the dialog.
	 */
	public DlgRetiro() {
		setResizable(false);
		setTitle("Registro | Retiro");
		setBounds(100, 100, 710, 410);
		getContentPane().setLayout(null);

		lblImgRetiro = new JLabel();
		lblImgRetiro.setIcon(new ImageIcon("imagenes/dlgRetiro.png"));
		lblImgRetiro.setBounds(400, 10, 89, 88);
		getContentPane().add(lblImgRetiro);
		
		lblnumRetiro = new JLabel("C\u00F3digo");
		lblnumRetiro.setBounds(10, 10, 50, 23);
		getContentPane().add(lblnumRetiro);
		
		btnnumMatricula = new JButton("P");
		btnnumMatricula.addMouseListener(this);
		btnnumMatricula.setForeground(Color.BLUE);
		btnnumMatricula.setBounds(10, 40, 50, 23);
		getContentPane().add(btnnumMatricula);
	
		btncodAlumno = new JButton("C");
		btncodAlumno.addMouseListener(this);
		btncodAlumno.setForeground(Color.BLUE);
		btncodAlumno.setBounds(10, 70, 50, 23);
		getContentPane().add(btncodAlumno);
		
		txtnumRetiro = new JTextField();
		txtnumRetiro.setBounds(70, 10, 85, 23);
		getContentPane().add(txtnumRetiro);
		txtnumRetiro.setColumns(10);
		
		txtnumMatricula = new JTextField();
		txtnumMatricula.setBounds(70, 40, 85, 23);
		getContentPane().add(txtnumMatricula);
		txtnumMatricula.setColumns(10);
	
		txtcodAlumno = new JTextField();
		txtcodAlumno.setBounds(70, 70, 85, 23);
		getContentPane().add(txtcodAlumno);
		txtcodAlumno.setColumns(10);
		
		cbonumMatricula = new JComboBox <String> ();
		cbonumMatricula.addActionListener(this);
		cbonumMatricula.addMouseListener(this);
		cbonumMatricula.setBounds(190, 40, 100, 23);
		getContentPane().add(cbonumMatricula);
		colocarnumMatricula();

		cboNumeroCama = new JComboBox <String> ();
		cboNumeroCama.addActionListener(this);
		cboNumeroCama.addMouseListener(this);
		cboNumeroCama.setBounds(190, 70, 100, 23);
		getContentPane().add(cboNumeroCama);
		colocarNumerosCamas();

		btnInternar = new JButton("Internar");
		btnInternar.addActionListener(this);
		btnInternar.addMouseListener(this);
		btnInternar.setForeground(Color.BLUE);
		btnInternar.setBounds(535, 10, 150, 23);
		getContentPane().add(btnInternar);
		
		btnProceder = new JButton("Proceder");
		btnProceder.addActionListener(this);
		btnProceder.addMouseListener(this);
		btnProceder.setForeground(Color.BLUE);
		btnProceder.setBounds(189, 10, 102, 23);
		getContentPane().add(btnProceder);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 110, 675, 250);
		getContentPane().add(scrollPane);

		tblRetiro = new JTable();
		tblRetiro.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tblRetiro.addKeyListener(this);
		tblRetiro.addMouseListener(this);
		tblRetiro.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblRetiro);

		modelo = new DefaultTableModel();
		modelo.addColumn("numRetiro");
		modelo.addColumn("numMatricula");
		modelo.addColumn("codAlumno");
		modelo.addColumn("fecha");
		modelo.addColumn("hora");
		
		tblInternamiento.setModel(modelo);
		
		txtnumRetiro.setEditable(false);
		txtnumMatricula.setEditable(false);
		txtcodAlumno.setEditable(false);
		
		btnProceder.setEnabled(false);
		ajustarAnchoColumnas();
		listar();
		editarFila();
		
	}
	//  Declaración global
	ArregloRetiro ai = new ArregloRetiro();
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == cbocodAlumno) {
			actionPerformedCboNumeroCama(arg0);
		}
		if (arg0.getSource() == cbonumMatricula) {
			actionPerformedCboCodigoPaciente(arg0);
		}
		if (arg0.getSource() == btnProceder) {
			actionPerformedBtnProceder(arg0);
		}
		if (arg0.getSource() == btnInternar) {
			actionPerformedBtnInternar(arg0);
		}
	}
	protected void actionPerformedBtnInternar(ActionEvent arg0) {
		if (cbonumMatricula.getSelectedIndex() < 0)
			mensaje("Matricula");
		else
			if (cbonumMatricula.getSelectedIndex() < 0)
				mensaje("Matricula");
			else {
				btnInternar.setEnabled(false);
				btnProceder.setEnabled(true);
				txtnumRetiro.setText("" + ai.codigoCorrelativo());
				txtnumMatricula.setText("" + cbonumMatricula.getSelectedItem());
				txtcodAlumno.setText("" + cbocodAlumno.getSelectedItem());
				btnProceder.setEnabled(true);
			}
	}
	protected void actionPerformedBtnProceder(ActionEvent arg0) {
		int numRetiro = leernumRetiro();
		int numMatricula = leernumMatricula();
		int codAlumno = leercodAlumno();
		int ok = confirmar(obtenerDatosMatricula() + "\n\n" + obtenerDatosAlumno(), "¿ Desea internar ?");
		if (ok == 0) {
			Retiro nuevo = new Retiro(numRetiro, numMatricula, codAlumno,
                                                    Fecha(), Hora(), "", "", 200.0, 0);
			ai.adicionar(nuevo);
			ArregloAlumno aa = new ArregloAlumno();
			Alumno c = aa.buscar(codAlumno);
			c.setEstado(1);
			aa.actualizarArchivo();
			cbonumMatricula.removeItem(cbonumMatricula.getSelectedItem());
			cbocodAlumno.removeItem(cbocodAlumno.getSelectedItem());
		}
		btnInternar.setEnabled(true);
		btnProceder.setEnabled(false);	
		listar();
		editarFila();	
	}
	protected void actionPerformedCbonumMatricula(ActionEvent arg0) {
		txtnumMatricula.setText("" + cbonumMatricula.getSelectedItem());
	}
	protected void actionPerformedCbocodAlumno(ActionEvent arg0) {
		txtcodAlumno.setText("" + cbocodAlumno.getSelectedItem());
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		arg0.consume();
		editarFila();		
	}
	public void keyTyped(KeyEvent arg0) {
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == btncodAlumno) {
			mouseClickedBtncodAlumno(arg0);
		}
		if (arg0.getSource() == btnnumMatricula) {
			mouseClickedBtnnumMatricula(arg0);
		}
		if (arg0.getSource() == tblRetiro) {
			mouseClickedTblRetiro(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
		if (arg0.getSource() == cbocodAlumno) {
			mouseEnteredCbocodAlumno(arg0);
		}	
		if (arg0.getSource() == cbonumMatricula) {
			mouseEnteredCbonumMatricula(arg0);
		}	
		if (arg0.getSource() == btnProceder) {
			mouseEnteredBtnProceder(arg0);
		}
		if (arg0.getSource() == btnInternar) {
			mouseEnteredBtnInternar(arg0);
		}
		if (arg0.getSource() == btncodAlumno) {
			mouseEnteredBtncodAlumno(arg0);
		}
		if (arg0.getSource() == btnnumMatricula) {
			mouseEnteredBtnnumMatricula(arg0);
		}
		if (arg0.getSource() == tblRetiro) {
			mouseEnteredTblRetiro(arg0);
		}
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void mouseClickedTblRetiro(MouseEvent arg0) {
		btnProceder.setEnabled(false);
		btnInternar.setEnabled(true);
		editarFila();
	}
	protected void mouseClickedBtnnumMatricula(MouseEvent arg0) {
		mensaje(obtenerDatosMatricula());
	}
	protected void mouseClickedBtncodAlumno(MouseEvent arg0) {
		mensaje(obtenerDatosAlumno());
	}
	protected void mouseEnteredTblRetiro(MouseEvent arg0) {
		tblRetiro.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnnumMatricula(MouseEvent arg0) {
		btnnumMatricula.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtncodAlumno(MouseEvent arg0) {
		btncodAlumno.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredBtnProceder(MouseEvent arg0) {
		btnProceder.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	protected void mouseEnteredCbonumMatricula(MouseEvent arg0) {
		cbonumMatricula.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}	
	protected void mouseEnteredCbocodAlumno(MouseEvent arg0) {
		cbocodAlumno.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}
	//  Métodos tipo void (sin parámetros)
	void ajustarAnchoColumnas() {
		TableColumnModel tcm = tblInternamiento.getColumnModel();
		tcm.getColumn(0).setPreferredWidth(anchoColumna(10));  // numRetiro
		tcm.getColumn(1).setPreferredWidth(anchoColumna(11));  // numMatricula
		tcm.getColumn(2).setPreferredWidth(anchoColumna( 7));  // codAlumno
		tcm.getColumn(3).setPreferredWidth(anchoColumna(18));  // fecha
		tcm.getColumn(4).setPreferredWidth(anchoColumna( 8));  // hora
	}
	void colocarCodigosPacientes() {	
		ArregloPacientes ap = new ArregloPacientes();
		Paciente p;
		for (int i=0; i<ap.tamaño(); i++) {
			p = ap.obtener(i);
			if (ai.procedenumMatricula(p.getnumMatricula()))
				cbonumMatricula.addItem("" + p.getnumMatricula());
		}
	}
	void colocarNumerosAlumno() {
		ArregloAlumno aa = new ArregloAlumno();
		Alumno a;
		for (int i=0; i<aa.tamaño(); i++) {
			a = aa.obtener(i);
			if (a.getEstado() == 0)
				codAlumno.addItem("" + a.getcodAlumno());
		}
	}
	void listar() {
		int posFila = 0;
		if (modelo.getRowCount() > 0)
			posFila = tblRetiro.getSelectedRow();
		if (modelo.getRowCount() == ai.tamaño() - 1)
			posFila = ai.tamaño() - 1;
		if (posFila == ai.tamaño())
			posFila --;
		modelo.setRowCount(0);
		Retiro i;
		for (int j=0; j<ai.tamaño(); j++) {
			i = ai.obtener(j);
			Object[] fila = { i.getnumRetiro(),
					          i.getnumMatricula(),
					          i.getcodAlumno(),
					          Fecha.enTextoFecha(i.getFecha()),
					          Fecha.enTextoFecha(i.getFecha()),
					          Lib.estadosRetiro[i.getEstado()] };
			modelo.addRow(fila);
		}
		if (ai.tamaño() > 0)
			tblRetiro.getSelectionModel().setSelectionInterval(posFila, posFila);
	}
	void editarFila() {
		if (ai.tamaño() == 0)
			txtnumRetiro.setText("" + ai.codigoCorrelativo());
		else {
			Retiro i = ai.obtener(tblRetiro.getSelectedRow());
			txtnumRetiro.setText("" + i.getnumRetiro());
			txtnumMatricula.setText("" + i.getnumMatricula());
			txtcodAlumno.setText("" + i.getcodAlumno());
		}
	}
	//  Métodos tipo void (con parámetros)
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s, "Informe de Retiro", 1);
	}
	void mensaje(String s1, String s2) {
		JOptionPane.showMessageDialog(this, s1, s2, 1);
	}
	void error(String s, JTextField txt) {
		mensaje(s);
		txt.setText("");
		txt.requestFocus();
	}
	//  Métodos que retornan valor (sin parámetros)
	int leernumRetiro() {
		return Integer.parseInt(txtnumRetiro.getText().trim());
	}
	int leernumMatricula() {
		return Integer.parseInt(txtnumMatricula.getText().trim());
	}
	int leerNumeroCama() {
		return Integer.parseInt(txtcodAlumno.getText().trim());
	}
	//  Métodos que retornan valor (con parámetros)
	int anchoColumna(int porcentaje) {
		return porcentaje * scrollPane.getWidth() / 100;
	}
	int confirmar(String s) {
		return JOptionPane.showConfirmDialog(this, s, "Alerta", 0, 1, null);
	}
	int codAlumno(String s1, String s2) {
		return JOptionPane.showConfirmDialog(this, s1, s2, 0, 1, null);
	}
	
}