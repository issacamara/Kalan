package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	Student std = Student.find("order by CREATED desc").first();
        List<Teacher> teachers = Teacher.find(
            "order by CREATED desc"
        ).from(0).fetch(10);
        render(std, teachers);
        //render();
    }

}