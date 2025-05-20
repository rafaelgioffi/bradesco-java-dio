package br.com.dio.ui.custom.panel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static java.awt.Color.black;

public class SudokuSector extends JPanel {

    public SudokuSector() {
        var dimension = new Dimension(170, 170);
        setSize(dimension);
        setPreferredSize(dimension);
        setBorder(new LineBorder(black, 2, true));
        setVisible(true);
    }
}
