/*
To write a Java program that shuffles a deck of cards, you can create a Deck class to represent the deck of cards and shuffle it using Collections.shuffle. Here’s a prompt to get you started:

Write a Java program that simulates a deck of playing cards and includes a method to shuffle the deck. The deck consists of 52 cards, each represented by a combination of a rank and a suit. The suits are Spades, Hearts, Diamonds, and Clubs, and the ranks are Ace, 2 through 10, Jack, Queen, and King.

Define the Card class: This class should have two fields:

String suit for the card’s suit (e.g., "Hearts").
String rank for the card’s rank (e.g., "Ace" or "2").
Implement the toString method to print each card as a combination of rank and suit.
Define the Deck class:

Initialize an ArrayList of Card objects to represent the deck.
Add all 52 combinations of rank and suit to the deck during initialization.
Include a shuffle method in the Deck class to shuffle the cards randomly. Use Collections.shuffle to shuffle the deck.
Main Method: In the main method:

Instantiate the Deck class.
Shuffle the deck.
Print out the shuffled deck, displaying each card on a new line. */


import java.util.Scanner;
public class DeckOfCards {

	public static void main(String[] args) {

		int [] deck = new int[52];
		String [] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10" , "Jack", "Queen", "King"};
		
		// initialize the cards
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		// Shuffle the cards
		for(int i = 0; i<deck.length; i++) {			
			// random index generation
			int index = (int) (Math.random()* deck.length);
			int temp = index;
			index = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		// Display the 4 cards
		for (int i = 0; i<4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.printf("Enter a card %d: %s of %s\n", deck[i], rank, suit);
		}
		
	}
}
