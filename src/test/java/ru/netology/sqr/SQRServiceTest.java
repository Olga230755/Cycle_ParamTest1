package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void numberSquares() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.numberSquares(200, 500);
        assertEquals(expected, actual);
    }

    @Test
    void numberSquaresDiapasonFirstRange() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.numberSquares(1, 100);
        assertEquals(expected, actual);
    }

    @Test
    void numberSquaresDiapasonLastRange() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.numberSquares(9800, 9900);
        assertEquals(expected, actual);
    }
}