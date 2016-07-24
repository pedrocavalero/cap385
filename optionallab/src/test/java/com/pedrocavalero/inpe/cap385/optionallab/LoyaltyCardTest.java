package com.pedrocavalero.inpe.cap385.optionallab;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoyaltyCardTest {

	@Test
	public void orElse_whenNamePresent_ThenName(){
	    Optional<String> petName = Optional.of("Bobby");
	    assertEquals("Bobby", petName.orElse(""));
	}
	@Test
	public void orElse_whenNameNotPresent_ThenEmptyString(){
	    Optional<String> petName = Optional.empty();
	    assertEquals("", petName.orElse(""));
	}
	
	@Test
	public void isPresentGet_whenNamePresent_ThenName(){
	    Optional<String> petNameOptional = Optional.of("Bobby");
	    String petName = "";
	    if(petNameOptional.isPresent()){
	        petName = petNameOptional.get();
	    } 
	    assertEquals("Bobby", petName);
	}
	
	@Test
	public void isPresentGet_whenNameNotPresent_ThenEmptyString(){
	    Optional<String> petNameOptional = Optional.empty();
	    String petName = "";
	    if(petNameOptional.isPresent()){
	        petName = petNameOptional.get();
	    } 
	    assertEquals("", petName);
	}
	
	@Test
	public void ifPresent_whenCardPresent_thenPointsAdded(){
	    LoyaltyCard mockedCard = mock(LoyaltyCard.class);
	    Optional<LoyaltyCard> loyaltyCard = Optional.of(mockedCard);
	    loyaltyCard.ifPresent(c -> c.addPoints(3));
	    //Verify addPoints method has been called 1 time and with input=3
	    verify(mockedCard, times(1)).addPoints(3);
	}
	
	@Test
	public void map_whenCardPresent_thenNumber(){
	    LoyaltyCard mockedCard = mock(LoyaltyCard.class);
	    when(mockedCard.getPoints()).thenReturn(3);
	    Optional<LoyaltyCard> card = Optional.of(mockedCard);
	    int point = card.map(LoyaltyCard::getPoints)
	       .orElse(0);
	    assertEquals(3, point);
	}
	@Test
	public void map_whenCardNotPresent_thenZero(){
	    Optional<LoyaltyCard> card = Optional.empty();
	    int point = card.map(LoyaltyCard::getPoints)
	       .orElse(0);
	    assertEquals(0, point);
	}

	@Test
	public void flatMap_whenCardAndLastGiftPresent_thenName(){
	    Gift mockedGift = mock(Gift.class);
	    when(mockedGift.getName()).thenReturn("Biography of Guybrush Threepwood");
	    LoyaltyCard mockedCard = mock(LoyaltyCard.class);
	    when(mockedCard.getLastGift()).thenReturn(Optional.of(mockedGift));
	    Optional<LoyaltyCard> card = Optional.of(mockedCard);
	    String giftName = card.flatMap(LoyaltyCard::getLastGift)
	        .map(Gift::getName)
	        .orElse("");
	    assertEquals("Biography of Guybrush Threepwood", giftName);
	}
}
