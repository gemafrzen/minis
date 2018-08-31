package main.highesttemperatureseason;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestTemperatureSeasonTest {

    @Test
    void getSeasonWithHighestTemperatureDifference() {
        String season = HighestTemperatureSeason.getSeasonWithHighestTemperatureDifference(new int[] {2, 1, -80, 1, 1, 10, 1, 2, 13, -5, 3, 718});
        assertEquals(HighestTemperatureSeason.AUTUMN, season);
    }
}