package vgtu.ignas.teamsports.service;

import vgtu.ignas.teamsports.model.Location;

import java.util.List;

public interface LocationService {
    public Location getLocation(Integer id);
    public List<Location> getAllLocation();
    public void deleteLocation(Integer id);
    public void updateLocation(Location location);
    public Location saveLocation(Location location);
}
