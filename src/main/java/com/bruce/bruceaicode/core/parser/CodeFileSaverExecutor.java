package com.bruce.bruceaicode.core.parser;

import com.bruce.bruceaicode.ai.model.HtmlCodeResult;
import com.bruce.bruceaicode.ai.model.MultiFileCodeResult;
import com.bruce.bruceaicode.core.saver.HtmlCodeFileSaverTemplate;
import com.bruce.bruceaicode.core.saver.MultiFileCodeFileSaverTemplate;
import com.bruce.bruceaicode.exception.BusinessException;
import com.bruce.bruceaicode.exception.ErrorCode;
import com.bruce.bruceaicode.model.enums.CodeGenTypeEnum;

import java.io.File;

/**
 * 代码文件保存执行器
 * 根据代码生成类型执行相应的保存逻辑
 *
 * @author yupi
 */
public class CodeFileSaverExecutor {

    private static final HtmlCodeFileSaverTemplate htmlCodeFileSaver = new HtmlCodeFileSaverTemplate();

    private static final MultiFileCodeFileSaverTemplate multiFileCodeFileSaver = new MultiFileCodeFileSaverTemplate();

    /**
     * 执行代码保存
     *
     * @param codeResult  代码结果对象
     * @param codeGenType 代码生成类型
     * @return 保存的目录
     */
    public static File executeSaver(Object codeResult, CodeGenTypeEnum codeGenType) {
        return switch (codeGenType) {
            case HTML -> htmlCodeFileSaver.saveCode((HtmlCodeResult) codeResult);
            case MULTI_FILE -> multiFileCodeFileSaver.saveCode((MultiFileCodeResult) codeResult);
            default -> throw new BusinessException(ErrorCode.SYSTEM_ERROR, "不支持的代码生成类型: " + codeGenType);
        };
    }
}
