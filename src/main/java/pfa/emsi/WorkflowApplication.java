package pfa.emsi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import pfa.emsi.dao.AdminRepository;
import pfa.emsi.model.Admin;

@SpringBootApplication
public class WorkflowApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(WorkflowApplication.class, args);
		AdminRepository adminRepository = ctx.getBean(AdminRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		adminRepository.save(new Admin("adresse", df.parse("2018-12-20"), "email", "login", "nom", "numTel", "password", "prenom"));
	}

}

