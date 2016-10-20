package com.test.service.nio;

import com.generallycloud.nio.codec.base.future.BaseReadFuture;
import com.generallycloud.nio.component.Session;
import com.generallycloud.nio.extend.FileReceiveUtil;
import com.generallycloud.nio.extend.service.NIOFutureAcceptorService;

public class TestUploadServlet extends NIOFutureAcceptorService {

	public static final String	SERVICE_NAME		= TestUploadServlet.class.getSimpleName();

	private FileReceiveUtil		fileReceiveUtil	= new FileReceiveUtil("upload-");

	protected void doAccept(Session session, BaseReadFuture future) throws Exception {

		fileReceiveUtil.accept(session, future, true);
	}
}
