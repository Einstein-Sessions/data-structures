package com.javasessions.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BasicStackTest {

    private BasicStack<String> cardDeck;

    @Before
    public void init() {
        cardDeck = new BasicStack<String>();
        cardDeck.push("Ace");
        cardDeck.push("King of Hearts");
        cardDeck.push("Queen of Spades");
        cardDeck.push("Jack of Diamonds");
        cardDeck.push("9 of Clubs");
        cardDeck.push("10 of Diamonds");
        cardDeck.push("3 of Spades");
    }

    @Test
    public void should_return_seven_cards_in_deck() {
        assertEquals(7, cardDeck.size());
    }

    @Test
    public void should_return_six_cards_in_deck() {
        cardDeck.pop();
        assertEquals(6, cardDeck.size());
    }



}
