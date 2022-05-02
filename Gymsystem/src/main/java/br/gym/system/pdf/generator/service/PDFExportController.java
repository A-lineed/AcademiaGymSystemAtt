package br.gym.system.pdf.generator.service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lowagie.text.DocumentException;

import br.gym.system.domain.Aluno;

@Controller
public class PDFExportController {
	
	 @Autowired
     private AlunoServices service;
	 

    @GetMapping("/pdf/generate")
    public void generatePDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
        
        List<Aluno> listAlunos = service.listAll();
        
        AlunoPDFExporter exporter = new AlunoPDFExporter(listAlunos);
        exporter.export(response);
        

        
             
    }
}
