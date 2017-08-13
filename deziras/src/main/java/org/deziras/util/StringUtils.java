package org.deziras.util;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Glavo on 17-8-13.
 *
 * @author Glavo
 * @since 0.1.0
 */
public class StringUtils {
	public static String parseString(String s) throws IOException {
		StringReader sr = new StringReader(s.substring(1, s.length() - 1));
		StringBuilder sb = new StringBuilder(s.length());

		while (true) {
			int ci;
			char c;
			if ((ci = sr.read()) == -1) break;

			c = (char) ci;

			switch (c) {
				case '\\':
					if ((ci = sr.read()) == -1)
						throw new RuntimeException("parse failed ");
					c = (char) ci;
					switch (c) {
						case '\\':
							sb.append('\\');
							continue;
						case '\"':
							sb.append('\"');
							continue;
						case '/':
							sb.append('/');
							continue;
						case 'b':
							sb.append('\b');
							continue;
						case 'f':
							sb.append('\f');
							continue;
						case 'n':
							sb.append('\n');
							continue;
						case 'r':
							sb.append('\r');
							continue;
						case 't':
							sb.append('\t');
							continue;
						case 'u':
							String sbb = String.valueOf((char) sr.read()) +
									(char) sr.read() +
									(char) sr.read() +
									(char) sr.read();
							int ii =
									Integer.parseInt(sbb, 16);

							sb.append((char) ii);
							continue;
					}
				default:
					sb.append(c);
			}
		}

		return sb.toString();
	}
}
