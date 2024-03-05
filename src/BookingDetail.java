import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class BookingDetail {
    private String passengerName;
    private int busNo;
    private LocalDate date;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BookingDetail(int busNo) {
        System.out.println("Enter your Details");
        Scanner sc=new Scanner(System.in);
        System.out.println("Name :");
        this.passengerName = sc.nextLine();

        this.busNo = busNo;

        System.out.println("Date in (Date-Month-Year) :");
        String dateString=sc.nextLine();
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate datee = LocalDate.parse(dateString,dTF);
        this.date = datee;
        System.out.println("Booked Succesfully...");
    }



}
