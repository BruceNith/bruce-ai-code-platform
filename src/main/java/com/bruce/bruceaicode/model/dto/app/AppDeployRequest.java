package com.bruce.bruceaicode.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * 应用部署请求
 *
 * @author Bruce
 * @date 2023/03/07
 */
@Data
public class AppDeployRequest implements Serializable {

    /**
     * 应用 id
     */
    private Long appId;

    private static final long serialVersionUID = 1L;
}
