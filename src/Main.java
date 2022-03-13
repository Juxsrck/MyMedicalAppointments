import java.util.Date;

import static UI.UIMenu.*;

import static UI.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Justine Pulido","Neurología");
        myDoctor.addAvailableAppointment(new Date(), "10Pm");
        myDoctor.addAvailableAppointment(new Date(), "4Pm");
        myDoctor.addAvailableAppointment(new Date(), "9Am");

        System.out.println(myDoctor);
        /*
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
*/
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Aleja", "aleja@mail.com");

        System.out.println(patient);
    }
}
