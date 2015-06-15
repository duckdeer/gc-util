package de.isys.gcutil.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GCUtil {
	
	private Button btnLoadFile;
	private Text txtFile;
	private Button btnRemoveAppTimes;
	private Button btnTimeAnalyzer;
	private Button btnRunOperation;
	private Text txtOutput;

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		shell.setText("GC Util");
		
		GCUtil gcUtil = new GCUtil();
		gcUtil.createUi(shell);
		gcUtil.makeActions();
		gcUtil.addListeners();
		gcUtil.init();
		
		shell.pack();
		shell.open();
		
		while (! shell.isDisposed()) {
			if (! display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	private void createUi(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(3, false));
		
		Label lblLoadFile = new Label(container, SWT.None);
		lblLoadFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		lblLoadFile.setText("File: ");
		
		txtFile = new Text(container, SWT.BORDER);
		txtFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		btnLoadFile = new Button(container, SWT.None);
		btnLoadFile.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		btnLoadFile.setText("Load file");
		
		
		Label lblOperation = new Label(container, SWT.None);
		lblOperation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		lblOperation.setText("Operation: ");
		
		btnRemoveAppTimes = new Button(container, SWT.RADIO);
		btnRemoveAppTimes.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		btnRemoveAppTimes.setText("Remove app times");
		
		Label lblSpacer = new Label(container, SWT.None);
		lblSpacer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		btnTimeAnalyzer = new Button(container, SWT.RADIO);
		btnTimeAnalyzer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
		btnTimeAnalyzer.setText("Analyze times");
		
		
		btnRunOperation = new Button(container, SWT.None);
		btnRunOperation.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, false, 3, 1));
		btnRunOperation.setText("Run operation");
		
		Group grpOutput = new Group(container, SWT.None);
		grpOutput.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		grpOutput.setText("Output");
		
		txtOutput = new Text(grpOutput, SWT.BORDER);
		txtOutput.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 5));
	}

	private void makeActions() {
		// TODO Auto-generated method stub
		
	}

	private void addListeners() {
		// TODO Auto-generated method stub
		
	}


	private void init() {
		// TODO Auto-generated method stub
		
	}

}
