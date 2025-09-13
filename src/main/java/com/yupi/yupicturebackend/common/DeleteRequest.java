package com.yupi.yupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

// 删除请求类，包含ID字段，用于通用的删除请求
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
