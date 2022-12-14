package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static subway.constants.ErrorMessage.DUPLICATED_STATION_ERROR_MESSAGE;
import static subway.constants.ErrorMessage.NON_PRESENT_STATION_ERROR_MESSAGE;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static void validateDuplicatedStation(Station station){
        if(isPresentStation(station)){
            throw new IllegalArgumentException(DUPLICATED_STATION_ERROR_MESSAGE.getMessage());
        }
    }
    public static void validatePresentStation(Station station){
        if(!isPresentStation(station)){
            throw new IllegalArgumentException(NON_PRESENT_STATION_ERROR_MESSAGE.getMessage());
        }
    }
    public static boolean isPresentStation(Station station) {
        return stations.stream().anyMatch(s -> s.isSame(station));
    }


}
