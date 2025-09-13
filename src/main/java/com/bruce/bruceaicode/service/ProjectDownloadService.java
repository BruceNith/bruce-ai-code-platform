package com.bruce.bruceaicode.service;

import jakarta.servlet.http.HttpServletResponse;

public interface ProjectDownloadService {

    /**
     * 下载项目压缩包
     * @param projectPath 项目路径
     * @param downloadFileName 下载文件名
     * @param response 响应
     */
    public abstract void downloadProjectAsZip(String projectPath, String downloadFileName, HttpServletResponse response);

}
