package interfaces;

import entities.Music;

public interface MusicPlayer {

    String playMusic (Music music);

    String pauseMusic (Music music);

    String selectMusic (Music music);

    String advanceMusic ();

}
