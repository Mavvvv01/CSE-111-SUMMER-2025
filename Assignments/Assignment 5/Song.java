public class Song{
  public String name;
  public String artist;
  public int length;
  public Song next;
  
  public Song(String n, String a, int l){
    name = n;
    artist = a;
    length = l;
  }
  public void songInfo(){
    System.out.println("Title: " + this.name + ", " + "Artist: " + this.artist);
    System.out.println("Length: " + this.length + " minutes");
  }
}