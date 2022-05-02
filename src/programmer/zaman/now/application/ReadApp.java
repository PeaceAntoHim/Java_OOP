package programmer.zaman.now.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {

    public static void main(String[] args) {

        // Learn how to try with resource this made without fiture resource
            //
            //        try {
            //            reader = new BufferedReader(
            //                    new FileReader("README.md")
            //            );
        // This made with try with resource fiture
        try (BufferedReader reader =  new BufferedReader(new FileReader("README.md"))) {
            // Looping
            while (true) {
                String line = reader.readLine();
                if(line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable) {
            System.out.println("Error read file " + throwable.getMessage());
        }
    }
}


// This made code try whit resource with manually
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                    System.out.println("Success closed");
//                } catch (IOException exception) {
//                    System.out.println("Error close resource " + exception.getMessage());
//                }
//            }
//        }

