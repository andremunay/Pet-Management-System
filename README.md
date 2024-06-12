# Pet Management System

## Overview

The Pet Management System is a simple console-based application that allows users to manage pets. Users can add, remove, display, feed, put to sleep, and play with pets. The application uses Object-Oriented Programming (OOP) principles, including classes, inheritance, polymorphism, and encapsulation. It also includes file handling to save and load pet data and exception handling for robust error management.

## Features

- Add a new pet (Dog, Cat, Bird)
- Remove a pet by name
- Display all pets with their details
- Feed a pet
- Put a pet to sleep
- Play with a pet
- Save and load pet data to/from a file
- Robust exception handling

## Classes

- `Pet`: Base class representing a pet
- `Dog`, `Cat`, `Bird`: Subclasses representing specific types of pets
- `PetActions`: Interface for pet actions like playing and performing tricks
- `PetManager`: Class for managing a list of pets, including methods to add, remove, display, save, and load pets
- `App`: Main class for running the application

## How to Compile and Run

1. Compile all Java files:
   ```bash
   javac *.java
2. Run the application:
   java App

## Usage
   
1. Follow the prompts in the console to manage pets.
2. Choose options from the menu to add, remove, display, feed, put to sleep, and play with pets.
3. When you choose to save and exit, the pet data will be saved to `pets.dat` and loaded the next time you run the application.

## Example

1. Add a Pet
2. Remove a Pet
3. Display Pets
4. Feed a Pet
5. Put a Pet to Sleep
6. Play with a Pet
7. Save and Exit

Enter your choice: 1
Enter Pet Type (Dog/Cat/Bird): Dog
Enter Pet Name: Buddy
Enter Pet Age: 3
Enter Pet Color: Brown

## Notes

- Ensure you have write permissions in the directory where you run the application to allow saving the pet data file.
- Handle invalid inputs as prompted by the application to avoid errors.
