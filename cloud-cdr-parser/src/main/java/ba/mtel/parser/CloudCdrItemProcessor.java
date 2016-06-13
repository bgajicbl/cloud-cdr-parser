package ba.mtel.parser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeProcess;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component("cloudCdrItemProcessor")
public class CloudCdrItemProcessor implements ItemProcessor<CloudCdr, CloudCdr> {

	public static String fileName;
	private String dateStr;
	private Date fileDate;
	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	
	

	/*public void setFileName(String fName) {
		System.out.println("dosao u setFileName: " + fName);
		this.fileName = fName;
	}

	public String getFileName() {
		return fileName;
	}*/
	
	

	@Override
	public CloudCdr process(CloudCdr cdr) throws Exception {

		System.out.println("Processing result :" + cdr.getDate());

		// skracivanje duzine ako servis ima preko 127 karaktera
		if (cdr.getService().length() > 127) {
			/*String sub = cdr.getService().replaceAll(" ", "");
			if (sub.length() > 127)
				sub = sub.substring(0, 126);*/

			cdr.setService(Util.shortenService(cdr.getService()));
		}
		// parsiranje datuma iz imena fajla

		/*if (fileName != null && fileName.length() >= 12) {
			dateStr = fileName.substring(0, fileName.lastIndexOf("."));
			dateStr = dateStr.substring(dateStr.length() - 8);

			fileDate = format.parse(dateStr);
			java.sql.Date sqlDate = new java.sql.Date(fileDate.getTime());

			cdr.setDate(sqlDate);
		}*/
		// System.out.println(dateStr);
		return cdr;
	}

}