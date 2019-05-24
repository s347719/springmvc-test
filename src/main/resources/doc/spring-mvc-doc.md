#IOC 容器启动
> web.xml  org.springframework.web.context.ContextLoaderListener
  contextInitialized()
  initWebApplicationContext() 初始化WEB上下文
  configureAndRefreshWebApplicationContext() IOC过程

#请求调用过程
> HttpServletBean extends HttpServlet  
  重写了 init()等方法  进行了初始化操作

> FrameworkServlet extends HttpServletBean
  重写 doPost,doPut,doDelete,doOptions,doTrace等方法
  processRequest(request, response);
  doService(request, response);
  
> DispatcherServlet extends FrameworkServlet
  doService(request, response);
  doDispatch(request, response);
  ha.handle(processedRequest, response, mappedHandler.getHandler());
  
> AbstractHandlerMethodAdapter
  handle
  handleInternal(request, response, (HandlerMethod) handler);
> RequestMappingHandlerAdapter
  handleInternal
  invokeHandlerMethod
  构造 ServletWebRequest  ModelAndViewContainer 调用
  invocableMethod.invokeAndHandle(webRequest, mavContainer);