package lt.kvk.i17.chursin_jevgenij.servlet;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebAppInitializer implements WebApplicationInitializer {
	 
    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext ctx
          = new AnnotationConfigWebApplicationContext();
        ctx.register(WebMvcConfigure.class);
        ctx.setServletContext(container);

        ServletRegistration.Dynamic servlet = container.addServlet(
          "dispatcherExample", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
     }
}
