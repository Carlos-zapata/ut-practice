package test;

import main.age;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

	public class Age_test extends age {

		Age_test  testCase;
		@Before
		public void SetUp() {
			testCase = new Age_test();
		}
		@Test
		public void ValidDate() {
			String valDate = Age_test.getAge(Validate("25/08/1996"));
			assertEquals(valDate, "19 años 12 meses y 3 días");
		}
		@Test
		public void DiffFormat() {
			String invalDate = Age_test.Validate("Hola Mundo");
			assertEquals(invalDate, "Formato inválido");
		}
		@Test
		public void InvalidDay() {
			String invalDay = Age_test.Validate("44/10/1991");
			assertEquals(invalDay, "Día inválido");
		}
		@Test
		public void InvalidMonth() {
			String invalMonth = Age_test.Validate("22/22/1999");
			assertEquals(invalMonth, "Mes inválido");
		}
		@Test
		public void InvalidYear() {
			String invalYear = Age_test.Validate("16/01/ABCD");
			assertEquals(invalYear, "Formato inválido");
		}
		@Test
		public void FutureDate() {
			String futDate = Age_test.Validate("01/01/2123");
			assertEquals(futDate, "Año inválido");
		}
	}
