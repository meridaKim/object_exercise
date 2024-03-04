package oop.example.com.dry_principle;

import static oop.example.com.dry_principle.Money.wons;

import java.time.Duration;
import java.time.LocalDateTime;

public class PhonePlan {
    public static void main(String [] args){
        Phone phone = new Phone(new RegularPolicy(wons(10),Duration.ofSeconds(10)));
        Phone phone2 = new Phone (new NightlyDiscountPolicy (Money wons(5),
                wons (10), Duration.ofSeconds(10)));
        phone.call(new Call(LocalDateTime.of(2018,1,1,12,10,0),
                LocalDateTime.of(2018,1,1,12,11,0)));
        phone2.call(new Call(LocalDateTime.of(2018,1,2,12,10,0),
                LocalDateTime.of(2018,1,2,12,11,0)));

        phone.calculateFee();
    }

}
