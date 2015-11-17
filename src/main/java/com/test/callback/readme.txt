一句话，回调是一种双向调用模式，什么意思呢，就是说，被调用方在被调用时也会调用对方，
这就叫回调。“If you call me, i will call back”。 
不理解？没关系，先看看这个可以说比较经典的使用回调的方式： 
class A实现接口InA ——背景1
class A中包含一个class B的引用b ——背景2
class B有一个参数为InA的方法test(InA a) ——背景3
A的对象a调用B的方法传入自己，test(a) ——这一步相当于you call me
然后b就可以在test方法中调用InA的方法 ——这一步相当于i call you back