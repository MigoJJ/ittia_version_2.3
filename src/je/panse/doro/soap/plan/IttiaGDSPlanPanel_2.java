package je.panse.doro.soap.plan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class IttiaGDSPlanPanel_2 extends JPanel implements ActionListener {
    private JTextArea textArea;

    public IttiaGDSPlanPanel_2(IttiaGDSPlan frame) {
    	MyClass myClass = MyClass.myMethod2(1);
    	String retA = myClass.getRetA();
    	String[] retB = myClass.getRetB();
        // Other code
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        for (int i = 1; i <= 10; i++) {
            add(new JLabel("Combo Box " + i));
//          JComboBox<String> comboBox = new JComboBox<>(new String[] {"1","2","3"});
            JComboBox<String> comboBox = new JComboBox<>(myClass.getRetB()); // create combo box with retB values
            comboBox.addActionListener(this); // Add action listener to the combo box
            add(comboBox);
        }
        textArea = new JTextArea();
        add(textArea);
        textArea.setVisible(false);
    }

	@Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
        String selectedItem = (String) comboBox.getSelectedItem();
        textArea.append(selectedItem + "\n"); // Append selected item to the target JTextArea
        IttiaGDSPlanPanel_1.appendTextArea(textArea.getText());
    }
}
