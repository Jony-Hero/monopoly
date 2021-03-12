package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IOwner;

public class GotoJailCellInfoFormatter implements CellInfoFormatter {

    public static final String GOTO_JAIL_LABEL = "<html><b>Go to Jail</b></html>";

    public String format(IOwner cell) {
    	return GOTO_JAIL_LABEL;
	}
}
