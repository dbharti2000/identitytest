package com;

public class FileInfo {

    private String fileName;
    private long fileSize;
    private String fileExtension;
    private String mimeType;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getMimeType() {
        return mimeType;
    }


    public void setSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public long getSize() {
        return fileSize;
    }


    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
