package chapter12.refactor1;

import chapter12.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler{
    @Override
    public int select(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
