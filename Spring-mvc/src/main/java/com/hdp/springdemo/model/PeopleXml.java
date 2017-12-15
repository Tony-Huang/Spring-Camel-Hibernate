package com.hdp.springdemo.model;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


/**
 * Created by Tony Huang on 12/15/2017.
 */

@XmlRootElement
public class PeopleXml extends People{

    public PeopleXml() {
    }

    public PeopleXml(String id) {
        super(id);
    }

    public PeopleXml(String id, String name) {
       super(id,name);
    }

    public PeopleXml(String id, String name, Date birthday) {
      super(id, name,birthday);
    }
}
