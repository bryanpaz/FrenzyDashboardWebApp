package FrenzyDashboard;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class SentMail {
	public static void mandarCorreo() {
		  // El correo gmail de envío
		  String correoEnvia = "correo@bryanpaz.com";
		  String claveCorreo = "Bryan05112012";
		  // La configuración para enviar correo
		  Properties properties = new Properties();
		  properties.put("mail.smtp.host", "mail.bryanpaz.com");
		  properties.put("mail.smtp.port", "587");
		  properties.put("mail.smtp.starttls.enable", "true");
		  properties.put("mail.smtp.auth", "true");
		  properties.put("mail.user", correoEnvia);
		  properties.put("mail.password", claveCorreo);
		  // Obtener la sesion
		  Session session = Session.getInstance(properties, null);
		  int aviso = 0;
		  try {
		   // Crear el cuerpo del mensaje
		   MimeMessage mimeMessage = new MimeMessage(session);
		   // Agregar quien envía el correo
		   mimeMessage.setFrom(new InternetAddress(correoEnvia, "BryanPaz"));
		   // Los destinatarios
		   InternetAddress[] internetAddresses = {new InternetAddress("ibryanpaz@gmail.com")};
//		     new InternetAddress("correo2@gmail.com"),
//		     new InternetAddress("correo3@gmail.com") };
		   // Agregar los destinatarios al mensaje
		   mimeMessage.setRecipients(Message.RecipientType.TO,
		     internetAddresses);
		   // Agregar el asunto al correo
		   mimeMessage.setSubject("ADJUNTO IMAGEN");
		   // Creo la parte del mensaje
		   MimeBodyPart mimeBodyPart = new MimeBodyPart();
		   mimeBodyPart.setText("Reporte de testing en Frenzy Dashboard - Landing Page");
		   MimeBodyPart mimeBodyPartAdjunto = new MimeBodyPart();
		   mimeBodyPartAdjunto.attachFile("C:/test.jpg");
			// Crear el multipart para agregar la parte del mensaje anterior
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(mimeBodyPart);
			multipart.addBodyPart(mimeBodyPartAdjunto);
		   // Agregar el multipart al cuerpo del mensaje
		   mimeMessage.setContent(multipart);		 
		   // Enviar el mensaje
		   Transport transport = session.getTransport("smtp");
		   transport.connect(correoEnvia, claveCorreo);
		   transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
		   transport.close();
		  } catch (Exception ex) {
		   ex.printStackTrace();
		   JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
		   aviso = 1;
		  }
		  if (aviso==0) {
			  JOptionPane.showMessageDialog(null, "¡Correo electrónico enviado exitosamente!");
		  }
		 }
	public static void main(String[] args) {
		SentMail.mandarCorreo();
	}
}