# custom-framework

## 业务系统架子的搭建

- 导入 slf4j-log4j12 和 lombok 的依赖
- 实现 basicobject 相关类（HeadLine 和 ShopCategory）
- 掌握泛型类、泛型接口、泛型方法的使用
- 泛型字母的含义
    - E（Element）：在集合中使用，因为集合中存放的是元素
    - T（Type）：Java类
    - K（key）：键
    - V（Value）：值
    - N（Number）：数值类型

## Service 层代码架子的搭建

- solo 相关类
- combine 相关类：包含多个 solo 相关类，统一对 controller 提供服务

## Controller 层代码架子的搭建

- Servlet
    - 实例化
        - Servlet容器创建Servlet的实例
    - 初始化
        - 该容器调用init()方法 
    - 服务
        - 如果请求Servlet，则容器调用 service()方法
    - 销毁
        - 销毁实例之前调用destroy()方法

- 减少Servlet的数量
    - 一个Servlet对应一个实体类？
        - 职责会不单一
        - 前端发送两次请求给不同的Servlet处理
        - 将两个Servlet合并成一个Servlet
    - 一个Servlet对应一个页面？
        - 若一个页面出现两个Get相同请求，则doGet方法指代不清晰
    - 参考Spring MVC，仅通过DispatcherServlet进行请求派发
        - 拦截所有请求
        - 解析请求
        - 派发给对应的Controller里面的方法进行处理
        
## 简单工厂模式

- 适用场景
    - 需要创建的对象较少
    - 客户端不关心对象的创建过程
- 优点
    - 可以对创建的对象进行“加工”，对客户端隐藏相关细节
- 缺点
    - 因创建逻辑复杂或创建对象过多而造成代码臃肿
- 开闭原则
    - 一个软件实体，应该对扩展开发，对修改关闭
        - 应该通过扩展来实现变化，而不是通过修改已有的代码来实现变化
- 随机应变
    - 所有原则并非一定要严格遵守，而是需要结合业务的实际情况
    
![](.README_images/5bd96570.png)

## 工厂方法模式

- 定义一个用于创建对象的接口，让子类决定实例化哪一个类
    - 对类的实例化延迟到其子类
- 优点
    - 遵循开闭原则
    - 对客户端隐藏对象的创建细节
    - 遵循单一职责
- 缺点
    - 添加子类的时候“拖家带口”
    - 只支持同一类产品的创建

![](.README_images/93c29044.png)