/**
 * 命令模式.
 */
/**
 * @author yunhai
 *
 */
package CommandPattern;

/*
 * 【命令模式】是一个【高内聚】的模式，其定义为：
 * 
 * Encapsulate a request as an object,thereby letting you parameterize clients with different requests,queue or log requests,and support undoable operations.
 * 
 * （将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能。）
 * 
 * 方法M 欲完成某种行为,但行为只有具体执行时才能确定执行行为A还是B。
 * 
 * 比如对一个数组进行操作，但不确定操作是遍历输出还是求和异或其他。
 * 
 * Command接口定义一个方法，封装具体行为，需执行的所有命令都在这里声明。命令角色是命令模式的核心。
 * 
 * Receiver接收者：Receiver的2个实现类。在实际应用中一般都会被封装掉（除非非常必要， 例如撤销处理）。
 * 
 * Invoker调用者：接受命令，并执行命令。
 * 
 * 把请求方 （Invoker）和执行方（Receiver）分开了，扩展性也有很好的保障，通用代码比较简单。
 * 
 * 命令模式的优点
 * 
 * ● 类间解耦
 * 
 * 调用者角色与接收者角色之间没有任何依赖关系，调用者实现功能时只需调用Command 抽象类的execute方法就可以，不需要了解到底是哪个接收者执行。
 * 
 * ● 可扩展性
 * 
 * Command的子类可以非常容易地扩展，而调用者Invoker和高层次的模块Client不产生严 重的代码耦合。
 * 
 * ● 命令模式结合其他模式会更优秀
 * 
 * 命令模式可以结合责任链模式，实现命令族解析任务；结合模板方法模式，则可以减少 Command子类的膨胀问题。
 * 
 * 命令模式也是有缺点的，请看Command的子类：如果有N个命令，问题就出来 了，Command的子类就可不是几个，而是N个。
 * 
 * 当有多各命令时，我们可以定义一个Command[]数组，存放不同的命令。
 */