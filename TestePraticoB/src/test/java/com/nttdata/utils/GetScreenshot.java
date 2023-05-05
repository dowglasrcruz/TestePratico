package com.nttdata.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshot {
    public static final String SCREENSHOT_PATH = "evidence";

    public static void takeScreenshot(WebDriver driver, String subdirectory) {
        try {
            StringBuilder bld = new StringBuilder();
            bld.append(SCREENSHOT_PATH);
            bld.append(File.separator);
            bld.append(subdirectory); 
            File directory = new File(bld.toString());
            if (!directory.exists()) {
                directory.mkdirs();
            }
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(source, new File(getEvidenceFileName(SCREENSHOT_PATH, subdirectory)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getEvidenceFileName(String directoryName, String subDirectory) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS");
        String date = sdf.format(new Date());
        StringBuilder stBuilder = new StringBuilder();
        stBuilder.append(".");
        stBuilder.append(File.separator);
        stBuilder.append(directoryName);
        stBuilder.append(File.separator);
        stBuilder.append(subDirectory);
        stBuilder.append(File.separator);
        stBuilder.append(date);
        stBuilder.append(".png");
        return stBuilder.toString();
    }

}
