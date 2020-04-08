package org.study.model;

import lombok.Data;

import java.util.List;

@Data
public class Ne {
    private int neId; // 网元ID
    private String neName; // 网元名称
    private String neTypeName; // 网元类型名称(RTN 950,RTN 950A)
    private List<Board> boardList; // 网元下单板集合
}
