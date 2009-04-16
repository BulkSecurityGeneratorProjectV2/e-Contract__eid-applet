/*
 * eID Applet Project.
 * Copyright (C) 2009 FedICT.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.fedict.eid.applet.service;

import java.io.Serializable;
import java.security.cert.X509Certificate;

public class EIdCertsData implements Serializable {

	private static final long serialVersionUID = 1L;

	public X509Certificate authn;

	public X509Certificate sign;

	public X509Certificate ca;

	public X509Certificate root;

	public X509Certificate getAuthn() {
		return this.authn;
	}

	public X509Certificate getSign() {
		return this.sign;
	}

	public X509Certificate getCa() {
		return this.ca;
	}

	public X509Certificate getRoot() {
		return this.root;
	}
}