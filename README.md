# Java Design Pattern
## 1. 模式分类
模式分类：
- 创建型
    1. 单例模式
    2. [简单工厂模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/creation/simple_factory)
    3. [工厂方法模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/creation/factory_method)
    4. 抽象工厂模式
    5. [建造者模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/creation/builder)
    6. [原型模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/creation/prototype)
- 结构型
    1. [代理模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/proxy)
    2. 适配器模型
    3. [装饰器模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/decorator)
    4. 桥接模式
    5. 组合模式
    6. 享元模式
    7. [外观模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/facade)
- 行为型
    1. [观察者模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/observer)
    2. [模板方法模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/template_method)
    3. 命令模式
    4. [状态模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/state)
    5. 职责链模式
    6. 解释器模式
    7. 中介者模式
    8. 访问者模式
    9. [策略模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/strategy)
    10. 备忘录模式
    11. 迭代器模式

## 2. 创建型
### 简单工厂模式

### 工厂方法模式
**工厂方法模式（Factory Method Pattern）**：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。

**工厂方法模式 vs 简单工厂模式**：
- 简单工厂模式的最大优点在于工厂类中包含了必要的逻辑判断，根据客户端的选择条件动态实例化相关的类，对于客户端来说，去除了与具体产品的依赖。
- 工厂方法模式实现时，客户端需要决定实例化哪一个工厂来实现运算类，选择判断的问题还是存在的，也就是说，工厂方法把简单工厂的内部逻辑判断移到了客户端代码来进行。

### 原型模式
**原型模式（Prototype Pattern）**：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。换言之，原型模式其实就是从一个对象再创建另外一个可定制的对象，而且不需要知道任何创建的细节。

### 建造者模式
**建造者模式（Builder Pattern）**：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式主要是用于创建一些复杂的对象，这些对象内部构件间的建造顺序通常是稳定的，但是对象内部的构建通常面临着复杂的变化。

## 3. 结构型
### 1. 代理模式
**代理模式（Proxy Pattern）** 一般分为几种：
1. **远程代理**：也就是为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。
2. **虚拟代理**：是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。
3. **安全代理**：用来控制真实对象访问时的权限。
4. **智能指引**：是指当调用真实的对象时，代理处理另外一些事。

### 外观模式
**外观模式（Facade Pattern）**：提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

## 4. 行为型
### 策略模式
**策略模式（Strategy Pattern）**：

### 模板方法模式
**模板方法模式（Template Method Pattern）**：在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。**模板就是一个方法**。

模板方法模式 | 策略模式
--- | ---
定义个算法的大纲，而由子类定义其中某些步骤的内容。这样一来算法中的个别步骤可以有不同的实现细节，但是算法的结构依然维持不变。 | 定义一个算法家族，并让这些算法可以互换，因为每个算法都被封装起来了
对算法有更多的控制权，而且不会重复代码，效率可能更高 | 采用委托模型，使用对象组合，所以更有弹性
依赖程度更高 | 依赖程度低
  
### 观察者模式
**观察者模式（Observer Pattern）**：也叫**发布-订阅模式（Publish/Subscribe Pattern）**，定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

### 状态模式
**状态模式（State Pattern）**：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况，把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断逻辑简化。


