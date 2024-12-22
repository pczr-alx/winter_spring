package pl.alx.cicd.winter_spring.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class KalkulatorServiceTest {
    private KalkulatorService kalkulatorService;

    @BeforeEach
    void setUp() {
        kalkulatorService = new KalkulatorService();
    }

    @Test
    void obliczPlus() {
        assertEquals(5, kalkulatorService.oblicz(2, 3, "+"));
    }

    @Test
    void obliczMinus() {
        assertEquals(15, kalkulatorService.oblicz(20, 5, "-"));
    }

    @Test
    void obliczMnozenia() {
        assertEquals(12, kalkulatorService.oblicz(3, 4, "*"));
    }

    @Test
    void testMock() {
        KalkulatorService kalk = mock(KalkulatorService.class);
        when(kalk.oblicz(20, 30, "%")).thenReturn(6L);

        assertEquals(6L, kalk.oblicz(20, 30, "%"));
        verify(kalk).oblicz(20, 30, "%");
    }

}