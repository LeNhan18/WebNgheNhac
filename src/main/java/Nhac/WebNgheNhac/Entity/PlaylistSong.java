package Nhac.WebNgheNhac.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "playlist_song")
public class PlaylistSong {
    @Id
    @Column(name = "playlist_id")
    private Long playlistId;

    @Id
    @Column(name = "song_id")
    private Long songId;

    @Column(name = "position")
    private Integer position;

    @Column(name = "added_at")
    private LocalDateTime addedAt;

    public Long getPlaylistId() {
        return this.playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }

    public Long getSongId() {
        return this.songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public LocalDateTime getAddedAt() {
        return this.addedAt;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }
}
