package com.foronly.template.servlet.servlet;

import com.alibaba.fastjson.JSON;
import com.foronly.template.servlet.util.FOResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author li_cang_long
 * @since 2023/3/22 14:23
 */
public class DemoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print(JSON.toJSON(FOResult.ok()));
	}
}
