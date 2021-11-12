package guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Proyecto_AED_2021_II extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmAlumno;
	private JMenuBar menuBar;
	private JMenu mnRegistro;
	private JMenuItem mntmCurso;
	private JMenuItem mntmMatricula;
	private JMenuItem mntmRetiro;
	private JMenu mnConsulta;
	private JMenuItem mntmAlumnosCursos;
	private JMenu mnReporte;
	private JMenuItem mntmAlumnosMatriculaPendiente;
	private JMenuItem mntmAlumnosMatriculaVigente;
	private JMenuItem mntmAlumnosMatriculaCurso;
	private JMenuItem mntmMatriculaRetiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto_AED_2021_II frame = new Proyecto_AED_2021_II();
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
	public Proyecto_AED_2021_II() {
		setTitle("Jupiter School");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Proyecto_AED_2021_II.class.getResource("/img/JUPITER_SCHOOL_MINI_sin fondo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/salida.png")));
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/escolar.png")));
		mntmAlumno.addActionListener(this);
		mnMantenimiento.add(mntmAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/cursos.png")));
		mntmCurso.addActionListener(this);
		mnMantenimiento.add(mntmCurso);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmMatricula = new JMenuItem("Matricula");
		mntmMatricula.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/nuevo estudiante.png")));
		mntmMatricula.addActionListener(this);
		mnRegistro.add(mntmMatricula);
		
		mntmRetiro = new JMenuItem("Retiro");
		mntmRetiro.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/eliminar.png")));
		mntmRetiro.addActionListener(this);
		mnRegistro.add(mntmRetiro);
		
		mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		mntmAlumnosCursos = new JMenuItem("Alumno y Cursos");
		mntmAlumnosCursos.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/buscar.png")));
		mntmAlumnosCursos.addActionListener(this);
		mnConsulta.add(mntmAlumnosCursos);
		
		mntmMatriculaRetiro = new JMenuItem("Matricula y Retiros");
		mntmMatriculaRetiro.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/buscar.png")));
		mntmMatriculaRetiro.addActionListener(this);
		mnConsulta.add(mntmMatriculaRetiro);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mntmAlumnosMatriculaPendiente = new JMenuItem("Alumnos con matr\u00EDcula pendiente");
		mntmAlumnosMatriculaPendiente.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/reporte.png")));
		mntmAlumnosMatriculaPendiente.addActionListener(this);
		mnReporte.add(mntmAlumnosMatriculaPendiente);
		
		mntmAlumnosMatriculaVigente = new JMenuItem("Alumnos con matr\u00EDcula vigente");
		mntmAlumnosMatriculaVigente.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/reporte.png")));
		mntmAlumnosMatriculaVigente.addActionListener(this);
		mnReporte.add(mntmAlumnosMatriculaVigente);
		
		mntmAlumnosMatriculaCurso = new JMenuItem("Alumnos matriculados por curso");
		mntmAlumnosMatriculaCurso.setIcon(new ImageIcon(Proyecto_AED_2021_II.class.getResource("/img/iconos/reporte.png")));
		mntmAlumnosMatriculaCurso.addActionListener(this);
		mnReporte.add(mntmAlumnosMatriculaCurso);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmSalir) {
			actionPerformedmntmSalir(e);
		}
		if(e.getSource() == mntmAlumno) {
			actionPerformedmntmAlumno(e);
		}
		if(e.getSource() == mntmCurso) {
			actionPerformedmntmCurso(e);
		}
		if(e.getSource() == mntmMatricula) {
			actionPerformedmntmMatricula(e);
		}
		if(e.getSource() == mntmRetiro) {
			actionPerformedmntmRetiro(e);
		}
		if(e.getSource() == mntmAlumnosCursos) {
			actionPerformedmntmAlumnosCursos(e);
		}
		if(e.getSource() == mntmMatriculaRetiro) {
			actionPerformedmntmMatriculaRetiro(e);
		}
		if(e.getSource() == mntmAlumnosMatriculaPendiente) {
			actionPerformedmntmAlumnosMatriculaPendiente(e);
		}
		
		if(e.getSource() == mntmAlumnosMatriculaVigente) {
			actionPerformedmntmAlumnosMatriculaVigente(e);
		}
		if(e.getSource() == mntmAlumnosMatriculaCurso) {
			actionPerformedmntmAlumnosMatriculaCurso(e);
		}
	}


	

	public void actionPerformedmntmSalir(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	public void actionPerformedmntmAlumno(ActionEvent e) {
		
		DlgAlumnos a = new DlgAlumnos();
		a.setLocationRelativeTo(this);
		a.setVisible(true);
	}
	public void actionPerformedmntmCurso(ActionEvent e) {
		DlgCurso c = new DlgCurso();
		c.setLocationRelativeTo(this);
		c.setVisible(true);
		
	}
	public void actionPerformedmntmMatricula(ActionEvent e) {
		DlgMatricula m = new DlgMatricula();
		m.setLocationRelativeTo(this);
		m.setVisible(true);
		
	}
	public void actionPerformedmntmRetiro(ActionEvent e) {
		DlgRetiro r = new DlgRetiro();
		r.setLocationRelativeTo(this);
		r.setVisible(true);
		
	}
	public void actionPerformedmntmAlumnosCursos(ActionEvent e) {
		// TODO Auto-generated method stub
		DlgAlumnosCursos a = new DlgAlumnosCursos();
		a.setLocationRelativeTo(this);
		a.setVisible(true);
	}
	public void actionPerformedmntmAlumnosMatriculaPendiente(ActionEvent e) {
		DlgAlumnosMatriculaPendiente a = new DlgAlumnosMatriculaPendiente();
		a.setLocationRelativeTo(this);
		a.setVisible(true);
		
	}
	public void actionPerformedmntmAlumnosMatriculaVigente(ActionEvent e) {
		DlgAlumnosMatriculaVigente a = new DlgAlumnosMatriculaVigente();
		a.setLocationRelativeTo(this);
		a.setVisible(true);
	}
	public void actionPerformedmntmAlumnosMatriculaCurso(ActionEvent e) {
		DlgAlumnosMatriculaporCurso a = new DlgAlumnosMatriculaporCurso();
		a.setLocationRelativeTo(this);
		a.setVisible(true);
		
	}
	public void actionPerformedmntmMatriculaRetiro(ActionEvent e) {
		DlgMatriculaRetiro m = new DlgMatriculaRetiro();
		m.setLocationRelativeTo(this);
		m.setVisible(true);
		
	}
}
