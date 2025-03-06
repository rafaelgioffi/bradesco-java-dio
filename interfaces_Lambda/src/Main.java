public class Main {
    public static void main(String[] args) {
        var music = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Tocando música...");
            }

            @Override
            public void pauseMusic() {

            }

            @Override
            public void stopMusic() {

            }
        };
        music.playMusic();
    }
}
