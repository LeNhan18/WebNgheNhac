package Nhac.WebNgheNhac.DTOS;

import java.time.LocalDateTime;

public class FavoriteSongDTO {
    private Long userId;
    private Long songId;
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
