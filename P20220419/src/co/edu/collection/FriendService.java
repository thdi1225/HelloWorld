package co.edu.collection;

import java.util.ArrayList;

public interface FriendService {
	int ADD = 1;
	int MOD = 2;
	int DEL = 3;
	int SEARCH = 4;
	int MEN = 5;
	int WOMEN = 6;
	
	public void addFriend(Friend friend);
	
	public void modFried(Friend friend);
	
	public void remFriend(String name);
	
	public Friend findFriend(String name);
	
	public ArrayList<Friend> findGender(Gender gender);
}
