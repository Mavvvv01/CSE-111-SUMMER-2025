public class Shelf{
  public int capacity;
  public int books;
  
  public void showDetails(){
    System.out.println("Shelf Capacity: " + capacity);
    System.out.println("Number of books: " + books);
  }
  public void addBooks(int n){
    if(capacity==0){
      System.out.println("Zero capacity. Cannot add books");
    }else if(capacity<n+books){
      System.out.println("Exceeds capacity");
    }else{
      System.out.println(n+ " books added to shelf");
      books+=n;

    }
  }
}