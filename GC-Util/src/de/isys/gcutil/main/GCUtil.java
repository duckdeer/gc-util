package de.isys.gcutil.main;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class GCUtil {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		shell.setText("GC Util");
		
		GCUtil gcUtil = new GCUtil();
		gcUtil.createUi();
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

	private void createUi() {
		// TODO Auto-generated method stub
		
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
