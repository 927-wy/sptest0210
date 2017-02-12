# sptest0210
refer to
##http://blog.csdn.net/seven_cm/article/details/23624577

用maven管理建立一个spring MVC项目。

和文中不同的是：总是报错：

`
严重: Exception sending context initialized event to listener instance of class org.springframework.web.context.ContextLoaderListener
org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from ServletContext resource [/WEB-INF/classes/applicationContext.xml]; nested exception is java.io.FileNotFoundException: Could not open ServletContext resource [/WEB-INF/classes/applicationContext.xml]
`
所以我在web.xml里面加入了


`
 <context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/ContextLoaderListener.xml</param-value>
 </context-param>
`


解决了那个错误。
已经可以访问，接下来，把控制器代码写写就行了。

test from website
