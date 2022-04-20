package co.edu.collection;

public class FriendServiceArray implements FriendService{

	Friend[] friends = new Friend[10];
	
	@Override
	public void addFriend(Friend friend) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	@Override
	public void modFried(Friend friend) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(friend.getName())) {
				friends[i] = friend;
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i].getName().equals(name)) {
				friends[i] = null;
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for(int i = 0; i < friends.length; i++) {
			if(friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

}
