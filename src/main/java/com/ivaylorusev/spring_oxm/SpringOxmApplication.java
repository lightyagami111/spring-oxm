package com.ivaylorusev.spring_oxm;

import com.ivaylorusev.spring_oxm.bindingto.Properties;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOxmApplication implements CommandLineRunner {

    private static final String XML_FILE_NAME = "src/main/resources/Shop_de_LU.xml";

    @Autowired
    private ContentXMLConverter converter;

    public static void main(String[] args) {
        SpringApplication.run(SpringOxmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Properties shopContent = (Properties) converter.convertFromXMLToObject(XML_FILE_NAME);

        //all keys
//        List<String> keysSorted = new ArrayList<>();
//        shopContent.folders.forEach((folder) -> {
//            if (folder.pages != null) {
//                folder.pages.forEach((page) -> {
//                    if (page.entries != null) {
//                        page.entries.forEach((entry) -> {
//                            keysSorted.add(entry.key);
//                        });
//                    }
//                });
//            }
//        });
        
        //no duplicated
        HashMap<String, String> map = new HashMap<>();
        shopContent.folders.forEach((folder) -> {
            if (folder.pages != null) {
                folder.pages.forEach((page) -> {
                    if (page.entries != null) {
                        page.entries.forEach((entry) -> {
                            map.put(entry.key, entry.value);
                        });
                    }
                });
            }
        });        
        List<String> keysSorted = map.keySet().stream().collect(Collectors.toList());
        
        
        
        
        
        
        Collections.sort(keysSorted, (o1, o2) -> o1.compareTo(o2));        

        System.out.println(String.join("\n", keysSorted));

    }

}
