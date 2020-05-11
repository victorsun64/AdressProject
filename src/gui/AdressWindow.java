package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class AdressWindow {

	protected Shell shell;
	private Text txtVN;
	private Text txtNN;
	private Text txtOrt;
	private Text txtPLZ;
	private Text txtStra;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AdressWindow window = new AdressWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(901, 536);
		shell.setText("SWT Application");
		
		Button btnSpeichern = new Button(shell, SWT.NONE);
		btnSpeichern.setBounds(10, 435, 105, 35);
		btnSpeichern.setText("Speichern");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(237, 435, 232, 35);
		btnNewButton.setText("Laden aus Datei");
		
		Button btnSchreiben = new Button(shell, SWT.NONE);
		btnSchreiben.setBounds(588, 435, 250, 35);
		btnSchreiben.setText("Schreiben in Datei");
		
		Label lblVN = new Label(shell, SWT.NONE);
		lblVN.setBounds(10, 10, 90, 25);
		lblVN.setText("Vorname");
		
		txtVN = new Text(shell, SWT.BORDER);
		txtVN.setBounds(130, 7, 80, 31);
		
		Label lblNN = new Label(shell, SWT.NONE);
		lblNN.setBounds(10, 60, 105, 25);
		lblNN.setText("Nachname");
		
		txtNN = new Text(shell, SWT.BORDER);
		txtNN.setBounds(130, 60, 80, 31);
		
		Label lblOrt = new Label(shell, SWT.NONE);
		lblOrt.setBounds(10, 108, 81, 25);
		lblOrt.setText("Ort");
		
		txtOrt = new Text(shell, SWT.BORDER);
		txtOrt.setBounds(130, 108, 80, 31);
		
		Label lblPLZ = new Label(shell, SWT.NONE);
		lblPLZ.setBounds(10, 166, 81, 25);
		lblPLZ.setText("PLZ");
		
		txtPLZ = new Text(shell, SWT.BORDER);
		txtPLZ.setBounds(130, 163, 80, 31);
		
		Label lblStra = new Label(shell, SWT.NONE);
		lblStra.setBounds(10, 221, 81, 25);
		lblStra.setText("Stra\u00DFe");
		
		txtStra = new Text(shell, SWT.BORDER);
		txtStra.setBounds(130, 218, 80, 31);

	}
	public Text getTxtVN() {
		return txtVN;
	}
	public Text getTxtNN() {
		return txtNN;
	}
	public Text getTxtOrt() {
		return txtOrt;
	}
	public Text getTxtPLZ() {
		return txtPLZ;
	}
	public Text getTxtStra() {
		return txtStra;
	}
}
