package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void readXml(XmlReader[] arrXmlReaders ) throws IOException {

        for (int i = 0; i < arrXmlReaders.length ; i++) {
            try {
                arrXmlReaders[i].read();
            } catch (FileSystemAlreadyExistsException e) {
                throw new FileNotFoundException();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO: проверяйте ваш код здесь

        XmlReader[] xmlReaders = new XmlReader[10];

        for (int i = 0; i <xmlReaders.length ; i++) {
            xmlReaders[i] = new XmlReader();
        }
        readXml(xmlReaders);
    }
}
