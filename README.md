# sky-take-out

>
>
>

# 一、依赖项配置

#### 1. 父工程（sky-take-out）依赖说明

| 依赖分类             | 具体依赖                       | 版本            | 作用描述                                                |
| -------------------- | ------------------------------ | --------------- | ------------------------------------------------------- |
| **Spring Boot 基础** | spring-boot-starter-parent     | 3.5.4           | 作为父依赖，统一管理 Spring Boot 生态所有依赖的版本     |
| **Web 开发**         | spring-boot-starter-web        | 3.5.4           | 提供 Web 开发核心功能（MVC、RESTful、嵌入式服务器等）   |
| **数据库**           | mybatis-spring-boot-starter    | 3.0.5           | 整合 MyBatis 与 Spring Boot，简化数据库操作             |
|                      | mysql-connector-java           | 8.0.16          | MySQL 数据库的 JDBC 驱动，用于连接数据库                |
|                      | druid-spring-boot-starter      | 1.2.18          | 阿里巴巴的数据库连接池，提供连接管理和监控功能          |
| **工具类**           | lombok                         | 1.18.30         | 通过注解简化 JavaBean 代码（自动生成 getter/setter 等） |
|                      | fastjson                       | 1.2.83          | 高性能 JSON 处理工具，支持 JSON 与 Java 对象转换        |
|                      | commons-lang                   | 20030203.000129 | Apache 工具类库，提供字符串、集合等常用操作             |
| **扩展功能**         | pagehelper-spring-boot-starter | 1.4.6           | MyBatis 分页插件，简化分页查询实现                      |
|                      | knife4j-spring-boot-starter    | 3.0.3           | 基于 Swagger 的 API 文档生成工具，支持在线调试          |
|                      | aspectjrt/aspectjweaver        | 1.9.20.1        | AOP 框架支持，用于实现日志、事务等横切逻辑              |
|                      | jjwt-*                         | 0.11.5          | JWT 工具，用于身份认证和授权                            |
|                      | aliyun-sdk-oss                 | 3.16.1          | 阿里云 OSS SDK，用于文件存储（如图片、文档）            |
|                      | poi/poi-ooxml                  | 5.2.4/5.4.0     | Excel 处理工具，支持 xls 和 xlsx 格式的读写             |
|                      | wechatpay-apache-httpclient    | 0.4.7           | 微信支付 APIv3 客户端，支持微信支付功能开发             |
| **构建工具**         | maven-compiler-plugin          | -               | Maven 编译插件，配置 Lombok 注解处理器                  |
|                      | spring-boot-maven-plugin       | -               | Spring Boot 打包插件，将项目打包为可执行 JAR            |

#### 2. 子模块 sky-server 依赖说明

| 依赖类型         | 具体依赖                       | 作用描述                                            |
| ---------------- | ------------------------------ | --------------------------------------------------- |
| **内部模块依赖** | sky-common                     | 依赖公共工具模块，复用通用工具类、常量、异常处理等  |
|                  | sky-pojo                       | 依赖实体类模块，复用数据模型（POJO/DTO/VO 等）      |
| **核心功能**     | spring-boot-starter            | Spring Boot 核心依赖，提供自动配置等基础功能        |
|                  | spring-boot-starter-web        | Web 开发核心依赖，支持 Controller、RESTful 接口开发 |
|                  | mybatis-spring-boot-starter    | 集成 MyBatis，实现数据库操作                        |
|                  | mysql-connector-java           | 运行时依赖，用于连接 MySQL 数据库                   |
| **性能优化**     | spring-boot-starter-data-redis | Redis 缓存支持，提升查询性能                        |
|                  | spring-boot-starter-cache      | 缓存抽象层，支持多种缓存实现                        |
| **扩展功能**     | spring-boot-starter-websocket  | 支持 WebSocket 实时通信（如订单状态推送）           |
|                  | druid-spring-boot-starter      | 数据库连接池，优化数据库连接管理                    |
|                  | pagehelper-spring-boot-starter | 分页插件，简化分页查询实现                          |
|                  | knife4j-spring-boot-starter    | 生成 API 文档，方便前后端对接                       |
| **开发效率**     | lombok                         | 简化代码编写，减少模板代码                          |
|                  | fastjson                       | JSON 处理工具，用于接口数据序列化 / 反序列化        |
|                  | aspectjrt/aspectjweaver        | AOP 支持，实现日志、权限等横切逻辑                  |
| **文件处理**     | poi/poi-ooxml                  | 支持 Excel 导入导出功能                             |
| **测试支持**     | spring-boot-starter-test       | 提供单元测试和集成测试支持                          |

#### 3. 子模块 sky-pojo 依赖说明

| 依赖名称                    | 作用描述                                                     |
| --------------------------- | ------------------------------------------------------------ |
| lombok                      | 通过注解（如 @Data）自动生成实体类的 getter/setter/ 构造器等，减少代码量 |
| jackson-databind            | JSON 处理工具，支持实体类与 JSON 数据的相互转换（序列化 / 反序列化） |
| knife4j-spring-boot-starter | 提供 API 文档注解（如 @ApiModel、@ApiModelProperty），用于生成实体类的文档说明 |

#### 4. 子模块 sky-common 依赖说明

| 依赖类型       | 具体依赖                            | 作用描述                                              |
| -------------- | ----------------------------------- | ----------------------------------------------------- |
| **通用工具**   | lombok                              | 简化工具类代码编写                                    |
|                | fastjson                            | 提供 JSON 处理的公共方法                              |
|                | commons-lang                        | 提供字符串、集合等通用操作工具类                      |
|                | spring-boot-starter-json            | 集成 Spring 的 JSON 处理功能                          |
| **认证授权**   | jjwt-*                              | 封装 JWT 工具类，提供统一的身份认证和授权功能         |
| **配置支持**   | spring-boot-configuration-processor | 提供配置文件的自动提示功能，提升开发效率              |
| **第三方服务** | aliyun-sdk-oss                      | 封装阿里云 OSS 操作工具类，提供文件上传下载的公共方法 |
|                | wechatpay-apache-httpclient         | 封装微信支付相关工具类，提供支付功能的公共逻辑        |
| **数据处理**   | jaxb-api                            | 提供 XML 与 Java 对象转换的公共工具                   |

### 三、模块关系说明

1. **父工程（sky-take-out）**：作为项目根模块，统一管理所有依赖版本，定义子模块结构。
2. **sky-common**：提供全局通用工具和组件，被`sky-server`依赖。
3. **sky-pojo**：存放所有实体类，被`sky-server`和`sky-common`依赖。
4. **sky-server**：项目主应用模块，依赖`sky-common`和`sky-pojo`，包含业务逻辑和接口实现。

这种模块化设计实现了代码复用和职责分离，便于维护和扩展。