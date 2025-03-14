public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("O computador está reproduzindo vídeo...");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando vídeo...");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está parando vídeo...");
    }

    @Override
    public void playMusic() {
        System.out.println("O computador está tocando música...");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando música...");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está parando música...");
    }
}
