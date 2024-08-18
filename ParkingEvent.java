import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ParkingEvent {
    int time;
    int type; // 1 for arrival, 0 for departure

    public ParkingEvent(int time, int type) {
        this.time = time;
        this.type = type;
    }
}

class ParkingLot {
    public static void main(String[] args) {
        int[][] arr = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };

        System.out.println("Maximum number of cars parked at the same time: " + findMaxCarsParked(arr));
    }

    public static int findMaxCarsParked(int[][] intervals) {
        List<ParkingEvent> events = new ArrayList<>();

        // Convert the intervals into events
        for (int[] interval : intervals) {
            events.add(new ParkingEvent(interval[0], 1)); // Arrival event
            events.add(new ParkingEvent(interval[1], 0)); // Departure event
        }

        // Sort events by time, if times are equal, departure should come before arrival
        Collections.sort(events, new Comparator<ParkingEvent>() {
            @Override
            public int compare(ParkingEvent e1, ParkingEvent e2) {
                if (e1.time == e2.time) {
                    return e1.type - e2.type; // Departure before arrival if times are the same
                }
                return e1.time - e2.time;
            }
        });

        int maxCars = 0;
        int currentCars = 0;

        // Traverse the events to find the maximum number of cars parked at the same time
        for (ParkingEvent event : events) {
            if (event.type == 1) {
                currentCars++;
            } else {
                currentCars--;
            }
            maxCars = Math.max(maxCars, currentCars);
        }

        return maxCars;
    }
}

