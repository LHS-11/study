package site.metacoding.junitproject.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import site.metacoding.junitproject.domain.BookRepository;
import site.metacoding.junitproject.util.MailSender;
import site.metacoding.junitproject.util.MailSenderStub;
import site.metacoding.junitproject.web.dto.BookRespDto;
import site.metacoding.junitproject.web.dto.BookSaveReqDto;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
public class BookServiceTest {

    @Autowired
    private BookRepository bookRepository;
    @Test
    public void 책등록하기_test(){
        //given
        BookSaveReqDto dto = new BookSaveReqDto();
        dto.setTitle("junit강의");
        dto.setAuthor("메타코딩");

        //stub
        MailSenderStub mailSenderStub = new MailSenderStub();
        // 가짜로 repository 만들기!!

        //when
        BookService bookService = new BookService(bookRepository, mailSenderStub);
        BookRespDto bookRespDto = bookService.책등록하기(dto);

        //then
        assertEquals(dto.getTitle(), bookRespDto.getTitle());
        assertEquals(dto.getAuthor(), bookRespDto.getAuthor());
    }
}
