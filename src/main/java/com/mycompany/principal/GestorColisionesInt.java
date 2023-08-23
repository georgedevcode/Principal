package com.mycompany.principal;

import Entidad.Personaje;

public interface GestorColisionesInt {

    public boolean checkCollisionWithCharacter(Personaje character);

    public boolean checkCollisionWithObstacle(Obstaculo obstacle);

    public void handleCollisionWithObstacle(Obstaculo obstacle);

    public void handleCollisionWithCharacter(Personaje character);

}
