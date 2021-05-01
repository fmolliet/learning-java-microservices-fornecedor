package br.com.alura.microservico.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservico.fornecedor.model.InfoFornecedor;
import br.com.alura.microservico.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado( @PathVariable String estado) {
		
		 InfoFornecedor fornecedor = infoService.getInfoPorEstado(estado);
		 
		 System.out.println(fornecedor);
		 return fornecedor;
	}
}
