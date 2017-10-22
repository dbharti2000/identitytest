package com;

public enum FileFormatSupported {
    CSV("csv"),
    Excel("xlsx"),
    ANY("");

    private final String name;

    private FileFormatSupported(String str) {
        name = str;
    }

    public String toString() {
        return this.name;
    }

    public boolean equalsName(String fileName) {
        return name.equals(fileName);
    }

}
