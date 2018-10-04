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
    2. [适配器模型](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/adapter)
    3. [装饰器模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/decorator)
    4. [桥接模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/bridge)
    5. [组合模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/composite)
    6. 享元模式
    7. [外观模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/structure/facade)
- 行为型
    1. [观察者模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/observer)
    2. [模板方法模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/template_method)
    3. [命令模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/command)
    4. [状态模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/state)
    5. 职责链模式
    6. 解释器模式
    7. 中介者模式
    8. 访问者模式
    9. [策略模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/strategy)
    10. [备忘录模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/memento)
    11. [迭代器模式](https://github.com/GatsbyNewton/design-pattern/tree/master/src/main/java/edu/wzm/action/iterator)

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
**代理模式（Proxy Pattern）** ：为另一个对象提供一个替身或占位符以控制对这个对象的访问。代理模式一般分为几种：
1. **远程代理**：也就是为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。
2. **虚拟代理**：是根据需要创建开销很大的对象。通过它来存放实例化需要很长时间的真实对象。
3. **安全代理**：用来控制真实对象访问时的权限。
4. **智能指引**：是指当调用真实的对象时，代理处理另外一些事。

### 适配器模式
**适配器模式（Adapter Pattern）**：将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的了可以合作无间。

适配器模式分为两种：
1. 对象适配器：对象适配器使用**组合**实现；
2. 类适配器：类适配器使用**多重继承**实现。

### 外观模式
**外观模式（Facade Pattern）**：提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

适配器模式 | 外观模式
---|---
当需要使用一个现有的类而其接口并不符合你的需要时，就使用适配器模式。 | 当需要简化并统一一个很大的接口或者一群复杂的接口时，使用外观模式。
适配器模式改变接口以符合客户的期望。 | 外观模式将客户从一个复杂的子系统中解耦。
实现一个适配器可能需要一番功夫，也可能不费功夫，视目标接口的大小与复杂度而定。 | 实现一个外观，需要将子系统组合进外观中，然后将工作委托给子系统执行。
适配器模式有两种形式：对象适配器和类适配器。类适配器需要用到多重继承。 | 外观模式可以为一个子系统实现一个以上的外观。

**适配器模式将一个对象包装起来以改变其接口；装饰者模式将一个对象包装起来以增加新的行为和责任；外观模式将一群对象包装起来以简化其接口。**

### 组合模式
**组合模式（Composite Pattern）**：允许你将对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一致的方式处理个别对象以及对象组合。组合模式有两种方式：
1. 透明方式，就是说在 Component 中声明所有用来管理子对象的方法，其中包括 add()、remove() 等。这样实现 Component 接口的所有子类都具备了 add()、remove()。这样做的好处就是叶节点和枝节点对于外界没有区别，它们具备完全一致的行为接口。但问题也很明显，因为叶节点本身不具备 add()、remove() 方法的功能，所以实现它是没有意义的。
2. 安全方式，就是说在 Component 接口中不去声明 add()、remove() 方法，那么子类的叶节点也就不需要去实现它，而是在 Composite 声明所有用来管理子类对象的方法，这样做就不会出现透明方式的问题，不过由于不够透明，所以树叶和树枝类将不具备相同的接口，客户端的调用需要做相应的判断，带来了不便。

### 桥接模式
**桥接模式（Bridge Pattern）**：将抽象部分与它的实现部分分离，使它们都可以独立地变化。

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

### 备忘录模式
**备忘录模式（Memento State）**：也被称为**快照模式**，指在不破坏封装性的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。

备忘录模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分时，Originator 可以根据保存的 Memento 信息还原到前一状态。

**备忘录模式类图**：\
![img](http://www.runoob.com/wp-content/uploads/2014/08/memento_pattern_uml_diagram.jpg)
- Originator：负责创建一个备忘录 Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。Originator 可根据需要决定 Memento 存储Originator 的哪些内部状态。
- Memento：负责存储 Originator 对象的内部状态，并可防止 Originator 以外的其他对象访问备忘录 Memento。备忘录有两个接口，Caretaker 只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。Originator 能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据。
- Caretaker：负责保存好备忘录 Memento，不能对备忘录的内容进行操作或检查。

### 迭代器模式
**迭代器模式（Iterator Pattern）**：提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。

### 命令模式
**命令模式（Command Pattern）**：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。

敏捷开发原则告诉我们，不要为代码添加基于猜测的、实际不需要的功能。如果不清楚一个系统是否需要命令模式，一般就不要着急去实现它，事实上，在需要的时候通过重构实现这么模式并不困难，只有在真正需要如撤销、恢复操作等功能时，把原来的代码重构为命令模式才有意义。

命令模式的要点：
1. 命令模式将发出请求的对象和执行请求的对象解耦；
2. 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组动作；
3. 命令模式可以支持撤销；
4. 宏命令是命令的一种简单的延伸，允许调用多个命令。宏方法也可以支持撤销；
5. 命令模式可以用来实现日志系统和事物系统。



