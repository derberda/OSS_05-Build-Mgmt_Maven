package de.hfu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QueueTest {
	@Test
	public void test() {
		Queue q = new Queue(2);
		q.enqueue(5);
		assertTrue(5 == q.dequeue());
		
}
}
