package com.test.chatterbot;


import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
 
@Controller
public class ChatterbotTable {
	@RequestMapping(value = "/table", method=RequestMethod.POST, produces="application/json")
    public ModelMap view(@RequestBody String request) throws DocumentException {
		
		JSONObject jsonobj = JSONObject.fromObject(request);
        String response = (String) jsonobj.get("id");
              
        SAXReader reader = new SAXReader();
        reader.setEncoding("UTF-8");
        Document document = reader.read(new File("C:\\Program Files\\Apache Software Foundation\\Tomcat 7.0\\webapps\\ChatterbotTest\\src\\main\\webapp\\Select.xml"));
        
        Map<String, String> data = new HashMap<String, String>();
        List list = document.getRootElement().elements();
        for (int i = 0; i < list.size(); i++)
        {
            Element element = (Element) list.get(i);
            data.put(element.attributeValue("key"), ((Element)element.elements().get(0)).getText());
        }
        
        /*
    	Map<String, String> data = new HashMap<String, String>();
        data.put("1", "1이다");
        data.put("2", "2이다");
        data.put("3", "3이다");
        data.put("4", "4이다");
        data.put("5", "5이다");
        data.put("6", "6이다");
        */
        ModelMap model = new ModelMap();
        return model.addAttribute("model", data.get(response));
    }

}