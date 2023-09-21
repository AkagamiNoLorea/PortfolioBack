package portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import portfolio.domain.models.Portfolio;

import java.util.List;

@SpringBootTest (webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestDeAceptacion {

    @Test
    public void devuelveLosItems(){
        List<Portfolio> porfolios = List.of(
                new Portfolio(id: 1, nombre: "Antonio", descripcion: "Madrid", img: "25/08", lenguaje: "09:30", enlace: "25/08", despliegue: "09:30")
        )
    }
}
