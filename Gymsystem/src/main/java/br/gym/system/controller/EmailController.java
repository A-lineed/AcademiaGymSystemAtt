package br.gym.system.controller;

import org.springframework.web.bind.annotation.RestController;

//@RestController
public class EmailController {

//    @Autowired private JavaMailSender mailSender;
// 
//    @RequestMapping(path = "/email-send", method = RequestMethod.GET)
//    public String sendMail() {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setText("Recuperação de senha academia GymSystem");
//        message.setTo("gymsystem2021@gmail.com");
//        message.setFrom("aline.edvania.franca@gmail.com");
//
//        try {
//        	MimeMessage mail = mailSender.createMimeMessage();
//
//            MimeMessageHelper helper = new MimeMessageHelper( mail );
//            helper.setTo( "aline.edvania.franca@gmail.com" );
//            helper.setSubject( "Recuperação de senha academia GymSystem" );
//            helper.setText("<p>Você solicitou a recuperação de senha para a conta da academia GymSystem, clique no link abaixo para redefinir sua senha", true);
//            mailSender.send(mail);
//
//            return "E-mail enviado com sucesso";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Erro ao enviar e-mail";
//        }
//    }
}