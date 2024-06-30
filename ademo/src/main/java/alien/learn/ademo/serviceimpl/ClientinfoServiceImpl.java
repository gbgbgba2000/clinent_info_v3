
package alien.learn.ademo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alien.learn.ademo.entity.Clientinfo;
import alien.learn.ademo.repository.ClientinfoRepository;
import alien.learn.ademo.service.ClientinfoService;



@Service
public class ClientinfoServiceImpl implements ClientinfoService {

    @Autowired
    private ClientinfoRepository repository;

  
    @Override
    public Clientinfo saveClientInfo(Clientinfo clientInfo) {
        return repository.save(clientInfo);
    }

    @Override
    public List<Clientinfo> getAllClientInfos() {
        return repository.findAll();
    }


    @Override
    public Optional<Clientinfo> getClientInfoById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Clientinfo> getClientInfoByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Optional<Clientinfo> getClientinfoByIdNumber(String idNumber) {
        return repository.findByIdNumber(idNumber);
    }


    @Override
    public Clientinfo updateClientInfo(Clientinfo clientInfo) {
        return repository.save(clientInfo);
    }

    @Override
    public void deleteClientInfo(Integer id) {
        repository.deleteById(id);
    }
}
