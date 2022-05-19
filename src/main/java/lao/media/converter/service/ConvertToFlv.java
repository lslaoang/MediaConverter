package lao.media.converter.service;

import org.springframework.stereotype.Service;
import ws.schild.jave.encode.AudioAttributes;

@Service
public class ConvertToFlv {

    public void fromMp4(String filename){
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libmp3lame");
        audio.setBitRate(128000);
        audio.setChannels(2);
        audio.setSamplingRate(44100);
    }

}
