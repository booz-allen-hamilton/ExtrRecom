package com.bah.extrrecom.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("extrrecom")
public interface ExtrRecomService extends RemoteService {
	String extrrecomServer(String name) throws IllegalArgumentException;
}
