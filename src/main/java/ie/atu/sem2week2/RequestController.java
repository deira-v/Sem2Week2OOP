package ie.atu.sem2week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String getByName(@PathVariable String name)
    {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam Integer age)
    {
        return "Hello " + name + " " + age;
    }

    @GetMapping("/person")
    public Person getPerson()
    {
        Person person = new Person("Deira", 24);
        return person;
    }
}
