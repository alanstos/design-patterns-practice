                <<interface>>
                DataProcessor
                + process(): String

                        ▲
                        │
                        │ implements
                        │
        XmlToJsonAdapter --------------------> XmlService
        + process(): String                   + getXml(): String
        - xmlService: XmlService

                 ▲
                 │ uses
                 │
            Application
       - dataProcessor: DataProcessor
       + usar(): String
