package oop.example.com.dry_principle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
    private Money amount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();
    //call의 목록을 관리할 정보 전문가는 Phone이다.

    public Phone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    public void calling(Call call){
        calls.add(call);
    }

    public List<Call> getCalls(){
        return calls;
    }

    public Money getAmount(){
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public Money calculateFee(){
        Money result = Money.ZERO;

        for(Call call : calls){
            result = result.plus(amount.times(call.getDuration().getSeconds()/ seconds.getSeconds()));
        }
        return result;
    }
}
