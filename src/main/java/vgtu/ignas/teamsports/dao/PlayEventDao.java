package vgtu.ignas.teamsports.dao;
import vgtu.ignas.teamsports.model.PlayEvent;

import java.util.List;

public interface PlayEventDao {

    public PlayEvent getPlayEvent(Integer id);
    public List<PlayEvent> getAllPlayEvent();
    public void deletePlayEvent(Integer id);
    public void updatePlayEvent(PlayEvent playEvent);
    public PlayEvent savePlayEvent(PlayEvent playEvent);
    // public void addPlayer(Player player);
}

