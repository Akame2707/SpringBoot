package inercia.rpg97;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//Foi importado o controler da nossa classe
public class Controler {
    @GetMapping("/inicio")
    public String inicio(){
        return "guri tu ta no inicio";
    }
    @GetMapping("/listar/algo")
    public String listarAlgo(){
        return "guri tu listo algo ai";
    }
}
