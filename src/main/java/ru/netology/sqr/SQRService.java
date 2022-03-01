package ru.netology.sqr;

public class SQRService {
    public int numberSquares(int startNumber, int finishNumber) {
        int count = 0;

        for (int i = 10; i <= 99; i++)
            if ((i * i >= startNumber) && (i * i <= finishNumber)) {
                count++;
            }
        return count;

    }
}