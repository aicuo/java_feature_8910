package org.study.enumeration;

public enum BoardType {
    CSHA("CSHA", "CONTROLLER"),
    CSHB("CSHB", "CONTROLLER"),
    CSHC("CSHC", "CONTROLLER"),

    ISM6("ISM6", "IF"),
    ISM8("ISM8", "IF"),
    ISU2("ISU2", "IF"),
    ISV3("ISV3", "IF"),

    EG6("EG6", "ETH"),
    EG4("EG4", "ETH"),
    EFP6("EFP6", "ETH"),
    EFT4("EFT4", "ETH");

    private final String boardTypeName;
    private final String boardClassification;

    private BoardType(String boardTypeName, String boardClassification) {
        this.boardTypeName = boardTypeName;
        this.boardClassification = boardClassification;
    }
}
