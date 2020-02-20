<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        echo "a";
		$nome = $_POST['nome'];
		$email = $_POST['email'];
		$mensagem = $_POST['mensagem'];
		
        require 'vendor/autoload.php';

        $from = new SendGrid\Email(null, "cascadecobra@gmail.com");
        $subject = "Mensagem de contato";
        $to = new SendGrid\Email(null, "ravel.gou@gmail.com");
        $content = new SendGrid\Content("text/html", "Olá Cesar, <br><br>Nova mensagem de contato<br><br>Nome: $nome<br>Email: $email <br>Mensagem: $mensagem");
        $mail = new SendGrid\Mail($from, $subject, $to, $content);
        
        //Necessário inserir a chave
        $apiKey = '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';
        $sg = new \SendGrid($apiKey);

        $response = $sg->client->mail()->send()->post($mail);
        header('Location: index.php');
		
        ?>
    </body>
</html>
