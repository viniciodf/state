package br.com.vinicio;

import br.com.vinicio.ui.Player;
import br.com.vinicio.ui.UI;

public class StateApp {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
