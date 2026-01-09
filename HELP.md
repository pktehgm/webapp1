HTML

--------------------------------
JSP

/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp

/say-hello-jsp => SayHelloController - sayHelloJsp method => sayHello

/WEB-INF/jsp/sayHello.jsp

--------------------------------

Login JSP

/login => com.mg.webapp1.login.LoginController => login.jsp

localhost:8080/login

Identifies correct Controller method /login => LoginController.gotoLoginPage

Executes Controller method => Puts data into model => Returns view name => login

Identifies correct View /WEB-INF/jsp/login.jsp

Executes view

--------------------------------

To Do

Request vs Model vs Session

