public class Main {
    public static void main(String[] args) {
        Computer musicPlayer = new Computer();

        runMusic(musicPlayer);
        runVideo(musicPlayer);
    }

    public static void runVideo(VideoPlayer video) {
        video.playVideo();
    }

    public static void runMusic(MusicPlayer music) {
        music.playMusic();
    }


}
