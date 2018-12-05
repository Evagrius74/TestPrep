import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

//    ## File read
//    Write a method that can parse an input text file and is able to select all of the words that appear in a certain amount of times in the source file.
//    This method should take 2 parameters:
//            - input file name
//            - frequency (which is a positive integer greater than 0)
//
//    Your solution should be able to handle the case if the input file name does not exists.
//
//            __Example:__
//    For input file `input.txt` and frequency: 2,
//    the method should select the words: apple, pear, pirate
//
//## File write
//
//    Write an other method that can create a new file and write the selected words into it.
//    This method should take 2 parameters:
//            - output file name
//    - array of words
//
//    Your solution should be able to create the new file or if it already exists it should rewrite its content.
//
//    __Example:__
//    For output file `output.txt` and words: [apple, pear, pirate]
//    after the method runs, a new `output.txt` file should be created containing the words.
//    _It does not matter how the method writes the words, they can be separated by new line, space or a comma...etc_


  public static void main(String[] args) {
    //1. Write the selectWordsByFrequency method to find the needed words
    List<String> selectedWords = selectWordsByFrequency("input.txt", 2);
    System.out.println(selectedWords);

    //2. Write the saveSelectedWords method to save the selected words
    saveSelectedWords("output.txt", selectedWords);
  }


  public static ArrayList<String> selectWordsByFrequency(String inputFile, int number) {
    ArrayList<String> selectedWords = new ArrayList<>();
    Map<String, Integer> wordsToNumber = new HashMap<>();
    if (number > 0) {
      try {
        Path filePath = Paths.get(inputFile);
        List<String> lines = Files.readAllLines(filePath);

        for (String line : lines) {
          String[] splitted = line.split(" ");

          for (int i = 0; i < splitted.length; i++) {
            if (wordsToNumber.containsKey(splitted[i])) {
              wordsToNumber.put(splitted[i], wordsToNumber.get(splitted[i]) + 1);
            } else {
              wordsToNumber.put(splitted[i], 1);
            }
          }

        }
        for (String word : wordsToNumber.keySet()) {
          //System.out.println(word + " " + wordsToNumber.get(word));
          if (wordsToNumber.get(word) == number) {
            selectedWords.add(word);
          }
        }

        return selectedWords;

      } catch (IOException e) {
        System.out.println("Unable to read file");
      }


    }
    return null;
  }



  public static void saveSelectedWords(String outputFile, List<String> selectedWords) {
    try {
      Path filePath = Paths.get(outputFile);
      Files.write(filePath, selectedWords);
    } catch (Exception e) {
      System.out.println("could not write the file!");
    }
  }



}





