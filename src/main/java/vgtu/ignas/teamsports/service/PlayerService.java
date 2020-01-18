package vgtu.ignas.teamsports.service;

import vgtu.ignas.teamsports.model.Player;

import java.util.List;

public interface PlayerService {

    Player create(Player player);
    void update(Player player);
    void delete(Integer id);
    Player get(Integer id);
    List<Player> getAll();

}
