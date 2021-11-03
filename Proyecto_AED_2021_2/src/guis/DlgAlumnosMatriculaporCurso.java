package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class DlgAlumnosMatriculaporCurso extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAlumnosMatriculaporCurso dialog = new DlgAlumnosMatriculaporCurso();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DlgAlumnosMatriculaporCurso() {
		setBounds(100, 100, 450, 300);

	}

}
