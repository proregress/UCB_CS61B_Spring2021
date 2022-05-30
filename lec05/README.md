#### Notes
|    | notes |
| -- | -- |
| Introducing the SLLists | What we did in last lecture is "naked" linked lists which are hard to use |
| <b>Access Control<b> and Nested Classes | <b>1.private keyword prevents other classes from using members og this class. <br>2.<b>static<b> classes cannot access outer class's instance variables or method.<br>3.A minor savings of memory.See book for more details|
| addList and size | <b>Using a new approach - helper method - to return SLList.size(),since SLList data structure is not recursive itself |
| Caching | 1.Getting size using recursion/iteration is toooo slow, so we use a private staitc varaible size to store the size<br>2.SLList is a great middle man<br> <img width="810" alt="截屏2022-05-30 下午12 29 19" src="https://user-images.githubusercontent.com/37496223/170917754-bc0cdfae-0112-4e49-8caa-1c3f1d8fd194.png"> |
| The Empty List | Fixed the addLast() bug of nullpointer error in a ugly way |
| Sentinel Nodes | <b>How to write clean and simple and good codes<b> Special cases are not 'simple' <br>Sentinel Node哨兵节点<br> <img width="792" alt="截屏2022-05-30 下午12 37 26" src="https://user-images.githubusercontent.com/37496223/170918289-9ea87d23-5369-4e46-bd44-43a3119a2fb5.png">
 |
| Invariants | An invariant is a condition that is guaranteed to be true during code execution |
  
  

