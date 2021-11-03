package guis;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class DlgAlumnosMatriculaVigente extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgAlumnosMatriculaVigente dialog = new DlgAlumnosMatriculaVigente();
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
	public DlgAlumnosMatriculaVigente() {
		setBounds(100, 100, 450, 300);

	}

}
