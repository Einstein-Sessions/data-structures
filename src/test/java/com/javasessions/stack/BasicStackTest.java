package com.javasessions.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BasicStackTest {

    private StackInterface<String> cardDeck;

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

    @Test
    public void should_return_new_card_added_to_card_deck() {
        cardDeck.push("Jack of Spades");
        assertEquals(8, cardDeck.size());
        assertTrue(cardDeck.contains("Jack of Spades"));
    }

    @Test
    public void should_return_card_in_the_deck() {
        String expected = "10 of Diamonds";
        String card = cardDeck.access("10 of Diamonds");
        assertEquals(expected, card);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_no_card_is_found(){
        String expected = "Ace of Diamonds";
        String card = cardDeck.access("Ace of Diamonds");
        assertEquals(expected, card);
    }



}
