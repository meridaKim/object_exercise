package oop.example.com.dry_principle;

import java.time.Duration;
import java.time.LocalDateTime;

public class PhonePlan {
    public static void main(String [] args){
        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10));
        phone.calling(new Call(LocalDateTime.of(2018,1,1,12,10,0),
                LocalDateTime.of(2018,1,1,12,11,0)));
        phone.calling(new Call(LocalDateTime.of(2018,1,2,12,10,0),
                LocalDateTime.of(2018,1,2,12,11,0)));

        phone.calculateFee();
    }

}
