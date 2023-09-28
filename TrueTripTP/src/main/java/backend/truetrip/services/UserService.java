package backend.truetrip.services;

import backend.truetrip.entities.Users;

import java.util.List;

public interface UserService {
    public Users save(Users user);
    public List<Users> listAll();
    public void delete(int id);
    public Users findById(int id);
}
