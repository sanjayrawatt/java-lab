class Video {
    public void playMusic() {
        System.out.println("Playing music...");
    }
    public String giveMoney(int cost)
    {
        if(cost > 6) return "ok";
        return "not okay";
    }
}

public class demo2 {
    public static void main(String a[]) {
        Video obj = new Video();
        obj.playMusic();
        String str = obj.giveMoney(10);
        System.out.println(str);
    }
}
