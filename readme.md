# Servlet Init Template

### 介绍

一个原生servlet-jsp的web项目初始化模板,导入了lombok功能（日志实现为logback）,
因为是servlet-jsp项目，所以使用的是war包模式，方便快速修改静态资源，快速部署

### 快速开始

> 拉取项目

```text
git clone git@github.com:ForOnly/servlet-init-template.git
```

> 配置tomcat

此处介绍Idea的Tomcat配置介绍(前提是本地已安装Tomcat，并已在Idea集成)

- 从右上角进入到Edit Configuration的页面
- 新建一个配置
- 选择Tomcat Serve ->  Local
- 然后进入到Deployment的tab项
- 添加一个Artifact，下方可以配置application context
- 启动项目




