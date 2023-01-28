package TCS;

import java.util.Scanner;

class Song{
    int songid;
    String title;
    String artist;
    double duration;
    Song(int songid,String title,String artist, double duration){
        this.songid=songid;
        this.title=title;
        this.artist=artist;
        this.duration=duration;
    }
}

class Solution4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Song s[]=new Song[4];

        for(int i=0;i<4;i++){
            int songid=sc.nextInt();
            sc.nextLine();
            String title=sc.nextLine();
            String artist=sc.nextLine();
            double duration=sc.nextDouble();
            sc.nextLine();
            s[i]=new Song(songid,title,artist,duration);
        }
        String title=sc.nextLine();
        String artist=sc.nextLine();

        double out1=findSongDuration(s,title);
        Song out2[]=songAscending(s,artist);
        System.out.println(out1);

    }

    //method 1
    public static double findSongDuration(Song s[],String title) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].title.equals(title)) {
                return s[i].duration;
            }

        }
        return 0;
    }
//method 2
    public static Song[] songAscending(Song s[],String artist){
            int n=0;
            for(int i=0;i<s.length;i++){
                if(s[i].artist.equals(artist)){
                    n++;
                }
            }
            Song out[]=new Song[n];
            n=0;
            for(int i=0;i<s.length;i++){
                if(s[i].artist.equals(artist)){
                    out[n++]=s[i];
                }
            }
            Song temp=null;
            for(int i=0;i<out.length;i++){
                for(int j=i+1;j<out.length;j++){
                    if(out[i].duration>out[j].duration){
                        temp=out[i];
                        out[i]=out[j];
                        out[j]=temp;
                    }
                }
            }
            return out;
        }
    }
