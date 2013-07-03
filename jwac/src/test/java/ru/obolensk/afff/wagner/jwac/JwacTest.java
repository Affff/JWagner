package ru.obolensk.afff.wagner.jwac;

import org.junit.Test;

public class JwacTest {

	@Test
	public void testSimpleCompile() {
		Jwac.main(new String[] {
				this.getClass().getResource("/test.wag").getFile(), "i" });

	}
}
