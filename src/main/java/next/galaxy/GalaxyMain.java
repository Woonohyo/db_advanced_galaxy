package next.galaxy;

import next.database.AttackGalaxy;
import next.database.CreateUser;

public class GalaxyMain {

	public void startGalaxy() {
		CreateUser createUserTread = new CreateUser();
		createUserTread.run();
	}
	
	public void attackGalaxy() {
		AttackGalaxy attackGalaxyThread = new AttackGalaxy();
		attackGalaxyThread.run();
	}
}
