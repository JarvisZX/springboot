package cn.lqdev.learning.springcloud.zuul;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomPreFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		//返回false 不执行
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// 具体过滤器逻辑
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		StringBuffer url = request.getRequestURL();
		System.out.println(url);
		log.info("自定义过滤器");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// 执行顺序 越小 优先级越高
		return 1;
	}

}
