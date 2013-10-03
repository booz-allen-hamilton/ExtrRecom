package com.bah.extrrecom.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>ExtrrecomingService</code>.
 */
public interface ExtrRecomServiceAsync {
	void extrrecomServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
