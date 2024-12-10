import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void Constructor() {
		
		Triangle tri = new Triangle();

		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());

	}

	@Test
	void equalConstructor() {
		
		Triangle tri = new Triangle(10);

		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());

	}

	@Test
	void multiConstructor() {

		Triangle tri = new Triangle(10, 10, 10);

		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());

		tri = new Triangle(10, 20, 30);

		assertFalse(tri.isEquilateral());
		assertTrue(tri.isScalene());
		assertFalse(tri.isIsosceles());

		tri = new Triangle(10, 10, 30);

		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());

	}
	
	@Test
	void testIsosceles() {
		
		Triangle tri = new Triangle(10, 10, 20);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
		
		tri = new Triangle(10, 20, 20);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
		
		tri = new Triangle(20, 10, 20);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
	}
	
	@Test
	void testScalene() {
		
		Triangle tri = new Triangle(10, 20, 30);
		
		assertFalse(tri.isEquilateral());
		assertTrue(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
		tri = new Triangle(30, 20, 10);
		
		assertFalse(tri.isEquilateral());
		assertTrue(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
		tri = new Triangle(30, 10, 20);
		
		assertFalse(tri.isEquilateral());
		assertTrue(tri.isScalene());
		assertFalse(tri.isIsosceles());
	}
	
	@Test
	void testSetAllSides() {
		
		Triangle tri = new Triangle();
		
		tri.setSides(10, 20, 30);
				
		assertFalse(tri.isEquilateral());
		assertTrue(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
		tri.setSides(10, 10, 10);
		
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
		tri.setSides(20, 20, 30);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
		
		tri.setSides(20, -20, 30);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
		
		tri.setSides(20, 20, -30);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
	}
	
	@Test
	void testSetTwoSides() {
		
		Triangle tri = new Triangle();
		
		tri.setSides(20, 30);
				
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
		
		tri.setSides(90, 1);
		
		assertFalse(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertTrue(tri.isIsosceles());
		
		tri.setSides(10, 10);
		
		assertFalse(tri.isEquilateral());	// FAILS: showing comment on code is wrong!
		assertFalse(tri.isScalene());	
		assertTrue(tri.isIsosceles());		// FAILS: showing comment on code is wrong!
	}
	
	@Test
	void testSetOneSide() {
		
		Triangle tri = new Triangle();
		
		tri.setSides(10);
				
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
		tri.setSides(-10);
		
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
	}
	
	@Test
	void testcopy() {
		
		Triangle tri = new Triangle();
		
		Triangle tri2 = tri.copy();
		
		tri2.setSides(10, 20, 30);
		
		assertTrue(tri.isEquilateral());
		assertFalse(tri.isScalene());
		assertFalse(tri.isIsosceles());
		
		assertFalse(tri2.isEquilateral());
		assertTrue(tri2.isScalene());
		assertFalse(tri2.isIsosceles());
		
	}

}
