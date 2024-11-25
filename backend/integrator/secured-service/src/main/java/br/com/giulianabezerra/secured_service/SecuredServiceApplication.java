package br.com.giulianabezerra.secured_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SecuredServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredServiceApplication.class, args);
	}

}

@RestController
class ResourceController {
	@GetMapping("resource")
	public String getResource(@AuthenticationPrincipal Jwt jwt) {
		var strBuilder = new StringBuilder();
		strBuilder.append("""
			<!DOCTYPE html>
			<html lang="en">
			<head>
				<meta charset="UTF-8">
				<meta name="viewport" content="width=device-width, initial-scale=1.0">
				<title>Resource Details</title>
				<style>
					body {
						font-family: Arial, sans-serif;
						line-height: 1.6;
						background-color: #f4f4f9;
						color: #333;
						margin: 0;
						padding: 0;
					}
					.container {
						max-width: 800px;
						margin: 50px auto;
						background: #fff;
						padding: 20px;
						border-radius: 10px;
						box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
					}
					h1 {
						color: #5a67d8;
						text-align: center;
					}
					.section {
						margin: 10px 0;
						padding: 10px;
						background: #e2e8f0;
						border-left: 5px solid #5a67d8;
						border-radius: 5px;
						word-wrap: break-word; /* Quebra palavras longas */
						white-space: normal; /* Permite quebras de linha automáticas */
					}
					footer {
						text-align: center;
						margin-top: 20px;
						font-size: 0.9em;
						color: #777;
					}
				</style>
			</head>
			<body>
				<div class="container">
					<h1>Resource Details</h1>
		""");

		strBuilder.append("<div class='section'><strong>JWT Token:</strong><br/>%s</div>".formatted(jwt.getTokenValue()));
		strBuilder.append("<div class='section'><strong>JWT Headers:</strong> %s</div>".formatted(jwt.getHeaders()));
		strBuilder.append("<div class='section'><strong>JWT Claims:</strong> %s</div>".formatted(jwt.getClaims().toString()));
		strBuilder.append("<div class='section'><strong>Resource accessed by:</strong> %s (with subject: %s)</div>"
				.formatted(jwt.getClaim("preferred_username"), jwt.getSubject()));

		strBuilder.append("""
					<footer>
						&copy; 2024 Resource Controller. All rights reserved.
					</footer>
				</div>
			</body>
			</html>
		""");

		return strBuilder.toString();
	}
}
