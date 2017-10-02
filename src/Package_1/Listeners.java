package Package_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.Pipeline;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CssFile;
import com.itextpdf.tool.xml.css.StyleAttrCSSResolver;
import com.itextpdf.tool.xml.exceptions.CssResolverException;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, ISuiteListener, IInvokedMethodListener {
    public int X = 0;
    public int l = 0;
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onStart(ISuite suite) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onFinish(ISuite suite) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailure(ITestResult result) {
        ++l;
        System.out.println(l);      
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }
    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onFinish(ITestContext context) {
    	final String HTML = "C:\\Test\\fr\\testng-xslt\\Suite1.html";
        final String CSS = "C:\\Test\\fr\\testng-xslt\\style.css";
        // Creating a simple pie chart with 
        
        
         DefaultPieDataset pieDataset = new DefaultPieDataset();
         pieDataset.setValue("Fallido", new Integer(l));
         pieDataset.setValue("Satisfactorio", new Integer(X));
         pieDataset.setValue("Omitido", new Integer(0));
         JFreeChart piechart = ChartFactory.createPieChart(" ", pieDataset, true, true, false);
         
        //Cambio de colores
         PiePlot plot = (PiePlot) piechart.getPlot();
         plot.setSectionPaint("Satisfactorio", new Color(0,164,149));
         plot.setSectionPaint("Fallido", new Color(164, 0, 0));
         plot.setSectionPaint("Omitido", new Color(0, 66, 112));


         
         try {
            ChartUtilities.saveChartAsJPEG(new File("C:\\Test\\fr\\reporte\\grafica.jpg"), piechart, 525, 390);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
            // step 1
              Document document = new Document();
              // step 2
              PdfWriter writer = null;
            try {
                writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Test\\fr\\reporte\\reportefrenzy.pdf"));
            } catch (FileNotFoundException | DocumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              // step 3
              document.open();
              // Add Image
              Image img = null;
              Image cabecera = null;
            try {
                img = Image.getInstance("C:\\Test\\fr\\reporte\\grafica.jpg");
                cabecera = Image.getInstance("C:\\Test\\fr\\reporte\\img\\cabecera.png");
            } catch (BadElementException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              try {
            	cabecera.setAlignment(Element.ALIGN_CENTER);
              	img.setAlignment(Element.ALIGN_CENTER);
              	document.add(cabecera);
            	document.add(img);
                            } catch (DocumentException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
              // step 4
              
              // CSS
              CSSResolver cssResolver = new StyleAttrCSSResolver();
              CssFile cssFile = null;
			try {
				cssFile = XMLWorkerHelper.getCSS(new FileInputStream(CSS));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              cssResolver.addCss(cssFile);
       
              // HTML
              HtmlPipelineContext htmlContext = new HtmlPipelineContext(null);
              htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
       
              // Pipelines
              PdfWriterPipeline pdf = new PdfWriterPipeline(document, writer);
              HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
              CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);
       
              // XML Worker
              XMLWorker worker = new XMLWorker(css, true);
              XMLParser p = new XMLParser(worker);
              try {
				p.parse(new FileInputStream(HTML));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            //Again
              // CSS
              CSSResolver cssResolver1 = new StyleAttrCSSResolver();
              CssFile cssFile1 = null;
			try {
				cssFile1 = XMLWorkerHelper.getCSS(new FileInputStream(CSS));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              cssResolver1.addCss(cssFile1);
       
              // HTML
              HtmlPipelineContext htmlContext1 = new HtmlPipelineContext(null);
              htmlContext1.setTagFactory(Tags.getHtmlTagProcessorFactory());
       
              // Pipelines
              PdfWriterPipeline pdf1 = new PdfWriterPipeline(document, writer);
              HtmlPipeline html1 = new HtmlPipeline(htmlContext1, pdf1);
              CssResolverPipeline css1 = new CssResolverPipeline(cssResolver1, html1);
       
              // XML Worker
              XMLWorker worker1 = new XMLWorker(css1, true);
              XMLParser p1 = new XMLParser(worker1);
              try {
				p1.parse(new FileInputStream(HTML));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              
              
              //step 5
               document.close();
              System.out.println( "PDF creado correctamente" );
          
        
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ++X;    
        
    }
}