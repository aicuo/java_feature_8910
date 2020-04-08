package org.study.model;

import lombok.Data;

import java.util.List;

@Data
public class Board {
    private int boardId; // 单板ID
    private int slotIndex; // 槽位索引
    private String boardTypeName; // 单板类型名称(ISM6,ISM8)
    private String boardClassification; // 单板分类(CONTROLLER,IF,ETH,TDM,PIU,FAN,AUX,ODU)
    private List<Port> portList; // 单板下端口集合
}
