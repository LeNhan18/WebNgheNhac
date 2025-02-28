package Nhac.WebNgheNhac.DTOS;

import java.time.LocalDateTime;

public class PlaylistSongDTO {
    private Long playlistId;
    private Long songId;
    private Integer position;
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
