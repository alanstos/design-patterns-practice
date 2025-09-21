package com.dev.alan.patterns.structural.adapter;

public class XmlService implements IXmlService {


    @Override
    public String getXml() {
        return "<user><name>Alan</name><age>99</age></user>";
    }
}
