package next.dto;

public class Galaxy {
	public Galaxy(int gid, String name, int hp) {
		this.gid = gid;
		this.name = name;
		this.hp = hp;
	}

	public int getGid() {
		return gid;
	}
	
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	private int gid;
	private String name;
	private int hp;

}
