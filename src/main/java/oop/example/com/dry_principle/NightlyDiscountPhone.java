package oop.example.com.dry_principle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone {
    //심야 요금 할인 (10시 이후 2원)
    private static final int LATE_NIGHT_HOUR =22;

    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }
    public Money calculateFee(){
        Money result = Money.ZERO;

        for(Call call : calls){
            if(call.getFrom().getHour() >=LATE_NIGHT_HOUR){
                 result = result.plus(nightlyAmount.times(call.getDuration().getSeconds()/ seconds.getSeconds()));
            }else {
                result = result.plus(regularAmount.times(call.getDuration().getSeconds()/ seconds.getSeconds()));
            }

        }
        return result;
    }
}
