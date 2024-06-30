package alien.learn.ademo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientinfoDto {

    private String id_number;
    private String name;
    private String email;

}
