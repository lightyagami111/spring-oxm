/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivaylorusev.spring_oxm.bindingto;

import com.ivaylorusev.spring_oxm.CDATAAdapter;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author Ivaylo Rusev
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Page {
    
    @XmlElement(name = "entry")    
    public List<Entry> entries;

    @Override
    public String toString() {
        if (entries != null) {
            return Arrays.toString(entries.toArray());
        }
        return " ";
    }
    
    
    
    
    
}
