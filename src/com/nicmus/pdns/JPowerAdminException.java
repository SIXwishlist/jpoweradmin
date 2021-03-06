/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 * 
 * Control panel for PowerDNS (http://powerdns.com)
 * Copyright (C) 2010 nicmus inc.
 * Jivko Sabev (jivko.sabev@gmail.com) jsabev@nicmus.com
 * 
 * @author jsabev 
 */
package com.nicmus.pdns;

/**
 * Runtime exceptions thrown from JPowerAdmin
 * @author jsabev
 *
 */
public  class JPowerAdminException extends RuntimeException {
	private static final long serialVersionUID = 3398515203191289203L;

	/**
	 * 
	 */
	public JPowerAdminException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public JPowerAdminException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public JPowerAdminException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public JPowerAdminException(Throwable cause) {
		super(cause);
	}
	
	

}
