package Nhac.WebNgheNhac.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/album")
public class AlbumController {

    @GetMapping("/search")
    public ResponseEntity<?> searchAlbum(@RequestParam String query ){

    }
    @GetMapping("artist/{ArtistId}")
    public ResponseEntity<?> getArtist(@PathVariable Long ArtistId){

    }
    @PostMapping()
    public ResponseEntity<?> CreateAlbum(@RequestBody String get)

}
