package oop.reservation_movie.reservation;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
