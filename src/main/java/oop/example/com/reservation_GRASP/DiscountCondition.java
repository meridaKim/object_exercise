package oop.example.com.reservation_GRASP;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    private DiscountConditionType type;

    public boolean isSatisfiedBy(Screening screening){
        if(type == DiscountConditionType.PERIOD){
            return isSatisfiedByPeriod(screening);
        }
        return isSatisfiedBySequence(screening);
    }

    private boolean isSatisfiedBySequence(Screening screening) {
    return sequence == screening.getSequence();
    }

    private boolean isSatisfiedByPeriod(Screening screening) {
    return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
            startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
            endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    }


}
