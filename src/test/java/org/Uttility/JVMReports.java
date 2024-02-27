package org.Uttility;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports extends Baseclass {
	public static void generateJVMReports(String json) {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\reports\\JVMReports");
		Configuration con = new Configuration(loc, "IHC");
		List<String> jsonFiles = new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r = new ReportBuilder(jsonFiles, con);
		r.generateReports();

	}

}
