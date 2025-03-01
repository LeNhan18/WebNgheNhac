package Nhac.WebNgheNhac.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/album")
public class AlbumController {

    @GetMapping("/search")
    public ResponseEntity<?> searchAlbum(@RequestParam String query ){
        return ResponseEntity.ok("Albums retrieved successfully");

    }
    @GetMapping("artist/{ArtistId}")
    public ResponseEntity<?> getArtist(@PathVariable Long ArtistId){
        return ResponseEntity.ok("Artist retrieved successfully");

    }
    @PostMapping()
    public ResponseEntity<?> CreateAlbum(@RequestBody String get){
        return ResponseEntity.ok("Album created successfully");
    }

}
