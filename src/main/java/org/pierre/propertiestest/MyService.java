package org.pierre.propertiestest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    EmailProperties emailProperties;

    @Autowired
    EmailPropertiesMap emailPropertiesMap;

/*
    @Value("${cassandra.connection.hosts}")
    private List<String> hosts;
*/

    //@Value("#{'${my.list.of.strings}'.split(',')}")
    @Value("#{'${my.list.of.strings}'}")
    private List<String> myList;

    public void printProperties() {
        //System.out.println("hosts="  + hosts);
        System.out.println("myList="  + myList);
        System.out.println("emailProperties=" + emailProperties.getSendTo());
        System.out.println("emailPropertiesMap=" + emailPropertiesMap.getSendTo());
    }
}
