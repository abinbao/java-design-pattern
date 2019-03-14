### 策略模式

- 对应解决某个问题的一个算法族，允许用户从算法族中任意选一个算法解决某一问题，方便更改和添加新的算法。

- 本质：分离算法，选择实现

- 开发中常见的场景：
	1. JavaSe 中 GUI 编程，布局管理
	2. Spring 框架中， Resource 接口，资源访问策略
	3. javax.servlet.http.HttpServlet#service()