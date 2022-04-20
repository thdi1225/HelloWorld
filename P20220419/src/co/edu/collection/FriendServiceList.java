package co.edu.collection;

import java.util.ArrayList;

public class FriendServiceList implements FriendService{
	
	ArrayList<Friend> friends = new ArrayList<Friend>();
	
	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
	}

	
	
	@Override
	public void modFried(Friend friend) {
//		for(int i = 0; i < friends.size(); i++) {
//			if(friends.get(i).getName().equals(friend.getName())) {
//				friends.set(i, friend);
//			}
//		}
		for(int i = 0; i < friends.size(); i++) {
			Friend newFriend = friends.get(i);
			if(newFriend.getName().equals(friend.getName())) {
				newFriend.setName(friend.getName());
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for(int i = 0; i < friends.size(); i++) {
//			Friend vo = (Friend)friends.get(i);
			if(friends.get(i).getName().equals(name)) {
				friends.remove(i);
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for(int i = 0; i < friends.size(); i++) {
//			Friend vo = (Friend)friends.get(i);
			if(friends.get(i).getName().equals(name)) {
				return (Friend) friends.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> newList = new ArrayList<Friend>();
		for(int i = 0; i < friends.size(); i++) {
//			Friend vo = (Friend)friends.get(i);
			if(friends.get(i).getGender( ) == gender) {
				newList.add(friends.get(i));
			}
		}
		return newList;
	}

}
