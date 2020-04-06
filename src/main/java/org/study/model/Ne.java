package org.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ne {
    private int neId;
    private int siteId;
    private String neName;
    private String neType;
}
