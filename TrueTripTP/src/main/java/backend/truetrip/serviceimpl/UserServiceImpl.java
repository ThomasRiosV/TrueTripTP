package backend.truetrip.serviceimpl;

import backend.truetrip.entities.Users;
import backend.truetrip.repositories.UserRepository;
import backend.truetrip.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository uR;


    @Override
    public Users save(Users user) {
        return uR.save(user);
    }

    @Override
    public List<Users> listAll() {
        return uR.findAll();
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Users findById(int id) {
        return uR.findById(id).orElse(new Users());
    }
}
