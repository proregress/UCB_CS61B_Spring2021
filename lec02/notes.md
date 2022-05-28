|  | notes |
| -- | -- |
| Compilation | 在终端中，使用javac-编译器Compiler将.java文件编译为.class文件，再用java执行.class文件 |
| Defining and Instantiating Class - 1| 类的定义与实例化，所有代码都必须写在类中，需要主方法main函数才能运行代码 |
| Defining and Instantiating Class - 2| 关于类的构造；<b>非静态方法/变量无法从静态内容中引用Non-static method/variable can not be referenced from a static context<b> |
| Terminology | Instance Variable实例变量 <br>Constructor构造器<br>Non-static method a.k.a. Instance Method非静态方法，实例方法（如果类的实例要调用这个方法，那么这个方法就不能是静态的）<br>Declaration声明 <br>Instantiation实例化<br>Assignment赋值<br>Invocation调用|
| Arrays of Objects | 创建实例数组时new的用法，第一个new创建一个数组，但还没有实例化任何小狗，像是创建了一个狗屋，再使用new创建小狗 |
| <b>Static vs Instance Methods<b> | <b>静态方法用类名来引用，实例方法（即非静态方法）用实例对象引用<b><br><b>静态方法无法直接调用实例变量，必须通过实例对象来获取实例变量<b><br><b>一个类中可以同时有静态和非静态成员（成员指方法或变量）<b> |
| Managing Complexity，LargerThanFourNeighbors | <b>Managing complexity<b> with classes and static methods |
| LargerThanFourNeighbors With no Helper Methods| normally this is how I do my coding: amending it little by little, coding while fixing，end up to be quite clumsy |
| LargerThanFourNeighbors With <b>Helper Methods<b>| 辅助函数，important and helpful to locate my errors, easier to make big complicate problems into smaller pieces |








