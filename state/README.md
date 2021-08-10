# 状态模式

## 有限状态机
有限状态机(Finite State Machine), 缩写是 FSM, 简称为状态机. 被描述的事物的状态的数量是有限个.

状态机有 3 个组成部分：

- 状态(State)
  - 一个状态机至少要包含两个状态.
- 事件(Event)
  - 事件也称为转移条件(Transition Condition), 事件触发状态的转移及动作的执行.
- 动作(Action)
  - 事件发生以后要执行动作.




## 状态机的实现

以下有三种方式实现状态机:

- 分支逻辑法
  - 利用 if-else 或者 switch-case 分支逻辑, 参照状态转移图, 将每一个状态转移原模原样地直译成代码. 对于简单的状态机来说, 这种实现方式最简单、最直接，是首选.
- 查表法
  - 对于状态很多、状态转移比较复杂的状态机来说, 查表法比较合适. 通过二维数组来表示状态转移图, 能极大地提高代码的可读性和可维护性.
- 状态模式
  - 对于状态并不多、状态转移也比较简单, 但事件触发执行的动作包含的业务逻辑可能比较复杂的状态机来说, 首选这种实现方式



参考文章:
* [极客时间-状态模式](https://time.geekbang.org/column/article/218375)
* https://zhangzw.com/posts/20191017.html
* https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/#