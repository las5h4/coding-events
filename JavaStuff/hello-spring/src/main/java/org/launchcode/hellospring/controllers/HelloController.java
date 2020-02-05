package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value="hello")
public class HelloController {

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives at /hello/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    //create handler that handles requests of the form /hello?name=LaunchCode
    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language) {
        if (language == "english") {
            return "Hello, "+name+"!";
        } else {
            return "wrong language";
        }

    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, "+name+"!";
    }

    //lives at /hello/form
    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<input type=text name='name'>" +
                "<select name='language' id='language'>" +
                "<option value='english' selected='true'>English</option>" +
                "<option value='latin'>Latin</option>" +
                "<option value='pigLatin'>Pig Latin</option>" +
                "<option value='klingon'>Klingon</option>" +
                "<option value='elvish'>Elvish</option>" +
                "</select>" +
                "<input type=submit value='Greet Me'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
