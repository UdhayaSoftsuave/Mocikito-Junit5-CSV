package com.example.logger;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NewTest {
	
	@Mock
	 Foo fooMock;

	@InjectMocks
	Bar underTest;

//	@Captor
//	private ArgumentCaptor<String> stringCaptor;

	@Test
	public void should_test_smth() {
	    underTest.doSmth();

//	    Mockito.verify(fooMock).bla(stringCaptor.capture());

	    
//	    Mockito.verify(fooMock).bla(is("val"));
	}
	

}
