package com.example.logger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;


@RunWith(MockitoJUnitRunner.class)
@TestInstance(value = Lifecycle.PER_CLASS)
class CalculatorTest {
	
	
	@InjectMocks
	Calculator calculator = new Calculator();
	
	@InjectMocks
	Show show = new Show();
	
	@Mock
	private sampleMock sampleMock;
	
	@Spy
	StringValue stringValue;
	
	@Captor
	private ArgumentCaptor<Integer> stringCaptor;
	
	@BeforeAll
	public void add() {
		show = Mockito.spy(new Show());
		MockitoAnnotations.openMocks(this);
	}
	
	
	
	@Test
	void test() {
//		Mockito.when(show.addimpl(anyInt())).thenReturn(10);
//		Mockito.when(stringValue.get()).thenReturn("kumar");
		Mockito.when(sampleMock.getInteger()).thenReturn(200);
//		doReturn(6).when(show).addimpl(anyInt()); 
		
		
		calculator.add(5, 5);
		verify(show).addimpl(stringCaptor.capture());
		verify(show, Mockito.atLeast(1)).addimpl(anyInt());
//		assert(stringCaptor.getValue(), is(3));
		System.out.println("Captor " + stringCaptor.getAllValues());
	}

}
