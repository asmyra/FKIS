import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApproveBookingController {

    private ApproveBookingView theView;
    private ApproveBookingModel theModel;
    
    public ApproveBookingController(ApproveBookingView theView, ApproveBookingModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addApproveBookingListener(new ApproveBookingListener());
    }
    
    class ApproveBookingListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             

         
        }

    }

}

