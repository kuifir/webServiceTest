# webservice-Test
some code to learn wervice

### 1.生成代码的命令
cxf: wsdl2java -p aaa  http://localhost:9999/service?wsdl    
原生：wsimport -s ./  -p bbb -d ccc   http://localhost:9999/s的ervice?wsdl

### 2.标签含义
- types: 定义数据类型使用
- message:使用types定义的类型，来定义整个消息的数据结构 part(组成): 指定引用types中的标签片段 message个数是接口的俩倍，一个接口对应一个请求和一个响应消息
- portType: 用来定义服务器端的SEI(接口) 即：service层的接口名 
  operation: 用来指定SEI中的处理请求的方法 
  input：指定客户端传过来的数据(参数),引用message标签中的内容 
  output：指定服务器端返回给客户端的数据，引用message标签中的内容
- binding: 用于定义SEI的实现类 type：中tns引用portType标签，来找到他自己实现类的接口 
  operation：具体实现类中方法的操作 
  body：它请求和返回来的消息，会以文本(literal)的形式展现 绑定的数据是一个document(xml)
  input：指定客户端传过来的数据(参数)
  output：指定服务器端返回给客户端的数据
- service: 服务器端的一个webService容器,(亦或者为一个工厂) ，来发布web服务 
  name: 用来指定客户端容器类(客户端的类从这里开始) 
  port：用来指定一个服务器端处理请求的入口(SEI的实现类)
  address：当前webService的请求地址 