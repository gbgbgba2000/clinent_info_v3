package alien.learn.ademo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alien.learn.ademo.entity.Clientinfo;
import alien.learn.ademo.service.ClientinfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/clientInfos")
@Tag(name = "clientInfos", description = "AllclientInfos")

public class ClientinfoController {

  @Autowired
  private ClientinfoService service;

  @PostMapping
  @Operation(summary = "AddClientInfos", description = "新增人員")
  public Clientinfo addClientInfo(@RequestBody Clientinfo clientInfo) {
    return service.saveClientInfo(clientInfo);
  }

  @Operation(summary = "GetClientInfos", description = "所有人員")
  @GetMapping
  public List<Clientinfo> getAllClientInfos() {
    return service.getAllClientInfos();
  }
  /*@RequestMapping(value="/getAllClientInfos", method=RequestMethod.GET)
  public List<Clientinfo> getAllClientInfos() {
    return service.getAllClientInfos();
  }*/
  
  @Operation(summary = "Get ClientInfos by id number", description = "透過員工編號查詢")
  @GetMapping("/{id}")
  public ResponseEntity<?> getClientInfoById(@PathVariable Integer id) {
    Optional<Clientinfo> clientInfo = service.getClientInfoById(id);
    if (!clientInfo.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No data found");
    }
    return ResponseEntity.ok(clientInfo.get());
  }

  @Operation(summary = "Get ClientInfos by name", description = "透過姓名查詢")
  @GetMapping("/byName/{name}")
  public ResponseEntity<?> getClientInfoByName(@PathVariable String name) {
    Optional<Clientinfo> clientInfo = service.getClientInfoByName(name);
    if (!clientInfo.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No data found");
    }
    return ResponseEntity.ok(clientInfo.get());
  }
 
  @Operation(summary = "Get ClientInfos by id number", description = "透過身分證查詢")
  @GetMapping("/byIdNumber/{idNumber}")
  public ResponseEntity<?> getClientInfoByIdNumber(@PathVariable String idNumber) {
    Optional<Clientinfo> clientInfo = service.getClientinfoByIdNumber(idNumber);
    if (!clientInfo.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No data found");
    }
    return ResponseEntity.ok(clientInfo.get());
  }
  
  @Operation(summary = "UpdateClientInfos", description = "更新人員資料")
  @PutMapping
  public Clientinfo updateClientInfo(@RequestBody Clientinfo clientInfo) {
    return service.updateClientInfo(clientInfo);
  }

  @Operation(summary = "DeleteClientInfos", description = "刪除人員")
  @DeleteMapping("/{id}")
  public void deleteClientInfo(@PathVariable Integer id) {
    service.deleteClientInfo(id);
  }
  
  
}
