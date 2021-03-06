# JAVA_基础

汇总java基础知识、主要知识点来自于 《Java编程思想》第4版。

# JAVA编程思想总结

## chapter1 OOP导论

OOP思想，以及OOP全貌。

目标： 描述清楚OOP的一个全貌，核心特性。//TODO


## chapter2 一切皆对象

JAVA程序的基本组成（定义类、创建对象、操纵对象、销毁对象-自动）。

目标：编写一套示例代码，演示定义类、创建对象、操纵对象。
代码见 com.zhouyinyan.demo.everythingisobject 包中。

注意点：
1. 类中的基本类型在对象初始化时，会默认为0值。而基本类型局部变量不会，编译器也会阻止我们使用未初始化的局部变量。
2. 类中的静态字段只会一份存储空间，这个类的所有对象共享该静态字段。

## chapter3 操作符

java中的运算、赋值、关系、逻辑、位、三目、类型转换操作符。

目标：编写相关的一套示例代码对一些注意点的说明。
代码见 com.zhouyinyan.demo.operator 包中。

注意点：
1. 别名机制，即将一个对象的引用赋值给另外一个引用后，那么就有两个引用都指向该对象，对象就像是拥有多个名字一样。此时通过任何一个引用都能操纵对象，而通过其他引用可以观察到操纵带来的变化。
需要注意的是在方法调用中的别名问题。
2. 自增++，自减--；分为前缀式和后缀式，前缀式表示先计算后生成值；后缀表示先生成值后计算。
3. == 和 != 作用在对象引用时，比较的是引用是否相等（引用相等表示指向的是同一个对象，不相等表示指向不同的对象），对象的值（或者对象内容）是否相等，使用equals()方法。
4. 逻辑表达式中的短路，一旦明确无误的确定整个表达式的值，就不用再计算表达式剩下的部分。
5. 基本数据类型转换（出boolean类型外），将一种数据类型转换为另外一种，包括扩展转换和窄化转换。扩展转换不会丢失信息，不必显式转换，java自动替我们转换。窄化转换可能会丢失信息，编译器要强制我们做显式的转换。
6. 溢出,如果两个足够大的int值相乘，结果会溢出int的最大范围，因此要考虑到如何进行安全的运算。


## chapter4 流程控制

java中控制流程的if-else、 迭代（循环）、break continue、foreach语法、switch

目标：编写相关的一套示例代码对一些注意点的说明。
代码在：com.zhouyinyan.demo.flowcontrol 中。//TODO

注意点：
1. 在迭代语句（循环）中，break 用于强制退出循环，continue 用于停止当前迭代，然后从循环开始进行下一次迭代。
2. switch语句中，case块通常都会跟一个break结尾，这样可以让程序跳转到switch主体的结尾，否则会继续执行下面的case语句。


## chapter5 初始化和清理

java中对象初始化和清理相关知识点

目标：编写一组示例了解各种场景下的初始化。
代码：com.zhouyinyan.demo.initandclean 包中。

注意点：
1. 方法重载，相同的方法名称，可表达不通过的语义，通过给定不通过的参数列表，来对具体不同的语义实现。简而言之，相同的方法名，不同的参数列表构成了方法重载。
2. this关键字，表示"调用方法的那个对象的引用"，即this指向正在调用方法的那个对象。this还用于构造器重载中调用其他构造器。
3. static关键字，可以在没有创建对象（没有this）的情况向，通过类本身来访问static字段和调用static方法。static修饰的字段只占用一份存储空间，只会初始化一次。
4. 对象的创建过程：
首次创建对象时（new 构造方法-构造方法实际上是静态的），或者访问类的静态方法/静态字段时，查找对应类的class文件，
然后加载class二进制到内存中，创建Class对象，此时有关静态初始初始化的所有动作都会执行（静态字段，静态块），因此静态初始化只会执行一次。
接着在堆上给对象分配内存空间。
分配的这块空间为清零，这就自动将类中的字段都初始化为0值
执行所有在定义字段时设定的初始值
最后执行构造方法，完成自定义初始化。
5. 创建enum时，编译器自动添加toString()-名字、ordinal()-声明顺序、values()-声明的常量构成的数组。


## chapter6 访问权限控制

java中的包、public protect private 权限修饰符知识

目标：编写一组示例用以说明包、public protect private 权限修饰符
代码：com.zhouyinyan.demo.accesscontrol

注意点：
1. 每个编译单元（每个文件）只能有一个public类，多个编译器会给出错误信息。
2. 尽可能将字段定义为private的，用于封装内部数据目的，让客户端通过public开放的接口依赖，而不是直接依赖字段，提高内部字段变更的灵活性


## chapter7 复用类

java中的组合、继承两种重用类机制。

目标：编写一组示例说明组合、继承、代理、final关键字、初始化和类的加载
代码：com.zhouyinyan.demo.reuseclass 

注意点：
1. 继承中，创建子类对象时，会先创建父类对象（创建对象的完整过程，包括构造方法），然后创建子类对象，在子类对象中通过super执行父类对象。
当父类中不是默认构造方法时，在子类中需要显式的调用父类构造方法。
2. 当我们要做除内存之外的清理工作时（比如关闭IO，释放连接等），不能依靠垃圾处理器来做（比如调用finalize方法），因为垃圾处理器可能永远都不会触发，也不保证清理的顺序。
所以一定要注意需要手工做清理工作（通常在finally里面执行具体的清理）
3. 实际工作中，优先组合，确实有必要继承时才使用继承（通常问问自己需要不需要向上转型）
4. final作用在字段上时，说明字段是不可变的（基本类型则值不可变，引用类型则表示不能修改指向另外的对象；加上static时，指明是静态的-类级别的）；
final作用在方法上时，说明方法不能被覆盖重写；作用在类上时，说明不能被继承。



## chapter8 多态

java中多态的知识点

目标:编写一组示例说明多态的特性
代码：com.zhouyinyan.demo.polymorphism

注意点：
1. 向上转型指的是在继承结构中，继承的子类可以转型为其基类，因为子类是基类的超集，所以向上转型是安全的。
2. 多态值的是，客户端程序可以面向基类编程。在运行时动态绑定具体的子类方法，表现为具体子类的行为。
3. 在父类构造方法中调用具备多态的方法时，极有可能导致错误（程序逻辑上正确，编译器也不报错），这是因为在执行父类构造方法时，
如果调用了多态方法，发生动态绑定，最终会调用到子类的方法上，而此时子类还未初始化完成（子类构造方法需要等父类构造方法完成之后才执行），那么在不完整的子类对象上执行操作极有可能出现错误（比如字段是0值）
4. 协变返回类型，指的是覆盖方法的返回类型可以是父类的方法的返回类型的子类类型，比如基类方法返回的类型是A，子类覆盖方法返回的类型可以是B，只要B继承至A。
5. 运行时类型识别（RTTI),在运行期间，向下转型会对类型检查，确保转型的类型是我们希望的类型，否则会抛出ClassCastException异常。

## chapter9 接口

java中接口的使用和特性

目标：编写一组示例说明接口的特性
代码：com.zhouyinyan.demo.interfacedemo 

注意点：
1. 接口中的字段默认是public、static和final的，方法默认是public的
2. 任何的抽象性都应该是应真正的需求而产生的，接口也不例外。过分的抽象会带来额外的复杂性，反而增加负担。切当的原则是优先使用类，从类开始，如果的接口的必要性变得明确，那么就进行重构。

## chapter10 内部类

描述了内部类的语法和语义，以及应用场景

目标：编写一组示例说明内部类的特性
代码：com.zhouyinyan.demo.innerclass

注意点：
1. 非嵌套（static）内部类，在外部类中实例化后，会隐含一个指向外部类对象的引用，能够直接访问外部类的所有成员。因此内部类的创建的前提是需要存在外部类的对象。
2. 嵌套类（static) 内部类，意味着内部类和外部类没有任何关系，嵌套类和普通类没有太大的区别，仅仅只是代码的组织方式而已。


## chapter11 持有类

讲解了java中的能够动态持有类的容器和迭代器

目标：编写一组示例说明容器的特性

注意点：xxx



## chapter12 异常

java中统一的异常报告模型

目标：独自完成示例，并理解java异常模型的精髓

注意点：x



## chapter13 字符串

讲述了字符串相关的操作和知识，以及正则表达式

目标：编写一组示例用以说明字符串的相关特性

注意点：xxx



## chapter14 类型信息

讲述了类型信息的相关细节和反射知识点

目标：编写一组示例说明类型和反射的相关特性

注意点：xxx



## chapter15 泛型

详解了泛型的特性和限制

目标：编写一组程序用以说明泛型特性

注意点：xxx



## chapter16 数组

详解了java中数组的特性

目标：编写一组程序用以说明数组特性

注意点：xxx



## chapter17 深入容器

详解了java容器的使用和特性

目标：编写一组示例说明各种容器的使用和特性

注意点：xxx



## chapter18 JAVA I/O

详解了Java IO细节和特性

目标:编写一组示例说明JAVA IO的使用和特性

注意点：xxx



## chapter19 枚举类型

详解了java枚举类型的使用和特性

目标：编写一组示例程序说明枚举类型的使用

注意点：xxx



## chapter20 注解

详解了java 注解的特性

目标：编写一组示例程序说明注解的使用和特性

注意点：xxx



## chapter21 并发

对java并发做了说明

目标：编写一组程序演示并发的知识点

注意点：xxx



## chapter22 图形化界面

解释了java中图形化界面的的编程方法

目标：简单的编写一组示例演示图形化界面的使用方式

注意点：xxx







