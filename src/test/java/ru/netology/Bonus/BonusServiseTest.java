package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.Bonus.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculateF(String test, long amaount, boolean registered, long expected) {
        BonusService service = new BonusService();
        long actual = service.calculate(amaount, registered);
        assertEquals(expected, actual);
    }
}

