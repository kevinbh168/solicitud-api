package pe.edu.tecsup.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.tecsup.models.ResponseMessage;
import pe.edu.tecsup.models.Solicitud;
import pe.edu.tecsup.services.SolicitudService;

@RestController
public class SolicitudController {
	
private static final Logger logger = LoggerFactory.getLogger(SolicitudController.class);

	
	@Autowired
	private SolicitudService solicitudService;
	
	@GetMapping("/solicitudes")
	public List<Solicitud> solicitudes() {
		logger.info("call productos");
		
		List<Solicitud> solicitudes = solicitudService.listar();
		
		return solicitudes;
	}
	@PostMapping("/solicitudes")	// https://spring.io/guides/gs/uploading-files/
	public ResponseMessage crear(@RequestBody Solicitud solicitud) {
	//	logger.info("call crear(" + email + ", " + tipo+ ", " + motico+ ")");
		
		solicitudService.crear(solicitud);
		
		return ResponseMessage.success("Registro completo");
	}


}
