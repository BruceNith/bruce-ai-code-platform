package com.bruce.bruceaicode.service;

import com.bruce.bruceaicode.model.dto.chathistory.ChatHistoryQueryRequest;
import com.bruce.bruceaicode.model.entity.User;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.bruce.bruceaicode.model.entity.ChatHistory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;

import java.time.LocalDateTime;

/**
 * 对话历史 服务层。
 *
 * @author <a href="https://github.com/BruceNith">bruce</a>
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 添加聊天记录
     *
     * @param appId       应用 ID
     * @param message     信息
     * @param messageType 消息类型
     * @param userId      用户 ID
     * @return
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    /**
     * 分页查询某 APP 的对话记录
     * */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);

    /**
     * 加载对话历史到内存中
     *
     * @param appId       应用 ID
     * @param chatMemory
     * @param maxCount    最多加载多少条
     * @return            加载成功的条数
     */
    int loadChatHistoryToMemory(Long appId, MessageWindowChatMemory chatMemory, int maxCount);

    /**
     * 构造查询条件
     *
     * @param chatHistoryQueryRequest 查询条件
     * @return
     * */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);

    /**
     *  根据应用 ID 删除对话记录
     * */
    boolean deleteByAppId(Long appId);
}
