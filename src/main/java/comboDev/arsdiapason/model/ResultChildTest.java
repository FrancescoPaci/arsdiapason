package comboDev.arsdiapason.model;

import comboDev.arsdiapason.mybatis.model.Bambino;
import comboDev.arsdiapason.mybatis.model.ProvaScheda;
import lombok.Data;

import java.util.List;

@Data
public class ResultChildTest {
    Bambino bambino;
    List<ProvaScheda> proveSchede;
}
