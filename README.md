# Bruce AI Code - 智能AI代码生成平台

<p align="center">
  <a href="https://github.com/BruceNith/bruce-ai-code">
    <img src="https://img.shields.io/badge/Version-1.0.0-blue.svg" alt="Version">
  </a>
  <a href="https://github.com/BruceNith/bruce-ai-code">
    <img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License">
  </a>
</p>

## 项目简介

Bruce AI Code 是一个基于人工智能的代码生成平台，旨在通过AI技术提升开发效率，减少重复性编码工作。项目结合了现代Web技术和AI框架，为开发者提供智能化的代码生成服务。

## 技术架构

### 后端技术栈

- **核心框架**: Spring Boot 3.5.5 (基于 Java 21)
- **AI框架**: LangChain4j 1.1.0
- **数据库**: MySQL 8.0.33
- **ORM框架**: MyBatis Flex 1.11.0
- **缓存**: Redis + Caffeine (本地缓存)
- **文档**: Knife4j OpenAPI3 4.4.0
- **其他**: 
  - Lombok 1.18.36
  - Hutool 5.8.38
  - HikariCP 连接池
  - Redisson 分布式锁

### 前端技术栈

- **核心框架**: Vue 3 (基于 TypeScript)
- **构建工具**: Vite 7.0.0
- **UI框架**: Ant Design Vue 4.2.6
- **状态管理**: Pinia 3.0.3
- **路由**: Vue Router 4.5.1
- **HTTP客户端**: Axios 1.11.0

## 核心功能模块

### 1. 用户管理系统

- 用户注册/登录
- 权限认证与拦截
- 用户信息管理
- 会话管理

### 2. AI代码生成系统

- 基于自然语言的代码生成
- 多种AI模型支持 (DeepSeek等)
- 实时流式响应 (SSE)
- 代码生成类型路由

### 3. 应用管理系统

- 应用创建与管理
- 应用信息维护
- 应用状态监控
- 应用权限控制

### 4. 对话历史系统

- 对话记录存储
- 对话历史查询
- 分页浏览支持
- 对话内容管理

### 5. 资源管理系统

- 静态资源管理
- 文件上传下载
- 项目打包下载

## 项目结构

```
bruce-ai-code/
├── bruce-ai-code-frontend/    # 前端Vue项目
│   ├── src/
│   │   ├── api/               # 后端API接口封装
│   │   ├── components/        # 公共组件
│   │   ├── pages/             # 页面组件
│   │   ├── layouts/           # 布局组件
│   │   ├── router/            # 路由配置
│   │   ├── stores/            # 状态管理
│   │   └── utils/             # 工具类
│   └── package.json           # 前端依赖配置
├── src/                       # 后端Java项目
│   ├── main/
│   │   ├── java/
│   │   │   └── com/bruce/bruceaicode/
│   │   │       ├── ai/        # AI相关模块
│   │   │       ├── controller/ # 控制层
│   │   │       ├── service/   # 服务层
│   │   │       ├── model/     # 数据模型
│   │   │       ├── mapper/    # 数据访问层
│   │   │       ├── config/    # 配置类
│   │   │       ├── utils/     # 工具类
│   │   │       └── BruceAiCodeApplication.java # 启动类
│   │   └── resources/         # 资源文件
│   └── test/                  # 测试代码
├── sql/                       # 数据库脚本
├── grafana/                   # Grafana监控配置
├── pom.xml                    # Maven配置文件
└── README.md                  # 项目说明文档
```

## 核心特性

### 1. AI驱动的代码生成

项目集成了LangChain4j框架，支持多种AI模型接入，包括DeepSeek等。通过自然语言描述即可生成相应代码，大大提升开发效率。

### 2. 实时流式响应

采用Server-Sent Events (SSE)技术，实现AI生成过程的实时流式输出，提供更好的用户体验。

### 3. 多模型路由机制

通过AI代码生成类型路由服务工厂，根据不同需求自动选择最适合的AI模型进行代码生成。

### 4. 完整的权限控制

基于Spring AOP实现权限拦截，支持用户角色权限管理，确保系统安全性。

### 5. 高性能缓存机制

结合Redis和Caffeine实现多级缓存，提升系统响应速度和并发处理能力。

### 6. 限流保护

内置限流注解，支持多种限流策略，保护系统免受恶意请求影响。

### 7. 监控与度量

集成Spring Boot Actuator和Micrometer，配合Prometheus和Grafana实现系统监控。

## 部署与运行

### 环境要求

- JDK 21
- MySQL 8.0+
- Redis 5.0+
- Node.js 18+
- Maven 3.x

### 后端部署

```bash
# 克隆项目
git clone https://github.com/BruceNith/bruce-ai-code.git

# 进入项目目录
cd bruce-ai-code

# 修改配置文件
# 编辑 src/main/resources/application.yml 配置数据库、Redis等信息

# 构建项目
mvn clean package

# 运行项目
java -jar target/bruce-ai-code-0.0.1-SNAPSHOT.jar
```

### 前端部署

```bash
# 进入前端目录
cd bruce-ai-code-frontend

# 安装依赖
npm install

# 开发模式运行
npm run dev

# 生产构建
npm run build
```

## API文档

项目集成Knife4j OpenAPI3文档，启动后访问 `http://localhost:8123/api/doc.html` 查看API文档。

## 监控系统

项目支持通过Prometheus和Grafana进行监控，相关配置文件位于 [prometheus.yml](prometheus.yml) 和 [grafana/](grafana/) 目录下。

## 许可证

本项目采用MIT许可证，详情请见 [LICENSE](LICENSE) 文件。

## 联系方式

如有问题或建议，请提交Issue或联系项目维护者。