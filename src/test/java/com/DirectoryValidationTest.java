package com;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DirectoryValidationTest {


    private String dataFolder =
            getClass().getResource("/data").getPath();

    @Test
    public void testExtractFileDetailsForCSV() {
        List<FileInfo> fileInfos = DirectoryUtility.extractFileInfo(dataFolder, FileFormatSupported.CSV);
        Assert.assertEquals(1, fileInfos.size());
    }

    @Test
    public void testExtractFileDetailsForExcel() {
        List<FileInfo> fileInfos = DirectoryUtility.extractFileInfo(dataFolder, FileFormatSupported.Excel);
        Assert.assertEquals(1, fileInfos.size());
    }

    @Test
    public void testExtractFileDetailsForOthers() {
        List<FileInfo> fileInfos = DirectoryUtility.extractFileInfo(dataFolder, FileFormatSupported.ANY);
        Assert.assertNotEquals(1, fileInfos.size());
        System.out.println("Total Number of files of any type = " + fileInfos.size());
    }

}
