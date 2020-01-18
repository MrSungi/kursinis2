package vgtu.ignas.teamsports.service;
import vgtu.ignas.teamsports.model.PlayEvent;

import java.util.List;

public interface PlayEventService {
    public PlayEvent getPlayEvent(Integer id);
    public List<PlayEvent> getAllPlayEvent();
    public void deletePlayEvent(Integer id);
    public void updatePlayEvent(PlayEvent playEvent);
    public PlayEvent savePlayEvent(PlayEvent playEvent);
}
