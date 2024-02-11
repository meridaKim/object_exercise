package oop.example.com.reservation;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
