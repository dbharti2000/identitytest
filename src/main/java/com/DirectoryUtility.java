package com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.activation.MimetypesFileTypeMap;

public final class DirectoryUtility {


    public static List<FileInfo> extractFileInfo(String path, FileFormatSupported fileFormat) {

        List <FileInfo> fileInfos = new ArrayList<>();
        File directory = new File(path);

        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile() && isSupportedFileType(file, fileFormat)) {
                fileInfos.add(populateFilesInfo(file));
            } else if (file.isDirectory()) {
                extractFileInfo(file.getAbsolutePath(), fileFormat);
            }
        }

        return fileInfos;
    }

    private static boolean isSupportedFileType(File file, FileFormatSupported fileFormat) {
        return file.getName().endsWith(fileFormat.toString());
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    private static FileInfo populateFilesInfo(File file) {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileName(file.getName());
        fileInfo.setSize(file.length());
        fileInfo.setMimeType(new MimetypesFileTypeMap().getContentType(file));
        fileInfo.setFileExtension(getFileExtension(file));

        return fileInfo;
    }

}
