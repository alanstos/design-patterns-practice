package com.dev.alan.patterns.structural.adapter;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter implements DataProcessor {

    private final XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService){
        this.xmlService = xmlService;
    }

    @Override
    public String process() {
        //recurepa valor xml
        String valorEmXML = this.xmlService.getXml();

        //Convert XML para JSON
        return convert(valorEmXML);
    }

    private String convert(String valorEmXML){
        JSONObject jsonObject = XML.toJSONObject(valorEmXML);
        return jsonObject.toString();
    }
}
