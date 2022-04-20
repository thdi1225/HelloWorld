package co.edu.collection;

public interface FriendService {
	public void addFriend(Friend friend);
	
	public void modFried(Friend friend);
	
	public void remFriend(String name);
	
	public Friend findFriend(String name);
}
