package com;

import org.junit.Assert;
import org.junit.Test;

public class DirectoryValidationTest {
    
    
        private static String CURRENT_PROJECT_DIRECTORY = System.getProperty("user.dir");

        @Test
        public void testExtractFileDetailsForCSV() {
            DirectoryUtility directoryUtil = new DirectoryUtility();
            directoryUtil.extractFileInfo(CURRENT_PROJECT_DIRECTORY, FileFormatSupported.CSV);
            Assert.assertTrue(directoryUtil.getFilesInfo().size() == 2);
            System.out.println("Total Number of files of CSV types = "+ directoryUtil.getFilesInfo().size());
        }

        @Test
        public void testExtractFileDetailsForExcel() {
            DirectoryUtility directoryUtil = new DirectoryUtility();
            directoryUtil.extractFileInfo(CURRENT_PROJECT_DIRECTORY, FileFormatSupported.Excel);
            Assert.assertTrue(directoryUtil.getFilesInfo().size() == 2);
            System.out.println("Total Number of files of XLS types = " + directoryUtil.getFilesInfo().size());
        }

        @Test
        public void testExtractFileDetailsForOthers() {
            DirectoryUtility directoryUtil = new DirectoryUtility();
            directoryUtil.extractFileInfo(CURRENT_PROJECT_DIRECTORY, FileFormatSupported.OTHERS);
            Assert.assertFalse(directoryUtil.getFilesInfo().size() == 1);
            System.out.println("Total Number of files of other types = "+directoryUtil.getFilesInfo().size());
        }
    }
