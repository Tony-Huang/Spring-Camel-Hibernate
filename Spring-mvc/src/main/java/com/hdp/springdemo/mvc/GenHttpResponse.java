package com.hdp.springdemo.mvc;

import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.hdp.springdemo.model.*;
import com.hdp.springdemo.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Tony Huang on 12/15/2017.
 */
@Controller
public class GenHttpResponse {

    @RequestMapping(value = "/people/json/get", method=RequestMethod.GET)
    @ResponseBody
    public List<People> response4Get() {
        System.out.println("Annotation People response for GET");
        return this.genPeopleList();
    }

    private List<People> genPeopleList() {
        LinkedList<People> list = new LinkedList<People>();
        list.add(new People("e001", "Tony", new Date()));
        list.add(new People("e002", "Smith"));
        list.add(new People("e003", "Patrick"));
        return list;
    }


    @RequestMapping(value = "/people/json/post", method=RequestMethod.POST)
    @ResponseBody
    public List<People> response4Post(@RequestBody People people) {
        System.out.println("get Request body for POST :" +people);

        System.out.println("Annotation People response for POST");
        return this.genPeopleList();
    }

    /****** ******/
    @RequestMapping(value = "/people/json/postForm", method=RequestMethod.POST)
    @ResponseBody
    public List<People> processRequest4Post( @RequestParam Map params ) {
        System.out.println("request params="+params);
        System.out.println("Annotation People response for POST");
        return this.genPeopleList();
    }


    @RequestMapping(value = "/people/json/put", method=RequestMethod.PUT)
    @ResponseBody
    public Result response4Put() {
        System.out.println("Annotation People response for PUT");
        return new Result();
    }

    @RequestMapping(value = "/people/json/get/error", method=RequestMethod.GET)
    @ResponseBody
    public List<People> response4Error() throws Exception{
        System.out.println("Annotation  error response for GET");
        throw new Exception("Error!");
    }

    @RequestMapping(value = "/people/json/get/bizError", method=RequestMethod.GET)
    @ResponseStatus(value= HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Error response4BizError(){
        System.out.println("Annotation  biz error response for GET");
        Error err = new Error();
        err.setCode("HDP_BIZ_001");
        err.setMessage("Internal Server Error! Can not connect people service!");
        return err;
    }


    @RequestMapping(value = "/people/redirect", method=RequestMethod.GET)
    public void redirect(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("redirect to baidu.com");

        response.sendRedirect("http://www.baidu.com");
        return;
    }


    @RequestMapping(value="/people/json/{name}", method=RequestMethod.GET)
    @ResponseBody
    public People getPeopleJson(@PathVariable String name) {
        return new People(name, "Random..");
    }

    @RequestMapping(value="/people/xml/{name}", method=RequestMethod.GET)
    @ResponseBody
    public PeopleXml getPeopleXml(@PathVariable String name) {
        return new PeopleXml(name, "Random..");
    }

    @RequestMapping(value="/people/xml", method=RequestMethod.GET)
    @ResponseBody
    public PeopleListXml getPeopleXmls() {
        return this.genPeopleListX();
    }


    private PeopleListXml genPeopleListX() {
        LinkedList<PeopleXml> list = new LinkedList<PeopleXml>();
        list.add(new PeopleXml("e001", "Tony", new Date()));
        list.add(new PeopleXml("e002", "Smith"));
        list.add(new PeopleXml("e003", "Patrick"));

        PeopleListXml listXml = new PeopleListXml();
        listXml.setPeople(list);
        return listXml;
    }


}