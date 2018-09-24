package com.ianRJ.ianMCmod;


public class MahtaranException extends Exception {
	private static final long serialVersionUID = 1L;

	public MahtaranException() {
		super();
	}

	public MahtaranException(final String message) {
		super(message);
	}

	public MahtaranException(final String message, final Throwable thrown) {
		super(message, thrown);
	}

	public MahtaranException(final Throwable thrown) {
		super(thrown);
	}
}