package com.certificate.learning.digitalCertificate.util;

public interface EmailUtil {

    void sendEmailWithAttachment(String toAddress, String subject , String body, String attachment);
    void sendEmail(String toAddress, String subject , String body);
	 //public void sendMail(String toEmail, String subject,String body,String attachment);

}
