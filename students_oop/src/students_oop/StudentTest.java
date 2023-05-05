package students_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student alice = new Student();
		assertNull(alice.getTeammate());
		
		Student bob = new Student();
		alice.startCollaboratingWith(bob);
		assertSame(bob, alice.getTeammate());
		assertSame(alice, bob.getTeammate());
		
		bob.stopCollaborating();
		assertNull(bob.getTeammate());
		assertNull(alice.getTeammate());
	}

}
