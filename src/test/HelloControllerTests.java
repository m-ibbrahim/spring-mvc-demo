package test;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;
import springapp.web.HelloController;

public class HelloControllerTests extends TestCase
{
  public void testHandleRequestView() throws Exception
  {
    HelloController controller = new HelloController();
    ModelAndView modelAndView = controller.handleRequest(null, null);
    assertEquals("hello.jsp", modelAndView.getViewName());
  }
}
