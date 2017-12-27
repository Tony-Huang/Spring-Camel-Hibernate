package com.hdp.camel.processor;


import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Date;
import java.net.URLDecoder;


/**
 * Created by admin on 2017/2/24.
 */
public class MyBEServlet extends HttpServlet {

    public static int COUNT = 0;

    public MyBEServlet() {
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);

    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.process(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.process(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.process(request, response);
    }

    public static String Param_Name_Delay = "timeDelay";
    public static int BUFFER_SIZE=1024;

    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println();
        System.out.println("=====================Backend servlet==================================");
        String method = request.getMethod();
        String contextPath = request.getContextPath();
        String pathInfo = request.getPathInfo();
        String pathTranslated = request.getPathTranslated();
        String queryString = request.getQueryString();
        String requestUri = request.getRequestURI();
        String requestUrl = request.getRequestURL().toString();
        String servletPath = request.getServletPath();
        String contentType = request.getContentType();
        int contentLength = request.getContentLength();
        Map parameters = request.getParameterMap();

        String timeDelay = request.getParameter(Param_Name_Delay);
        System.out.println("schema=" + request.getScheme());
        System.out.println("method=" + method);
        System.out.println("contextPath=" + contextPath);
        System.out.println("queryString=" + queryString +
                " ; after decoded ,queryString=" + URLDecoder.decode(queryString, "utf-8"));
        System.out.println("parameters=" + parameters);
        System.out.println("contentType=" + contentType);
        System.out.println("contentLength=" + contentLength);
        System.out.println("pathInfo=" + pathInfo);
        System.out.println("pathTranslated=" + pathTranslated);
        System.out.println("requestUri=" + requestUri);
        System.out.println("requestUrl=" + requestUrl);
        System.out.println("servletPath=" + servletPath);
        System.out.println("contentEncoding=" + request.getCharacterEncoding());

        //whether to delay sometime
        if (timeDelay != null && !timeDelay.isEmpty()) {
            int sleep = Integer.parseInt(timeDelay);
            //Thread.currentThread().sleep(sleep);
            System.out.println("...... sleep end " + "......");

        }

        System.out.println("------");


        //read the request body
        StringBuffer body = new StringBuffer();

        byte[] content = new byte[BUFFER_SIZE];
        for (int size; (size=request.getInputStream().read(content)) > 0;) {
            System.out.println("read some body bytes length="+size);
            body.append(new String(content, "utf-8"));
        }

        System.out.println("request body.length = " + body.length() +" ,body="+body);


        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        response.setDateHeader("Date", new Date().getTime());

        long time = new Date().getTime();
        response.getWriter().println(
                " { \"count\" " + ":" + (COUNT++)
                        + "," + " \"date\" " + ":" + time
                        + "}"
        );


        //end
        System.out.println("=====================Backend servlet end!==================================");
        System.out.println();
        //myMethod();
    }

    private void myMethod(HttpServletRequest request) {

        System.out.println( "servletContext="+ this.getServletContext() );
        System.out.println( "servletConfig="+ this.getServletConfig() );
        System.out.println("init params="+this.getServletConfig().getInitParameterNames());
        System.out.println("init params.desc="+this.getServletConfig().getInitParameter("desc"));
        System.out.println("servlet name="+this.getServletConfig().getServletName());
       // this.getLastModified(request);

    }

}
