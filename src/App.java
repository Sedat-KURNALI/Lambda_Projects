interface IToplama {
    void topla(int s1, int s2);
}

public class App {

    public static void main(String[] args) {
        IToplama toplama = (int s1, int s2) -> {
            System.out.println(s1 + s2);
        };
        //IToplama toplama = (int s1, int s2) -> System.out.println(s1 + s2);
        //IToplama toplama = (s1, s2) -> System.out.println(s1 + s2);
        toplama.topla(10, 20);
    }
}

