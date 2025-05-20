package br.com.dio.ui.custom.input;

import br.com.dio.util.model.Space;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

import static java.awt.Font.PLAIN;

public class NumberText extends JTextField {
    private final Space space;

    public NumberText(Space space) {
        this.space = space;
        var dimension = new Dimension(50, 50);
        setSize(dimension);
        setPreferredSize(dimension);
        setVisible(true);
        setFont(new Font("Arial", PLAIN, 20));
        setHorizontalAlignment(CENTER);
        setDocument(new NumberTextLimit());
        setEnabled(!space.isFixed());
        if (space.isFixed()) {
            setText(space.getActual().toString());
        }
        getDocument().addDocumentListener(new DocumentListener() {

            private void changeSpace() {
                if (getText().isEmpty()) {
                    space.clearSpace();
                    return;
                }
                space.setActual(Integer.parseInt(getText()));
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                changeSpace();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changeSpace();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changeSpace();
            }
        });
    }
}
