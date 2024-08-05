package com.project;

public class CommandLineInput {

	public static void main(String[] args) {
        // Check if any command line arguments are provided
        if (args.length == 1) {
            System.out.println("Command line arguments:");

            // Loop through and print each argument
//            for (int i = 0; i < args.length; i++) {
//                System.out.println("Argument " + (i + 1) + ": " + args[i]);
//            }
          String s = args[0];
          System.out.println("Argument " + (1) + ": " + s);
            
            
        } else {
            System.out.println("No command line arguments provided.");
        }
    }

}
