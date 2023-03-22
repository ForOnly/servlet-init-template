package com.foronly.template.servlet.filter;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author li_cang_long
 * @since 2023/3/22 14:34
 */
@Slf4j
public class DemoFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		log.info("======" + ((HttpServletRequest) request).getRequestURI() + "======");
		chain.doFilter(request, response);
	}

	public void destroy() {

	}
}
