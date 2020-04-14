package org.study.model;

import lombok.Data;

import java.util.List;

@Data
public class Board {
    private int boardId; // 单板ID
    private int slotIndex; // 槽位索引
    private String boardTypeName; // 单板类型名称
    private String boardClassification; // 单板分类
    private List<Port> portList; // 单板下端口集合
}
