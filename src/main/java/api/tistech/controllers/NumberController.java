package api.tistech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import api.tistech.services.NumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api
@RequestMapping("")
public class NumberController {
	
	@Autowired
	NumberService numberService;
	
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Retorna um terceiro número"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@RequestMapping(value = "/number", method = RequestMethod.GET, produces="application/json")
	public Integer user(@RequestParam(name = "number1") int number1, @RequestParam(name = "number2") int number2) {
		return numberService.returnNumber3(number1, number2);
	}

}
