package org.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
public class Site {
    private int siteId; // 站点ID
    private String siteName; // 站点名
    private List<Ne> neList; // 站点下网元集合
}
