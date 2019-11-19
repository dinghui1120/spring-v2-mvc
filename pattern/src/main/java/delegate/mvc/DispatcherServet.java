package delegate.mvc;

import delegate.mvc.controllers.MemberController;
import delegate.mvc.controllers.OrderController;
import delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 相当于是项目经理的角色
 * request.getContextPath()得到项目名  /pattern
 * request.getRequestURL() 返回全路径（包含域名/ip和端口号等） http://localhost:8083/pattern/getMemberById
 * request.getRequestURI() 得到的路径不包含域名/ip和端口号等   /pattern/getMemberById
 * request.getServletPath() 得到的是不包含项目名 之前的访问路径  /getMemberById
 */
public class DispatcherServet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            doDispatch(req, resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doDispatch(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String contextPath = request.getContextPath();
        String uri = request.getRequestURI().replace(contextPath, "").replace("/","");
        String mid = request.getParameter("mid");
        if("getMemberById".equals(uri)){
            new MemberController().getMemberById(mid);
        }else if("getOrderById".equals(uri)){
            new OrderController().getOrderById(mid);
        }else if("logout".equals(uri)){
            new SystemController().logout();
        }else {
            response.getWriter().write("404 Not Found!!");
        }
    }
}
