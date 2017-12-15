package com.hdp.springdemo.model;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Tony Huang on 12/15/2017.
 */
@XmlRootElement
public class PeopleListXml {
    private List<PeopleXml> people;

    public List<PeopleXml> getPeople() {
        return people;
    }

    public void setPeople(List<PeopleXml> people) {
        this.people = people;
    }
}
