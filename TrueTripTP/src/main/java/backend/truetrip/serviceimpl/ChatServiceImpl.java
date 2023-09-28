package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Chat;
import backend.truetrip.repositories.ChatRepository;
import backend.truetrip.services.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatRepository cR;


    @Override
    public void insert(Chat chat) {
        cR.save(chat);
    }

    @Override
    public List<Chat> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int chat_id) {
        cR.deleteById(chat_id);
    }

    @Override
    public Chat listId(int chat_id) {
        return cR.findById(chat_id).orElse(new Chat());
    }
}
