/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivaylorusev.spring_oxm;

import com.ivaylorusev.spring_oxm.bindingto.Properties;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ivaylo Rusev
 */
@Service
public class ContentXMLConverter extends XMLConverter {
    
    private final Unmarshaller unmarshaller;
    
    public ContentXMLConverter() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Properties.class);
        unmarshaller = context.createUnmarshaller();
    }

    @Override
    Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }
    
}
