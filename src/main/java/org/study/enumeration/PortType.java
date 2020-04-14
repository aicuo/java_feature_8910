package org.study.enumeration;

public enum PortType {
    FE("FE"),
    GE("GE"),
    GE10("10GE");

    private final String portLevel;

    private PortType(String portLevel) {
        this.portLevel = portLevel;
    }
}
