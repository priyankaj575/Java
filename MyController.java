package com.lms.demo.controller;
import java.util.ArrayList;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lms.demo.model.Book;
import com.lms.demo.model.Order;
import com.lms.demo.repository.BookRepository;
import com.lms.demo.repository.OrderRepository;

@RestController
public class MyController {
@Autowired
BookRepository bookRepository;
@Autowired
OrderRepository orderRepository;

//@GetMapping(value = "/getBooks")
@RequestMapping(value = "/getBooks", method = RequestMethod.GET, produces = "application/json")
public List<Book> getBooks() {
List<Book> li = new ArrayList<Book>();
bookRepository.findAll().forEach(li::add);
return li;
}

//@GetMapping("/count")
@RequestMapping(value = "/count", method = RequestMethod.GET, produces = "application/json")
public long countNoofBooks() {
return bookRepository.count();
}

//@GetMapping("/addBook")
@RequestMapping(value = "/addBook", method = RequestMethod.POST, produces = "application/json")
public void addBooks(@RequestBody List<Book> books) {
System.out.println(books);
bookRepository.saveAll(books);
}

//@PutMapping("/delBook")
@RequestMapping(value = "/dekBook", method = RequestMethod.POST, produces = "application/json")
public void delBooks(@RequestBody List<Book> books) {
System.out.println(books);
bookRepository.deleteAll(books);
}

//@GetMapping("/makeBooking")
@RequestMapping(value = "/makeBooking", method = RequestMethod.POST,produces = "application/json")
public void makeBooking(@RequestBody Order orderDetails) {
orderRepository.save(orderDetails);
}

//@PutMapping("/cancelBooking")
@RequestMapping(value = "/cancelBooking", method = RequestMethod.POST,
        produces = "application/json")
public void cancelBooking(@RequestBody String orderDetails) {
System.out.println(orderDetails.split(":")[0]);
orderRepository.deleteByOrderId(orderDetails);
}

}
