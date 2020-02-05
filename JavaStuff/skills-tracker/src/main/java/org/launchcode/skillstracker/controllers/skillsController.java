package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class skillsController {

    @GetMapping(value="")
    @ResponseBody
    public String displayMain() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to use. Here's the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value="form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form method='post'>" +
                "<label>Name:</label>" +
                "<input type=text name='name'>" +
                "<label>My Favorite Language</label>" +
                "<select name=optionOne>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<label>My Second Favorite Language</label>" +
                "<select name=optionTwo>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<label>My Third Favorite Language</label>" +
                "<select name=optionThree>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<input type=submit value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String optionOne, @RequestParam String optionTwo, @RequestParam String optionThree) {
        return "<html>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+optionOne+"</li>" +
                "<li>"+optionTwo+"</li>" +
                "<li>"+optionThree+"</li>" +
                "</body>" +
                "</html>";
    }
}
