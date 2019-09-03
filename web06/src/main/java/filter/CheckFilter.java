package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @auther plg
 * @date 2019/9/3 10:19
 */
public class CheckFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        String username = (String) session.getAttribute("username");
        if(username != null){
            System.out.println(username);
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            servletRequest.setAttribute("tip","请先登录");
            servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}
