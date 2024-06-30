package alien.learn.ademo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "client_info")
public class Clientinfo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id; //
    
    @Column(name = "id_number")
    private String idNumber;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "EMAIL")
    private String email;

}
