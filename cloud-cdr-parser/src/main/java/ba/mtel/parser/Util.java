package ba.mtel.parser;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Util {

	public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
	private static final Log logger = LogFactory.getLog(Util.class);


	public static Date parseDate(String fileName) {
		String dateStr = null;
		Date sqlDate = new Date(System.currentTimeMillis());
		java.util.Date utilDate = new java.util.Date(System.currentTimeMillis());

		if (fileName != null && fileName.length() >= 12) {
			dateStr = fileName.substring(0, fileName.lastIndexOf("."));
			dateStr = dateStr.substring(dateStr.length() - 8);

			try {
				utilDate = DATE_FORMAT.parse(dateStr);
				sqlDate = new Date(utilDate.getTime());
			} catch (ParseException e) {
				logger.warn("Error in parsing date from filename!");
			}

		}
		return sqlDate;
	}
	public static String shortenService(String service) {
        String sub = service.replaceAll(" ", "");
        if (sub.length() > 127) {
            sub = sub.substring(0, 126);
        }
        if (sub.contains("SLA:")) {
            int i = sub.indexOf("SLA:");
            String prijeSla = sub.substring(0, i);
            String sla = sub.substring(i);
            if (sla.contains(";")) {
                sla = sla.substring(0, sla.indexOf(";"));
            }
            sub = prijeSla + sla;
        }
        return sub;
    }
}
