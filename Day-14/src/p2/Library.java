package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Library {
	private List<Book> bookList=new ArrayList<>();
	
	void addBook(Book book) {
		bookList.add(bObj);
	}
	
	boolean isEmpty() {
		return this.bookList.isEmpty();
	}
	
	List<Book> viewAllBooks(){
		return bookList;
	}
	
	List<Book> viewBooksByAuthor(String author ){
		List<Book> auth=new ArrayList<>();
		Iterator<Book> itr=bookList.iterator();
		while(itr.hasNext()) {
			Book b=(Book)itr.next();
			if(b.getAuthor().equalsIgnoreCase(author)) {
				auth.add(b);
			}
		}
		return auth; 
	}
	
	int countNoOfBook(String bookName) {
		Iterator<Book> itr=bookList.iterator();
		int count=0;
		while(itr.hasNext()) {
			Book b=(Book) itr.next();
			if(b.getBookName().equalsIgnoreCase(bookName)) {
				count++;
			}
		}
		return count;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}
