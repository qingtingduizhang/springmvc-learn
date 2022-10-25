# springmvc-learn
learn of springmvc-lession by suns on bilibili
学习进度p116

**使用父子工程好处：**
- 方便管理项目结构及依赖
- boot cloud 都是采用这种结构管理项目
- 在springmvc提前适应

**社区版IDEA部署Tomcat注意事项：**
- 配置文件内部标签的英文字母一定要写对（社区版不会提示）
- 使用集成插件SmartTomcat进行部署，需要提前下载并在IDEA的Other Settings里进行Tomcat安装路径配置
- 在Add Configuration那里需要提前配置Tomcat部署，即Before Launch下的Build Artifact（这个步骤其实就是在项目运行时进行打包生成target文件，这样才可以让Tomcat加载你的代码找到配置文件然后处理请求）
- Build Artifact的包需要提前Ctrl+Alt+Shift+S打开Project Structure里进行构建，记得点击Available Elements项目，并选择项目下的complie output到左侧栏的<output root>下才算选中，之后才能构建
