package com.generallycloud.nio.extend.plugin.jms.server;

import com.generallycloud.nio.codec.base.future.BaseReadFuture;
import com.generallycloud.nio.component.Session;
import com.generallycloud.nio.extend.service.NIOFutureAcceptorService;

public abstract class MQServlet extends NIOFutureAcceptorService {

	private MQContext	context	= MQContext.getInstance();

	public MQContext getMQContext() {
		return context;
	}

	public void doAccept(Session session, BaseReadFuture future) throws Exception {

		MQSessionAttachment attachment = context.getSessionAttachment(session);

		this.doAccept(session, future, attachment);
	}

	public abstract void doAccept(Session session, BaseReadFuture future, MQSessionAttachment attachment)
			throws Exception;

}
