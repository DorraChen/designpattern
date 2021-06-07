# 工厂模式(Factory Design Pattern)
  
## 1.简单工厂

我的理解就是直接 new 相应的对象. 见[RuleConfigSource.java](src/main/java/com/example/designpattern/factory/RuleConfigSource.java) 中的 createParserA 方法和他的优化版 createParserB 方法.

## 2.工厂方法

我的理解就是创建工厂类由工厂类去 new 对象, 使用方只需要使用工厂类即可.

* 工厂方法模式比简单工厂模式更加符合开闭原则:

  在添加新的规则解析器的时候, 只需要创建 parser 类和 parser factory 类, 并将新的 parser factory 对象添加到 [RuleConfigParserFactoryMap.java](src/main/java/com/example/designpattern/factory/RuleConfigParserFactoryMap.java) 的 cachedFactories 即可. 而使用处[RuleConfigSource.java](src/main/java/com/example/designpattern/factory/RuleConfigSource.java) 中的 createParserB 方法无需修改代码. 
  代码改动少,不会影响到使用方,基本上符合开闭原则.

* 工厂方法和简单工厂的使用场景

  工厂模式需要额外创建很多 Factory 类,也会增加代码的复杂性,而且有时候每个 Factory 类只是简单的 new 操作,功能非常单薄. 这种情况下简单工厂会比工厂方法合适,需要自己根据场景看使用哪种.
  
  当对象的创建逻辑比较复杂,不只是简单的 new 一下就可以,而是要组合其他类对象,做各种初始化操作的时候,我们使用工厂方法模式,将复杂的创建逻辑拆分到多个工厂类中,让每个工厂类都不至于过于复杂.

使用工厂模式的最本质参考标准:

* 封装变化：创建逻辑有可能变化，封装成工厂类之后，创建逻辑的变更对调用者透明。

* 代码复用：创建代码抽离到独立的工厂类之后可以复用。

* 隔离复杂性：封装复杂的创建逻辑，调用者无需了解如何创建对象。

* 控制复杂度：将创建代码抽离出来，让原本的函数或类职责更单一，代码更简洁。

## 3.抽象工厂
未研究

Java 中你见过哪些工厂类?
DateFormat、Calendar、Spring 框架中的 BeanFactory



## 4.其他拓展与思考
学工厂模式,总觉得写得很复杂. Java 8 已经提供了函数式接口,是否能够通过函数式实现工厂模式呢?怎么样实现?

[ShapeFactory.java](src/main/java/com/example/designpattern/other/ShapeFactory.java), [FactoryPatternDemo.java](src/main/java/com/example/designpattern/other/FactoryPatternDemo.java)

## 5.实现一个简单的依赖注入(DI)框架

创建对象的"大工程"--依赖注入容器(Dependency Injection Container,简称DI容器)

DI 容器底层最基本的设计思路就是基于工厂模式的.(反射+工厂模式) 

DI 核心功能: 配置解析, 对象创建, 对象生命周期管理.

实现一个简单的依赖注入(DI)框架

* 执行入口
  * ApplicationContext 接口
  * ClassPathXmlApplicationContext 实现类
* 配置文件解析
  * BeanConfigParser 接口
  * XmlBeanConfigParser 实现类
* 核心工厂类设计
  * BeansFactory




参考文章:
* [设计模式之美](https://time.geekbang.org/column/intro/250?utm_source=pc&utm_medium=chaping&utm_term=pc_interstitial_826)
* https://www.oschina.net/question/2680454_2236635?sort=time
