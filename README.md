# PokerHandsAssessment
Assessment exercise provided by Symbio.

## Prerequisite to run this program
1. Install openjdk version 17.0.2.
2. Verify the version installed with below command.
   > Command: ```java --version```

## Steps to compile and run this project from Command Prompt or Terminal
1. Download or clone this project to your local system directory.
2. Open terminal or command prompt.
3. Change directory to PokerHands/src directory.
   > Example command: ```cd /Users/<user_name>/Desktop/Solution/PokerHandsAssessment/Symbio_Assessment/PokerHands/src```
4. Compile the program using below command.
   > Command: ```javac PokerHands.java```
5. Execute the program using below command.
   > Command: ```java PokerHands```

## Input
1. The input data to run the program is taken from text file ```poker-hands.txt``` which is included inside the project ```src``` directory itself.
2. In case you wish to test the project for different input values, you can either modify the contents of this file or replace the file with another file.
   > Please remember that the input text file name should not be modified.  
   > The name of the input text file should always be ```poker-hands.txt``` for the program to work as expected.
3. Input format is as follows:  
   a. Each line read from the input file will be a set of 10 cards.  
   b. The first 5 cards in the line have been dealt to Player 1, the last 5 cards in the line belong to Player 2.  
   c. Each card is represented by 2 characters - the value and the suit.
      - Values will be: 2, 3, 4, 5, 6, 7, 8, 9, 10 (T), Jack (J), Queen (Q), King (K), Ace (A)
      - Suits will be: Diamonds (D), Hearts (H), Spades (S), Clubs (C)  
   
   d. Example input
      > ```AH 9S 4D TD 8S 4H JS 3C TC 8D```  
      > *Player 1 cards: AH 9S 4D TD 8S*  
      > *Player 2 cards: 4H JS 3C TC 8D*  

## Output
1. At the completion of the reading input from text file, the output will clearly state how many hands Player 1 won, and how many hands Player 2 won.
2. For example, the output for current test input text file is
   > ```Player1: 263```  
   > ```Player2: 237```

## Note
This program can be executed using any Java language supported IDE also.
