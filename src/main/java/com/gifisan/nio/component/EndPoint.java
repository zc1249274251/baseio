package com.gifisan.nio.component;

import java.io.Closeable;
import java.io.IOException;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.List;

import com.gifisan.nio.Attachment;
import com.gifisan.nio.client.IOWriteFuture;
import com.gifisan.nio.server.NIOContext;
import com.gifisan.nio.server.session.Session;

public interface EndPoint extends Closeable {

	public abstract void endConnect();

	public abstract boolean canWrite(byte sessionID);

	public abstract void setWriting(byte sessionID);

	public abstract String getLocalAddr();

	public abstract String getLocalHost();

	public abstract int getLocalPort();

	public abstract int getMaxIdleTime() throws SocketException;

	public abstract String getRemoteAddr();

	public abstract String getRemoteHost();

	public abstract int getRemotePort();

	public abstract boolean isBlocking();

	public abstract boolean isOpened();

	public abstract int sessionSize();

	public abstract int read(ByteBuffer buffer) throws IOException;
	
	public abstract ByteBuffer read(int limit) throws IOException;

	public abstract int write(ByteBuffer buffer) throws IOException;

	public abstract boolean isEndConnect();

	public abstract boolean isNetworkWeak();
	
	public abstract void attackNetwork(int length);
	
	public abstract List<IOWriteFuture> getWriter() ;

	public abstract void addWriter(IOWriteFuture writer) ;
	
	public abstract void interestWrite() ;
	
	public abstract NIOContext getContext();
	
	public abstract void attach(Attachment attachment);

	public abstract Attachment attachment();

	public abstract Session getSession(byte sessionID);

	public abstract IOReadFuture getReadFuture();
	
	public abstract void setReadFuture(IOReadFuture future);

}