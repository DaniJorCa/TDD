import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class TestCoche_Daniel_Jordan {
    @Test
    public void test_al_crear_coche_su_velocidad_es_cero_Daniel_Jordan() {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_coche_su_velocidad_aumenta_Daniel_Jordan(){
         Coche nuevoCoche = new Coche();
         nuevoCoche.acelerar(30);
         Assertions.assertEquals(30,nuevoCoche.velocidad);
    }
}
