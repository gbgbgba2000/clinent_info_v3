package alien.learn.ademo.service;

import java.util.List;
import java.util.Optional;

import alien.learn.ademo.entity.Clientinfo;

public interface ClientinfoService {
    Clientinfo saveClientInfo(Clientinfo clientInfo);

    List<Clientinfo> getAllClientInfos();

    Optional<Clientinfo> getClientInfoById(Integer id);

    Optional<Clientinfo> getClientInfoByName(String name);

    Optional<Clientinfo> getClientinfoByIdNumber(String idNumber);

    Clientinfo updateClientInfo(Clientinfo clientInfo);


    void deleteClientInfo(Integer id);
}
