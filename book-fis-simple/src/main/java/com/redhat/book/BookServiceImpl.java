package com.redhat.book;

public class BookServiceImpl implements BookService{
	
	private static final Book[] BOOK_ARRAY = {
		new Book(7437655, "20.000 Leguas de Viaje Submarino", "Julio Verne", "Planeta", "1870", "10990", 121),
		new Book(7437656, "Cien Años de Soledad", "Gabriel García Marquez", "Planeta", "1967", "12990", 54),
		new Book(7437657, "Don Quijote de la Mancha", "Miguel De Cervantes Saavedra", "Planeta", "1615", "10990", 22),
		new Book(7437658, "La Divina Comedia", "Dante Alighieri", "Planeta", "1472", "13890", 23),
		new Book(7437659, "Hamlet", "William Shakespeare", "Planeta", "1609", "10990", 67),
			};

	@Override
	public Book[] getAllBooks() {
		return BOOK_ARRAY;
	}

	@Override
	public Book findBook(String id) {
		boolean searching = true;
		int i = 0;
		Book book = null;
		while(searching && i<BOOK_ARRAY.length) {
			if(BOOK_ARRAY[i].getId().equals(Integer.valueOf(id))) {
				book = BOOK_ARRAY[i];
				searching=false;
			}
			i++;
		}
			
		return book;
	}

	@Override
	public String deleteBook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
