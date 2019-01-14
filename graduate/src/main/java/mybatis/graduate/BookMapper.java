package mybatis.graduate;

import com.thunisoft.graduate.common.model.Book;

import java.util.List;

public interface BookMapper {

    Book getBooks();
    int addBooks(List<Book> books);
    int updateBook(Book book);
    int deleteBooks(Book book);
}
