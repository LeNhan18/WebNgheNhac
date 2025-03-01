package Nhac.WebNgheNhac.Respository;

import Nhac.WebNgheNhac.Entity.Playlist;
import Nhac.WebNgheNhac.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaylistRespository extends JpaRepository<Playlist, Integer> {
    List<Playlist> findByUser(User user);
    List<Playlist> findByUserAndIsPublicTrue(User user);
    List<Playlist> findByIsPublicTrue();
    List<Playlist> findByNameContainingIgnoreCaseAndPublicTrue(String name);

}
