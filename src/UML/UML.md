#### 类之间的关系
<div align="center">
    <img src="https://raw.githubusercontent.com/Yunobububu/ThinkInJava/master/src/GraphvizOuts/ClassRelation.png">
</dir>

* 依赖:B的变化将影响到A,是use-a的关系。B为A的局部变量、方法参数、静态变量
* 关联:比依赖的耦合性要强,是has-a的关系。D作为C的全局变量，关联的对象通常是对等的。
* 聚合:是关联关系的一种，has-a的关系。有整体和局部的感觉，生命周期不同，例如Team和Student,Team散了,Student仍然存在。 
* 组合：强依赖的特殊聚合关系。也是has-a的关系,整体和局部生命周期相同。例如Human与Head,Head是Human的一部分,依赖Human而存在。
* 泛化(继承和实现)：具体来说就是继承和实现,is-a的关系。
##### Tips：关联关系由弱变强







##### 参考链接：
* 1.[graphviz画UML](https://www.jianshu.com/p/d730f83bd81f)
* 2.[解决dir与arrowhead不兼容](https://stackoverflow.com/questions/14415419/graphviz-custom-back-arrow)