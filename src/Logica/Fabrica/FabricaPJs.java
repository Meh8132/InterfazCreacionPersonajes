package Logica.Fabrica;

import Logica.Fabrica.Personajes.*;

public class FabricaPJs {

    public static Personaje construir(int raza) {
        switch (raza) {
            case 0:
                return new Draenei();
            case 1:
                return new Elfo();
            case 2:
                return new Enano();
            case 3:
                return new Humano();
            case 4:
                return new Orco();
            case 5:
                return new Tauren();
            case 6:
                return new Troll();
            case 7:
                return new Undead();
        }
        return null;
    }
}
