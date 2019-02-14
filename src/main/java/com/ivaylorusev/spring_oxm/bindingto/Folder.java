/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivaylorusev.spring_oxm.bindingto;

import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ivaylo Rusev
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Folder {
    
    @XmlElement(name = "page")
    public List<Page> pages;

    @Override
    public String toString() {
        if (pages != null) {
            return Arrays.deepToString(pages.toArray());
        }
        return " ";
    }
    
    
    
    
    
}
