package ru.obolensk.afff.wagner.jwac.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppCfg {

	private static String programName;
	private static String programVersion;

	static {
		Properties props = new Properties();
		InputStream inStream = AppCfg.class.getResourceAsStream("/app.cfg");
		try {
			props.load(inStream);
			programName = props.getProperty("name");
			programVersion = props.getProperty("version");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getProgramName() {
		return programName;
	}

	public static String getProgramVersion() {
		return programVersion;
	}
}
