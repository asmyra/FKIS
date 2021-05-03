public class MVCApproveBooking {

    public static void main(String[] args) {

        ApproveBookingView theView = new ApproveBookingView();

        ApproveBookingModel theModel = new ApproveBookingModel();

        ApproveBookingController theController = new ApproveBookingController(theView,theModel);

        theView.setVisible(true);

    }

}
