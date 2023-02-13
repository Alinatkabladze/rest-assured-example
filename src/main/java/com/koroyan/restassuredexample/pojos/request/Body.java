package com.koroyan.restassuredexample.pojos.request;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({AddInteger.class,FindPerson.class})
@XmlType(namespace = "http://tempuri.org")
public class Body {

    @XmlAnyElement(lax = true)
    private Object object;

    //AddInteger addInteger;
    //FindPerson findPerson;

    public Body(){}

    public Body(Object object) {
        this.object = object;
    }


    public Object getAnyObject() {
        return object;
    }

    public void setAnyObject(Object object) {
        this.object = object;
    }
}
