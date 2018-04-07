### 装饰器模式(Decorator Pattern)
* Attach additional responsibilities to an object dynamically
keeping the same interface.Decorators provide a flexible alternative
to subclassing for extending functionality.
* 动态的给一个对象添加一些额外的职责，相对于子类更为灵活。
<div algin = "center">
<img src="https://raw.githubusercontent.com/Yunobububu/DesignPattern/master/src/Pictures/Decorator.png">
</div>

* Compontent: 原始的对象，为抽象类或接口
* ConceretComponent: 具体构件
* Decorator: 装饰角色,必包含一个private变量指向Component的构件
* ConceretDecorator: 具体装饰构件

#### 装饰器模式优点
* 动态的扩展实现一个类的功能，是继承的一种替代方案
* 装饰类和被装饰类独立发展
* 装饰模式是is-a关系，不管装饰多少层返回的还是Component

#### 装饰模式缺点
* 多层装饰提高了系统的复杂度

#### 应用场景
* 动态的为对象增消功能
* 为一批兄弟类增加功能
* 为一个类扩展功能