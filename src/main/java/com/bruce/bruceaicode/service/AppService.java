package com.bruce.bruceaicode.service;

import com.bruce.bruceaicode.model.dto.app.AppQueryRequest;
import com.bruce.bruceaicode.model.entity.User;
import com.bruce.bruceaicode.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.bruce.bruceaicode.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/BruceNith">bruce</a>
 */
public interface AppService extends IService<App> {

    /**
     * 通过对话生成代码
     *
     * @param appId       应用 ID
     * @param message     信息
     * @param loginUser   登录用户
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 部署应用
     *
     * @param appId       应用 ID
     * @param loginUser   登录用户
     * @return
     */
    String deployApp(Long appId, User loginUser);

    /**
     * 获取应用封装类
     *
     * @param app
     * @return
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装类列表
     *
     * @param appList
     * @return
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 构造应用查询条件
     *
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

}
