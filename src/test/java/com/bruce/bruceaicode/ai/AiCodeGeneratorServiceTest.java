package com.bruce.bruceaicode.ai;

import com.bruce.bruceaicode.ai.model.HtmlCodeResult;
import com.bruce.bruceaicode.ai.model.MultiFileCodeResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeGeneratorServiceTest {

    @Autowired
    private AiCodeGeneratorService aiCodeGeneratorService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode("请生成一个博客页面，不超过20行");
        Assertions.assertNotNull(result);
    }

    @Test
    void generatemultiFileCode() {
        MultiFileCodeResult result = aiCodeGeneratorService.generateMultiFileCode("请生成一个博客页面的留言板，不超过20行");
        Assertions.assertNotNull(result);
    }
}