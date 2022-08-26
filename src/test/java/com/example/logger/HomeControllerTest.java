package com.example.logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.StringUtils;

//@DisplayName("Home Controller")
@RunWith(MockitoJUnitRunner.class)
//@TestClassOrder(ClassOrderer.OrderAnnotation.class)
class HomeControllerTest {
	
//	@Mock
//	public HomeController controllerTest;
//	
//	@Test
//	public void test() throws Exception {
////		controllerTest= mock(HomeController.class);
////		System.out.println(controllerTest.hello());
//		MockitoAnnotations.openMocks(this);
//		when(controllerTest.hello()).thenReturn("Tested successfully");
//		String hello = controllerTest.hello();
//		assertEquals("Tested successfully", hello);
//		
//	}
//	
//	@ParameterizedTest
//	@NullAndEmptySource
////	@ValueSource(strings = { " ", "radar", "able was I ere I saw elba" })
//	void palindromes(String candidate) {
//		System.out.println(candidate);
//	  assertTrue(true);
//	}
	
//	@ParameterizedTest
//	@EnumSource(names = { "DAYS", "HOURS" })
//	void testWithEnumSource(ChronoUnit unit) {
//	  assertNotNull(unit);
//	}
//	@ParameterizedTest
////	@NullAndEmptySource
//	@CsvSource({
//		  "apple, 5 ,7",
//		  "banana, 6 ,7",
//		  "lemon, 5,7",
//		  "strawberry, 10,7"
//		})
//		void testWithCsvSource(String fruit, int rank , int value) {
////		System.out.println(fruit + "   "  + rank);
//		  assertNotNull(fruit);
//		  assertEquals(7, value);
//		  assertEquals(fruit.length(), rank);
//		}
//	
//	@Test
//	@ExtendWith(HomeController)
//	void getProductList(@WebServerUrl String serverUrl) {
//	  WebClient webClient = new WebClient();
//	  // Use WebClient to connect to web server using serverUrl and verify response
//	  assertEquals(200, webClient.get(serverUrl + "/products").getResponseStatus());
//	}
	@Mock
	private Foo fooMock;

	@InjectMocks
	private Bar underTest;

	@Captor
	private ArgumentCaptor<String> stringCaptor;

	@Test
	public void should_test_smth() {
	    underTest.doSmth();

	    Mockito.verify(fooMock).bla(stringCaptor.capture());

	    
	    Mockito.verify(fooMock).bla(any());
	}
	
	public class Bar {

	    private final Foo foo;

	    public Bar(final Foo foo) {
	        this.foo = foo;
	    }

	    public void doSmth() {
	        foo.bla("val");
	    }
	}
	
	class Foo {

		public String value;

	    public void bla(String s) {
	        this.value = s;
	    }
	}
	
	
	
	 

}
