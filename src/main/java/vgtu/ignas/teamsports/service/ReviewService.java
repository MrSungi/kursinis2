package vgtu.ignas.teamsports.service;

import vgtu.ignas.teamsports.model.Review;

import java.util.List;

public interface ReviewService {

    void create(Review review);
    void update(Review review);
    void delete(int id);
    Review getById(int id);
    List<Review> getAll();

}
