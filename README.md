# 设计模式

## 创建型
创建型模式主要解决对象的创建问题，封装复杂的创建过程，解耦对象的创建代码和使用代码。

创建型模式有以下几种:
- [单例模式(Singleton Design Pattern)](singleton/README.md)
  - 单例模式用来创建全局唯一的对象。
- [工厂模式(Factory Design Pattern)](factory/README.md)
  - 工厂模式用来创建不同但是相关类型的对象（继承同一父类或者接口的一组子类），由给定的参数来决定创建哪种类型的对象。
- [创造者模式(Builder Design Pattern)](builder/README.md)
  - 建造者模式是用来创建复杂对象，可以通过设置不同的可选参数，“定制化”地创建不同的对象。
- [原型模式(Prototype Design Pattern)](prototype/README.md)
  - 原型模式针对创建成本比较大的对象，利用对已有对象进行复制的方式进行创建，以达到节省创建时间的目的。

## 构造型
- [代理模式(Proxy Design Pattern)](proxy/README.md)
- 桥接
- 装饰者
- 适配器
- 外观
- 组合
- 享元

## 构造型
- 观察者
- 模板方法
- 策略
- [职责链模式(Chain of Responsibility Design Pattern)](chain-of-responsibility/README.md)
- 迭代器
- [状态模式(State Design Pattern)](state/README.md)
- 访问者
- 备忘录
- 命令
- 解释器
- 中介