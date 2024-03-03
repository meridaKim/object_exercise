package oop.example.com.dry_principle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RegularPhone extends Phone{
    private Money amount;
    private Duration seconds;

    public RegularPhone(Money amount, Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    @Override
    protected Money calculateCallFee(Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
