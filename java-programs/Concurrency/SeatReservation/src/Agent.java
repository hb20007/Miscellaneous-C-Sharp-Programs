/*
 * Class representing an Agent in the simulation
 * @author hzsab
 */
public class Agent {
	private String name;
	
	public Agent(String agentName) {
		name = agentName;
	}
	
	/*
	 * Getter method for <code>name</code>
	 */
	public String queryAgentName() {
		return name;
	}
}