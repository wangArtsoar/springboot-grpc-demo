# java-grpc-demo

1. 编写 .proto 文件
2. 在greeting-common目录下使用 ```mvn clean install``` or```mvn compile```生成代码
3. 编写greeting-service server代码，需要 grpc-client-spring-boot-starter 包
4. 编写greeting-client client-server代码，需要 grpc-server-spring-boot-starter 包
5. 启动server和client程序，调用 http://localhost:8080/api/get 查看效果