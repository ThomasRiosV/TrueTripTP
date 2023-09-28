package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Friend;
import backend.truetrip.repositories.FriendRepository;
import backend.truetrip.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    private FriendRepository fR;


    @Override
    public void insert(Friend friend) {
        fR.save(friend);
    }

    @Override
    public List<Friend> list() {
        return fR.findAll();
    }

    @Override
    public void delete(int friend_id) {
        fR.deleteById(friend_id);
    }

    @Override
    public Friend listId(int friend_id) {
        return fR.findById(friend_id).orElse(new Friend());
    }
}
