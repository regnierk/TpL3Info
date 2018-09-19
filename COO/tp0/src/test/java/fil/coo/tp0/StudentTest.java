package fil.coo.tp0;
import fil.coo.tp0.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class StudentTest {
	
	private static final String NAME= "Zoro";
	private static final String NUM = "01";

	Student s;
	
	@Before
	public void init() {
		s = new Student(NAME,NUM);
	}
	
	@Test
	/** 
	 * Test de la méthode getName()
	 */
	public void testGetName() {
		assertEquals(s.getName(),NAME);
	}
	
	@Test
	/** 
	 * Test de la méthode getNum()
	 */
	public void testGetNum() {
		assertEquals(s.getNumEtu(),NUM);
	}
	
	@Test
	/**
	 *  Test de la méthode setName()
	 */
	public void testSetName() {
		s.setName("Luffy");
		assertEquals(s.getName(),"Luffy");
	}
	
	@Test
	/**
	 *  Test de la méthode setNum()
	 */
	public void testSetNum() {
		s.setNumEtu("001");
		assertEquals(s.getNumEtu(),"001");
	}
	
	@Test
	/**
	 *  Test de la méthode equals() rédéfinie
	 */
	public void testEquals() {
		Student stu = new Student(NAME,NUM);
		assertTrue(s.equals(stu));
	}

}
