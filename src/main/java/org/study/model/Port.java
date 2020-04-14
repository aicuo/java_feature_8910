package org.study.model;

import lombok.Data;

@Data
public class Port {
    private int portId; // 端口ID
    private int portIndex; // 端口索引
    private String portLevel; // 端口速率
}
