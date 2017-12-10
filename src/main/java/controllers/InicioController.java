package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import model.EntityModel;
//import model.SupermecadoModel;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class InicioController {
	private Map<String, Object> model=new HashMap<>();
	
	
	public ModelAndView inicio(Request req, Response res) throws IOException{
		EntityModel entityModel = EntityModel.getInstance();
		EvaluacionIndicadorController.tamanoOficial = entityModel.listaIndicadoresPorId(LogInController.idUsuario).size();
		return new ModelAndView(model, "inicio.hbs");
		
	}
}
