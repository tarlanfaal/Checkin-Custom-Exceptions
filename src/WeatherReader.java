import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WeatherReader extends Exception {
    Scanner scanner = new Scanner(System.in);

    public void checkFileExists(File file) throws WeatherFileNotFoundException {
        if (!file.exists()) {
            throw new WeatherFileNotFoundException("Exception: File does not exist");
        }
    }

    public void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("Weather data from file");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
        public void processWeatherFile (String filePath){
            File fr = new File(filePath);

            try {
                checkFileExists(fr);

                readFile(fr);

            } catch (WeatherFileNotFoundException e) {
                System.out.println("Exception: Input file is not available");

            }

        }
    }
