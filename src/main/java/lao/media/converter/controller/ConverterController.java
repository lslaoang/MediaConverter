package lao.media.converter.controller;

import lao.media.converter.model.Mp4Media;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @GetMapping("/mp4-to-flv")
    public void convertMp4ToFlv(@RequestBody Mp4Media mp4Media) {
        System.out.println(mp4Media.getFilename());

    }
}
