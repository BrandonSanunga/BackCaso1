package com.grupo3.Caso1.Reports;

import com.grupo3.Caso1.Commons.Utils;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.wickedsource.docxstamper.DocxStamper;
import org.wickedsource.docxstamper.DocxStamperConfiguration;

import java.io.*;
import java.util.Date;

@Getter
@Setter
public class Report<T> {

    private String reportname;
    private String reportOutDocxName;
    private String reportOutPdfName;
    private T context;


    public Report(String reportname, T context) {

        String filenameDate = Utils.formatDateSinHoras(new Date());

        this.reportname = reportname + ".docx";
        this.reportOutDocxName = reportname + "__" + filenameDate + "__out__.docx";
        this.reportOutPdfName = reportname + "__" + filenameDate + ".pdf";
        this.context = context;
    }

    public void generate() {

        DocxStamper stamper = new DocxStamper(new DocxStamperConfiguration());

        try {
            InputStream template = new FileInputStream(this.reportname);
            OutputStream out = new FileOutputStream(this.reportOutDocxName);
            stamper.stamp(template, this.context, out);
            out.close();
            File inputWord = new File(this.reportOutDocxName);
            File outputFile = new File(this.reportOutPdfName);
            InputStream docFile = new FileInputStream(inputWord);
            XWPFDocument doc = new XWPFDocument(docFile);
            PdfOptions pdfOptions = PdfOptions.create();
            OutputStream outPdf = new FileOutputStream(outputFile);
            PdfConverter.getInstance().convert(doc, outPdf, pdfOptions);
            outPdf.close();
            doc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
