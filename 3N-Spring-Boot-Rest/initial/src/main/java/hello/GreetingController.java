package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bye.Bye;

/* This code uses Spring 4’s new @RestController annotation, 
 * which marks the class as a controller where every method returns a domain object instead of a view. 
 * It’s shorthand for @Controller and @ResponseBody rolled together.
 * */ 
@RestController
public class GreetingController {

    private static final String TEMPLATE_HELLO = "Hello, %s!";
    private static final String TEMPLATE_BYE = "Bye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE_HELLO, name));
    }
    
    @RequestMapping("/bye")
    public Bye bye(@RequestParam(value="name", defaultValue="World") String name) {
        return new Bye(counter.incrementAndGet(), String.format(TEMPLATE_BYE, name));
    }
}