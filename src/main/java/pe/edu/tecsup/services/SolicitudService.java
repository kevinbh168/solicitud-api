package pe.edu.tecsup.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.models.Solicitud;
import pe.edu.tecsup.repositories.SolicitudRepository;


@Service
public class SolicitudService {
	
	@Autowired
	private SolicitudRepository solicitudRepository;
	
	public List<Solicitud> listar(){
		return solicitudRepository.listar();
	}
	
	public void crear(Solicitud solicitud) {
		solicitudRepository.crear(solicitud);
	}

	

}
