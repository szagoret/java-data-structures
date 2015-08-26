package dsa.recursion;

/**
 * Created by szagoret on 8/25/2015.
 */
public class EnglishRuler {

    /**
     * Draws an English ruler for given number of inches and major tick length
     *
     * @param nInches
     * @param majorLength
     */
    public static void drawRuler(int nInches, int majorLength) {
        drawLine(majorLength, 0);               // draw inch 0 line and label
        for (int j = 0; j < nInches; j++) {
            drawInterval(majorLength - 1);      // draw interior ticks for inch
            drawLine(majorLength);              //draw inch j line and label
        }
    }

    /**
     * @param centralLength
     */
    private static void drawInterval(int centralLength) {
        if (centralLength >= 1) {               // otherwise do nothing
            drawInterval(centralLength - 1);    // recursively draw top interval
            drawLine(centralLength);            // draw center tick line (without label)
            drawInterval(centralLength - 1);      // recursively draw bottom interval
        }
    }

    private static void drawLine(int tickLength, int tickLabel) {
        for (int j = 0; j < tickLength; j++) {
            System.out.println(" " + tickLabel);
            System.out.println();
        }
    }

    /**
     * Draws a line with the given tick length (but no label)
     *
     * @param tickLength
     */
    private static void drawLine(int tickLength) {
        drawLine(tickLength - 1);
    }

    public static void main(String[] args) {
        drawInterval(3);
    }
}
