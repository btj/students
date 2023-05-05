package students_oop;

/**
 * Each instance of this class represents a student in a team collaboration graph.
 * 
 * @invar The bidirectional association is consistent.
 *     | getTeammate() == null || getTeammate().getTeammate() == this
 */
public class Student {
	
	/**
	 * @invar The bidirectional association is consistent.
	 *      | teammate == null || teammate.teammate == this 
	 * 
	 * @peerObject
	 */
	private Student teammate;
	
	/**
	 * @peerObject
	 */
	public Student getTeammate() { return teammate; }
	
	/**
	 * @post | getTeammate() == null
	 */
	public Student() {}

	/**
	 * @pre | other != null
	 * @pre | getTeammate() == null
	 * @pre | other.getTeammate() == null
	 * @mutates | this, other
	 * @post | getTeammate() == other
	 * @post | other.getTeammate() == this
	 */
	public void startCollaboratingWith(Student other) {
		teammate = other;
		other.teammate = this;
	}
	
	/**
	 * @pre | getTeammate() != null
	 * @mutates | this
	 * @post | getTeammate() == null
	 * @post | old(getTeammate()).getTeammate() == null
	 */
	public void stopCollaborating() {
		teammate.teammate = null;
		teammate = null;
	}
	
}
