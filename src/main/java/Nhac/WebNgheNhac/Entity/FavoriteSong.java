package Nhac.WebNgheNhac.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "favorite_song")
public class FavoriteSong {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "song_id")
    private Long songId;

    @Column(name = "added_at")
    private LocalDateTime addedAt;

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSongId() {
        return this.songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public LocalDateTime getAddedAt() {
        return this.addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }
}
