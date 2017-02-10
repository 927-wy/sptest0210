# sptest0210
refer to
##http://blog.csdn.net/seven_cm/article/details/23624577

用maven管理建立一个spring MVC项目。

和文中不同的是：我注释掉了listener，因为总是报错：
严重: Exception sending context initialized event to listener instance of class org.springframework.web.context.ContextLoaderListener
org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from ServletContext resource [/WEB-INF/classes/applicationContext.xml]; nested exception is java.io.FileNotFoundException: Could not open ServletContext resource [/WEB-INF/classes/applicationContext.xml]
