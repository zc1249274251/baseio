package com.generallycloud.nio.component.protocol;

import java.io.IOException;

import com.generallycloud.nio.component.SocketChannel;

public interface ProtocolDecoder {

	public abstract IOReadFuture decode(SocketChannel channel) throws IOException;

}