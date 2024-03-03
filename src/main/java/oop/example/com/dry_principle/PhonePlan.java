package oop.example.com.dry_principle;

import java.time.Duration;
import java.time.LocalDateTime;

public class PhonePlan {
    public static void main(String [] args){
        RegularPhone regularPhone = new RegularPhone(Money.wons(5), Duration.ofSeconds(10));
//        regularPhone.call(new Call(LocalDateTime.of(2018,1,1,12,10,0),
//                LocalDateTime.of(2018,1,1,12,11,0)));
//        regularPhone.call(new Call(LocalDateTime.of(2018,1,2,12,10,0),
//                LocalDateTime.of(2018,1,2,12,11,0)));

        regularPhone.calculateFee();
    }

}
