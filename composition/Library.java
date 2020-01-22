import java.util.List;

// Libary class contains  
// list of books. 
class Library  
{ 
  
    // reference to refer to list of books. 
    private final List<Book> books; 
      
    Library (List<Book> books) 
    { 
        this.books = books;  
    } 
      
    public List<Book> getTotalBooksInLibrary(){ 
          
       return books;   
    } 
      
} 