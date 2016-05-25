package nubank;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import nubank.Bank;


public class BankTest {
	@Test
	public void GivenANameCreateABank() {
		//Given
		String name = "AName";
		
		//When
		Bank bank = new Bank(name);
		
		//Then
		assertEquals(bank.getName(),(name));
	}
	
//	@Test
//	public void ShouldReturnAllClients() {
//		//Given
//		Client client = new Client("client");
//	}
}
