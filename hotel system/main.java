package full_hotel_sys;
import javax.swing.JOptionPane;
public class Full_Hotel_Sys {

  static staff staff1 = new staff("Ezzeldin Bassam", "123abc");
    static staff staff2 = new staff("Abdullah Sameh", "456def");
    static staff staff3 = new staff("Marrwan Samy", "789ghi");
    static staff staff4 = new staff("Jodie Tamer", "101jkl");
    static staff staff5 = new staff("Malak Mohab", "112mno");
    static staff staff6=new staff("Maya Hazem", "123xyz");
    static Hotel OurHotel = new Hotel(3, 5);
    static staff[] staff = {staff1, staff2, staff3, staff4, staff5,staff6};
    public static void main(String[] args) {
 
        boolean auth = Login();
        int in;
        if (auth) {
            JOptionPane.showMessageDialog(null, "Welcome to the hotel management system!");

            while (auth) {
                String options = """
                        Please choose what you want to do:
                        1) Show all rooms.
                        2) Show all available rooms.
                        3) Show all booked rooms.
                        4) Make a reservation.
                        0) To Logout.""";
                in = Integer.parseInt(JOptionPane.showInputDialog(null, options));

                switch (in) {
                    case 0:
                        auth = false;
                        break;
                    case 1:
                        OurHotel.ShowAllRooms();
                        break;
                    case 2:
                        OurHotel.ShowAvailableRooms();
                        break;
                    case 3:
                        OurHotel.ShowBookedRooms();
                        break;
                    case 4:
                        Reservation();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please enter a valid number!");
                }
            }
        }
    }

    static boolean Login() {
        String staffID, password;
        while (true) {
            staffID = JOptionPane.showInputDialog(null, "Enter your staff ID:");
            if (staffID == null) {
                return false;
            }
            for (int i = 0; i < staff.length; i++) {
                if (staffID.equalsIgnoreCase(staff[i].staffID)) {
                    password = JOptionPane.showInputDialog(null, "Enter your password:");
                    if (password != null && password.equals(staff[i].password)) {
                        return true;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Incorrect username or password!");
        }
    }

    static void Reservation() {
        int in;
        String numberBeds = JOptionPane.showInputDialog(null, "Enter the number of beds you need in the room:");
        if (numberBeds == null) {
            return;
        }
        try {
            in = Integer.parseInt(numberBeds);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number of beds!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        OurHotel.SearchByNumOfBeds(in);
        String roomNumber = JOptionPane.showInputDialog(null, "Choose the room you want to reserve (Enter room number):");
        if (roomNumber == null) {
            return;
        }
        try {
            in = Integer.parseInt(roomNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid room number!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        OurHotel.Reservation(in);
        JOptionPane.showMessageDialog(null, "Reservation complete!");
    } 
 
    }
    
