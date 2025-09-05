package com.bruce.bruceaicode.common;

import lombok.Data;

import java.io.Serializable;
/**
 * 删除请求包装类
 *
 * @param
 * @author Bruce
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
