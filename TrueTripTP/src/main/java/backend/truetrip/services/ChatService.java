package backend.truetrip.services;

import backend.truetrip.entities.Chat;

import java.util.List;

public interface ChatService {
    public void insert(Chat chat);
    public List<Chat> list();
    public void delete(int chat_id);
    public Chat listId(int chat_id);
}
