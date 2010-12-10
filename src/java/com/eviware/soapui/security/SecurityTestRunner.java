/*
 *  soapUI, copyright (C) 2004-2010 eviware.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package com.eviware.soapui.security;

import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner;

/**
 * SecurityTestRunner
 * 
 * @author soapUI team
 */
public interface SecurityTestRunner extends TestRunner
{
	public SecurityTest getSecurityTest();

//Removed the rest cause I don't think we need them, since SecurityTestRunnerImpl extends WsdlTestCaseRunner
	/**
	 * Returns the progress of the securitytest as a value between 0 and 1.
	 * Progress is measured depending on the LoadTest limit configuration
	 */

//	public float getProgress();

	/**
	 * Confusing but unfortunately necessary; isStopped will return false until
	 * the securitytest has called all handlers, etc.. the status will be set to
	 * FINISHED before that.
	 * 
	 * @return
	 */

//	public boolean hasStopped();

}
