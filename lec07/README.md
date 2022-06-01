|    | notes |
| -- | -- |
| removeLast | Which memory boxes need to change?size\items\items[i]?<br> Actually, <b>it's only "size" need to change<b>, from a invariant perspective |
| Generic ALists |<b> 1.在Java中创建泛型的语法：(E[])new Object[100]</b><br>Java不允许创建泛型对象的数组，只能 (E[])new Object[100],这会产生一个compiler warning编译错误，which should be ignored.<br>如果写new E[100],会产生泛型数组创建错误<br><br>2.<b>关于loitering:</b><br>在泛型数组中，removeLast()必须将item[size-1]设置为null，而在整型数组中是不用的.<br>原因是若不设置为null，对该对象的引用就一直存放在数组中，就会产生<b>loitering</b>，即最后一项一直在内存里某个位置保留着，手动设置为null后，则很快会被垃圾回收机制回收|
