package backend.truetrip.services;


import backend.truetrip.entities.Friend;

import java.util.List;

public interface FriendService {
    public void insert(Friend friend);
    public List<Friend> list();
    public void delete(int friend_id);
    public Friend listId(int friend_id);
}
