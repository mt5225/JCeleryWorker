package org.loadui.jcelery;

import org.loadui.jcelery.internal.CeleryService;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author renato
 */
public interface Task
{

	void complete( Status status ) throws IOException;

	void complete( Status status, Object response ) throws IOException;

	String getTask();

	String getId();

	List getArgs();

	Map<Object, Object> getKwargs();

	int getRetries();

	Date getEta();

	Date getExpires();

	CeleryService getService();

}
