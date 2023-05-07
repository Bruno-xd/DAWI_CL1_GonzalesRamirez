package pe.edu.cibertec.DAWI_CL1_GONZALESRAMIREZ.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.DAWI_CL1_GONZALESRAMIREZ.Model.Especialidad;
import pe.edu.cibertec.DAWI_CL1_GONZALESRAMIREZ.Repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	
	@Autowired
	private EspecialidadRepository especialidadRepository;
	
	public List<Especialidad> listarEspecialidades(){
		return especialidadRepository.findAll();
	}
	
	public void registrarEspecialidad(Especialidad estado) {
		especialidadRepository.save(estado);
	}

}
