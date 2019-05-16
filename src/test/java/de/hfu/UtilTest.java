package de.hfu;
import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {
	@Test
	public void istErstesHalbjahr(){
		assertTrue(Util.istErstesHalbjahr(5));
	}

}
