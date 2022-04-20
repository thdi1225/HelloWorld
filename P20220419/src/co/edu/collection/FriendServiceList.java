package co.edu.collection;

import java.util.ArrayList;

public class FriendServiceList implements FriendService{

	ArrayList friends = new ArrayList();
	
	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
	}

	@Override
	public void modFried(Friend friend) {
		for(int i = 0; i < friends.size(); i++) {
			Friend vo = (Friend)friends.get(i);
			if(vo.getName().equals(friend.getName())) {
				friends.set(i, friend);
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for(int i = 0; i < friends.size(); i++) {
			Friend vo = (Friend)friends.get(i);
			if(vo.getName().equals(name)) {
				friends.remove(i);
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for(int i = 0; i < friends.size(); i++) {
			Friend vo = (Friend)friends.get(i);
			if(vo.getName().equals(name)) {
				return (Friend) friends.get(i);
			}
		}
		return null;
	}

}
