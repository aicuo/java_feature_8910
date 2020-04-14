package org.study.enumeration;

public enum NeType {
    RTN950("RTN 950"),
    RTN950A("RTN 950A"),
    RTN980("RTN 980"),
    RTN980L("RTN 980L");

    private final String type;

    private NeType(String type) {
        this.type = type;
    }
}
