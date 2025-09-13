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

    @Test
    void testChatMemory() {
        HtmlCodeResult result = aiCodeGeneratorService.generateHtmlCode( "做个程序员bruce的工具网站，总代码量不超过 20 行");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("不要生成网站，告诉我你刚刚做了什么？");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("做个程序员bruce的工具网站，总代码量不超过 20 行");
        Assertions.assertNotNull(result);
        result = aiCodeGeneratorService.generateHtmlCode("不要生成网站，告诉我你刚刚做了什么？");
        Assertions.assertNotNull(result);
    }

}