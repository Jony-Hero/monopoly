package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.IOwner;

public class CCCellInfoFormatter implements CellInfoFormatter {
    public String format(IOwner cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}
