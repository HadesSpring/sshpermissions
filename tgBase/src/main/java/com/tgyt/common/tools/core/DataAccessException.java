/**   
 * @Title: DataAccessException.java 
 * @Package com.tgyt.common.tools.core 
 * @Description: 
 * @author zhangfeng 13940488705@163.com 
 * @date 2011-8-9 上午11:00:31 
 * @version V1.0   
 */

package com.tgyt.common.tools.core;

/**
 * @ClassName: DataAccessException
 * @Description: 数据访问异常
 * @author zhangfeng 13940488705@163.com
 * @date 2011-8-9 上午11:00:31
 * 
 */
public class DataAccessException extends TgException {
	private static final long serialVersionUID = 1L;

	public DataAccessException() {
		super();
	}

	public DataAccessException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DataAccessException(String arg0) {
		super(arg0);
	}

	public DataAccessException(Throwable arg0) {
		super(arg0);
	}
}
