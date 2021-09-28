package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String home() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2><ol> HTML</ol>" +
                        " <ol>CSS</ol>" +
                        "<ol>JavaScript </ol></h2>" +
                        "</body>" +
                        "</html>";
        return html;

    }
    @PostMapping (value = "skillPreference")
    @ResponseBody
    public String submittedSkills(@RequestParam String myName, @RequestParam String languages1, @RequestParam String languages2, @RequestParam String languages3) {
        String html = "<h1>" + myName + "</h1>" +
                "<ol>"+
                "<li>" + languages1 + "</li>" +
                "<li>" + languages2 + "</li>" +
                "<li>" + languages3 + "</li>" +
                "</ol>";
        return html;
    }
    @GetMapping("skillPreference")
    @ResponseBody
    public String skills() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/skillPreference'>" +
                        "<h1> Skills Tracker </h1>" +
                        "<h2> My name is </h2>" +
                        "<input type = 'text' name = 'myName' value = 'Enter name'/>" +
                        "<h2> My Skill preferences are </h2>" +
                        "<h2> My first preference </h2>" +
                        "<select name ='languages1' id='FirstPreference'>" +
                        "<option value='HTML'>HTML</option>" +
                        "  <option value='CSS'>CSS</option>" +
                        "  <option value='Javascript'>Javascript</option>" +
                        "</select>" +
                        "<h2> My second preference </h2>" +
                        "<select name ='languages2' id='SecondPreference'>" +
                        "<option value='HTML'>HTML</option>" +
                        "  <option value='CSS'>CSS</option>" +
                        "  <option value='Javascript'>Javascript</option>" +
                        "</select>" +
                        "<h2> My third preference </h2>" +
                        "<select name ='languages3' id='ThirdPreference'>" +
                        "<option value='HTML'>HTML</option>" +
                        "  <option value='CSS'>CSS</option>" +
                        "  <option value='Javascript'>Javascript</option>" +
                        "</select>" +
                        "</br>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;

    }


}
