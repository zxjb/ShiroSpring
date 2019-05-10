# ShiroSpring

根据spring的配置文件中对shiro的url拦截配置，我们首先请求：http://localhost:8080/ShiroSpring/user/admin.do 来测试身份认证，
然后会跳转到登录页面让我们登陆，登陆成功后，再次请求这个url就会进入success.jsp页面了。 
再测试角色和权限认证，可以先后输入http://localhost:8080/ShiroSpring/user/student.do
来测试角色认证，
输入http://localhost:8080/ShiroSpring/user/teacher.do来测试权限认证。
通过登陆不同的用户去测试即可。
