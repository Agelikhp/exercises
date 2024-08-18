package LocationFormatter.java;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class LocationFormatter {
    public static void main(String[] args) {
        String inputFile = "locations.txt";
        String outputFile = "formatted_locations.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            writer.write("[\n"); // Start of JSON array
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // Skip header line
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String location = parts[0].trim();
                    String latitude = parts[1].trim();
                    String longitude = parts[2].trim();
                    writer.write(String.format("  { location: '%s', latitude: %s, longitude: %s },\n", location, latitude, longitude));
                }
            }

            writer.write("]\n"); // End of JSON array

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


