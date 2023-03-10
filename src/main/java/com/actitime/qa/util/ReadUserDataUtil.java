package com.actitime.qa.util;
import com.actitime.qa.entities.UserData;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadUserDataUtil {
    public static UserData getUserData() throws IOException, CsvValidationException {
        String projectDir = System.getProperty("user.dir");
        String dataFilePath = projectDir + "/src/main/java/com/actitime/qa/testdata/userData.csv";

        CSVReader reader = new CSVReader(new FileReader(dataFilePath));
        String[] line;

        // Ignore header
        reader.readNext();

        // Read first user
        line = reader.readNext();
        reader.close();

        UserData userData = new UserData(line[0], line[1], line[2]);
        return  userData;
    }
}
