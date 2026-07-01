public class Team{
  public String name;
  public Player [] players = new Player [11];
  public int count;
  
  public Team(String s){
    name = s;
  }
  public Team(){
  }
  
  public void updateName(String s){
    name = s;
  }
  public void addPlayer(Player p){
    players[count] = p;
    count++;
  }
  public void printDetail(){
    System.out.println("Team: " + name);
    System.out.println("List of players: ");
    for(int i = 0;i <count; i++){
      System.out.println("Name: " + players[i].name);
      System.out.println("Age: " + players[i].age + ", " + "Total Matches: "+ players[i].matches);
    }
  }
}
    
  
  