package search;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author nilstes
 */
@RunWith(MockitoJUnitRunner.class)
public class SearchEngineTest {
	
	@Mock
	PageReader reader;
	
	@InjectMocks
	SearchEngine se = new SearchEngine();
	
	//Oppgave 1
	@Test
	public void test_search() {
		String[] ntnu = {"Studier", "Studentliv", "Forsking", "Om NTNU", "Kalender"};
		when(reader.readPage("www.ntnu.no")).thenReturn(ntnu);
		se.indexPage("www.ntnu.no");
		List<String> resntnu = new ArrayList<String>();
		resntnu.add("www.ntnu.no");
		assertEquals(resntnu, se.search("Studier"));
	}
	
	//Oppgave 2
	@Test
	public void test_order_url() {
		String[] url1 = {"test", "test", "test"}, url2 = {"test", "test"}, url3 = {"test"};
		when(reader.readPage("test1")).thenReturn(url1);
		when(reader.readPage("test2")).thenReturn(url2);
		when(reader.readPage("test3")).thenReturn(url3);
		
		se.indexPage("test1");
		se.indexPage("test2");
		se.indexPage("test3");
		
		List<String> expected = new ArrayList<String>();
		expected.add("test1");
		expected.add("test2");
		expected.add("test3");
		assertArrayEquals(expected.toArray(), se.search("test").toArray());
	}
	
	//Oppgave 3
	@Test
	public void test_empty_search() {
		String[] url1 = {"test", "test2"};
		when(reader.readPage("test1")).thenReturn(url1);
		se.indexPage("test1");
		List<String> expected = new ArrayList<String>();
		assertEquals(expected, se.search("exception"));
	}
	
}
