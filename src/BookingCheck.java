import java.util.ArrayList;
import java.util.List;

public class BookingCheck {

//    availability(busList,bookingDetails,num)

    public static boolean availability(List<Bus> busList, List<BookingDetail> bookingDetails, int num){

        int count=0;
        int seat=0;
        for(BookingDetail b:bookingDetails){
            //Future get date and check
            if(b.getBusNo()==num){
                count++;
            }
        }
        for(Bus bb:busList){
            if(num==bb.getBusId()){
                seat=bb.getSeat();
            }
        }
        if(seat>count){
            return true;
        }
        return  false;

    }
}
