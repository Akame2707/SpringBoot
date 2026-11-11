package inercia.rpg97;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//Foi importado o controler da nossa classe
public class Controler {
    @GetMapping("/player")
    public Player mostrarPlayer(){
        Player jogador1 = new Player("Matheus", 12,"Mago");
        Player jogador2 = new Player("Akame", 1243,"Ladino");

        return jogador1;
    }
}
