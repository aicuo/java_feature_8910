package org.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Site {
    private int siteId;
    private String siteName;
    private List<Ne> neList;
}
