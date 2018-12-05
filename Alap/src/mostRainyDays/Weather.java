package mostRainyDays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Weather {

//  Write a method which can read and parse a file containing information about weather in various cities.
//  The method must return the name of the city which had the most rainy days.
// Output: ...


  public static void main(String[] args) {
    String city = getCityWithMostRainyDays("cities.csv");
    System.out.println("The most rainy city: "+city);

  }


  public static String getCityWithMostRainyDays(String fileName) {


    try {
      Path filePath = Paths.get(fileName);
      List<String> lines = Files.readAllLines(filePath);
//      System.out.println(lines);

      HashMap<String, Integer> numberToWeather = new HashMap<>();

      for (String line : lines) {
        String[] splitted = line.split(",");

//        for (int i = 0; i < splitted.length; i++) {

        if (numberToWeather.containsKey(splitted[1])) {
          numberToWeather.put(splitted[1], numberToWeather.get(splitted[1]) + 1);
        } else {
          numberToWeather.put(splitted[1], 1);
        }
//        }
      }
        int maximumvalue = 0;
        String cityWithMostRainyDays = "";
        for (String city : numberToWeather.keySet()) {
          if (numberToWeather.get(city) > maximumvalue) {
            maximumvalue = numberToWeather.get(city);
            cityWithMostRainyDays=city;

            //System.out.println(maximumvalue);
          }
        }
        return cityWithMostRainyDays;
//      }

    } catch (IOException e) {
      System.out.println("Unable to read file: cities.csv");

    }

    return "";
  }

}


