
import java.awt.event.ActionListener;
import javax.swing.*;

public class ApproveBookingView extends JFrame{

    private final JButton approveButton = new JButton("Approve");

    ApproveBookingView(){

        JPanel approvePanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        
        approvePanel.add(approveButton);
        this.add(approvePanel);
    }

    void addApproveBookingListener(ActionListener listenForCalcButton){

        approveButton.addActionListener(listenForCalcButton);

    }

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
