package eu.dety.burp.joseph.gui;

import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * Help tab with information about this extension
 *
 * @author Dennis Detering
 * @version 1.0
 */
public class UIHelp extends JPanel {

    private JPanel mainPanel;

    public UIHelp() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Dennis Detering
        ResourceBundle bundle = ResourceBundle.getBundle("JOSEPH");
        headlineLabel = new JLabel();
        sublineLabel = new JLabel();
        copyrightLabel = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- headlineLabel ----
        headlineLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        headlineLabel.setText(bundle.getString("NAME_WITH_VERSION"));

        //---- sublineLabel ----
        sublineLabel.setText(bundle.getString("NAME_LONG"));

        //---- copyrightLabel ----
        copyrightLabel.setText(bundle.getString("COPYRIGHT"));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(copyrightLabel, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addContainerGap())
                        .addComponent(headlineLabel, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                        .addComponent(sublineLabel, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addComponent(headlineLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(sublineLabel)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(copyrightLabel)
                    .addGap(0, 234, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Dennis Detering
    private JLabel headlineLabel;
    private JLabel sublineLabel;
    private JLabel copyrightLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}