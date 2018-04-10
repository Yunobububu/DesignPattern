### 策略模式(Strategy Pattern)
* Define a faminly of algorithms,encapsulate each one ,and make them interchangeable
* 策略模式利用的是面向对象的继承和多态机制
<div align = "center">

<img src = "https://raw.githubusercontent.com/Yunobububu/DesignPattern/master/src/Pictures/SrtrategyPattern.png">

</div>

* Context： 封装角色，也叫上下文角色，起承上启下的封装作用，屏蔽高层模块对策略算法的直接访问，封装可能存在的变化
* Strategy：抽象策略角色定义每个策略或算法必须具有的属性或方法
* ConcreteStrategy: 具体策略角色，实现抽象策略中的操作。

#### 策略模式优点：
* 避免多重条件的判断
* 算法可以自由切换
* 扩展性良好

#### 策略模式缺点：
* 策略类数量增多
* 所有策略类都要对外暴露(可用代理模式，工厂方法模式，享元模式修正)

#### 策略模式适用场景：
* 算法需要自由切换的场景
* 需要屏蔽算法规则的场景

#### ！注意：策略家族超过4个要考虑采用混合模式