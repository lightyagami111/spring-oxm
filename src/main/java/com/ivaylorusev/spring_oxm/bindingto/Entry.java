/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivaylorusev.spring_oxm.bindingto;

import com.ivaylorusev.spring_oxm.CDATAAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Ivaylo Rusev
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Entry {
    
    @XmlAttribute
    public String key;
    
    @XmlValue
    @XmlJavaTypeAdapter(value=CDATAAdapter.class)
    public String value;

    @Override
    public String toString() {
        return "\n" + key;
    }
    
    
    
}
