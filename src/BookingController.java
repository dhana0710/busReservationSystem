import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingController {

     static public List<Bus> busList= new ArrayList<Bus>();
     static public List<BookingDetail> bookingDetails=new ArrayList<>();



    private static void addBusDetails(){
        Bus b1=new Bus(112,true,5);
        Bus b2=new Bus(113,true,5);
        Bus b3=new Bus(115,false,3);
        busList.add(b1);
        busList.add(b2);
        busList.add(b3);
    }

    public static void main(String[] args) {
        addBusDetails();
        int request=1;
        while(!(request==0)){
            Scanner sc=new Scanner(System.in);
            //printing bus list to user

            for(Bus b:busList){
                System.out.println(b);
            }
            System.out.printf("For booking enter 1 and exit enter 0 :");
            System.out.println();
            request=sc.nextInt();
            if(request==1){
                System.out.println("Enter Bus number :");
                int num= sc.nextInt();
                //Future get date and check availability for that date.
                if(BookingCheck.availability(busList,bookingDetails,num)){
                    BookingDetail userBooking=new BookingDetail(num);
                    bookingDetails.add(userBooking);
                }else {

                    System.out.println("Currenty there is no availability...");
                    System.out.println("Book other bus...");
                    continue;
                }
                continue;
            }
        }


    }
}
