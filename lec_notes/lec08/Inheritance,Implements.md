|                                                | notes                                                        |
| ---------------------------------------------- | ------------------------------------------------------------ |
| The Desire for Generality                      | Overloading重载:multiple methods with same name, but different parameters. |
| Hypernyms and Hyponyms                         | 上位词与下位词 [Wordnet Project](https://wordnet.princeton.edu/) |
| Overriding vs Overloading                      | 1.覆盖Overriding：只适用于继承关系，并且要求完全相同的方法签名（即方法名和参数都完全一致），并且最好加上Override注释，不加注释也可以覆盖<br>2.重载Overloading：不一定要求继承关系，只要是名字相同但签名不同的方法就是overloading |
| Interface Inheritance                          | 接口继承：<br>1.子类必须覆盖父类所有的方法，否则将无法编译<br>2.子类只继承签名，父类中的方法没有实际实现的代码 |
| Implementation Inheritance and Default Methods | 实现继承：<br>子类继承签名和实现代码，这种情况需要在父类方法的前面加default关键字 |
| Dynamic Method Selection                       | 编译时类型X和运行时类型Y<br />所谓动态方法选择，就是如果Y重写/覆盖了（overrides）方法，那么Y中的方法便被调用 |
| A Dynamic Method Selection Puzzle              | My answer:<br/>a.greet(d) -- hello animal<br/>a.sniff(d) --dog sniff animal<br/>d.praise(d)--u r cool dog<br/>***a.praise(d)--u r cool dog*** |
| Dynamic Method Selection as A Two-Step Process | ***<font color='red'>a.praise(d)--u r cool animal</font>***<br/>***复习父类引用指向子类对象*** |
| Conclusion Is a vs Has a                       |                                                              |
