package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.FileWriter;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.google.gson.Gson;

import data.Address;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AdressWindow {

	protected Shell shell;
	private Text txtVN;
	private Text txtNN;
	private Text txtOrt;
	private Text txtPLZ;
	private Text txtStra;
	//
	ArrayList<Address> addresslist = new ArrayList<Address>();

	/**
	 * Launch the application.
	 * 
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
		btnSpeichern.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//
				Address a; // definition
				a = new Address(); // neue Instanz
				//
				a.setVorname(getTxtVN().getText());
				a.setNachname(getTxtNN().getText());
				a.setOrt(getTxtOrt().getText());
				a.setPLZ(getTxtPLZ().getText());
				a.setStraße(getTxtStra().getText());
				//
				addresslist.add(a);
				//
				// löschen der Felder
				getTxtVN().setText("");
				getTxtNN().setText("");
				getTxtOrt().setText("");
				getTxtPLZ().setText("");
				getTxtStra().setText("");
			}
		});
		btnSpeichern.setBounds(10, 435, 105, 35);
		btnSpeichern.setText("Speichern");

		Button btnLaden = new Button(shell, SWT.NONE);
		btnLaden.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnLaden.setBounds(121, 435, 232, 35);
		btnLaden.setText("Laden aus Datei");

		Button btnSchreiben = new Button(shell, SWT.NONE);
		btnSchreiben.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				Gson.toJson(addresslist, new FileWriter("address.json"));
			}
		});
		btnSchreiben.setBounds(368, 435, 250, 35);
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

		Button btnListe = new Button(shell, SWT.NONE);
		btnListe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// System.out.println(addresslist);
				System.out.println("-----Liste start-----");
				//
				for (Address a : addresslist) {
					System.out.println(a);
				}
				//
				System.out.println("-----");
			}
		});
		btnListe.setBounds(624, 435, 138, 35);
		btnListe.setText("Liste ausgeben");

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
