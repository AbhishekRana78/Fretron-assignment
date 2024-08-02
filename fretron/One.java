import javax.swing.*;
import java.awt.*;

public class One {
    
    public static void main(String[] args) {
        int[][][] flightsCoordinates = {
            {{1, 1}, {2, 2}, {2, 2}},   // Flight 1
            {{1, 1}, {2, 3}, {3, 2}},   // Flight 2
            {{1, 1}, {4, 2}, {3, 4}}    // Flight 3
        };

        JFrame frame = new JFrame("Flight Paths");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        FlightPaths flightPaths = new FlightPaths(flightsCoordinates);
        frame.add(flightPaths);

        frame.setVisible(true);
    }

    static class FlightPaths extends JPanel {

        private int[][][] flightsCoordinates;

        public FlightPaths(int[][][] coordinates) {
            flightsCoordinates = coordinates;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (int[][] flightCoords : flightsCoordinates) {
                drawFlightPath(g, flightCoords);
            }
        }

        private void drawFlightPath(Graphics g, int[][] coords) {
            for (int i = 0; i < coords.length - 1; i++) {
                int x1 = coords[i][0] * 50;
                int y1 = coords[i][1] * 50;
                int x2 = coords[i + 1][0] * 50;
                int y2 = coords[i + 1][1] * 50;

                g.drawLine(x1, y1, x2, y2);
            }
        }
    }
}
