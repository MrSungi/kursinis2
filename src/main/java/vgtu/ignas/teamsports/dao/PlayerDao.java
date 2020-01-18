package vgtu.ignas.teamsports.dao;

import vgtu.ignas.teamsports.model.Player;

import java.util.List;

public interface PlayerDao {

    Player save(Player player);
    void update(Player player);
    void delete(Integer id);
    Player get(Integer id);
    List<Player> getAll();

}
