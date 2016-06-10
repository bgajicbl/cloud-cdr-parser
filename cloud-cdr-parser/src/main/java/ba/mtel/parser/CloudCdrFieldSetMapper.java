package ba.mtel.parser;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class CloudCdrFieldSetMapper implements FieldSetMapper<CloudCdr> {

	@Override
	public CloudCdr mapFieldSet(FieldSet fieldSet) throws BindException {
		CloudCdr cdr = new CloudCdr();
		cdr.setCloud(fieldSet.readString(3));
		cdr.setService(fieldSet.readString(4));
		cdr.setAmount(fieldSet.readDouble(5));
		cdr.setDate(new java.sql.Date(1));
		//cdr.setService(service);(new LocalDate(fieldSet.readDate(1,"dd/MM/yyyy")));
		//cdr.setPercentage(fieldSet.readDouble(2));
        return cdr;
	}

}
