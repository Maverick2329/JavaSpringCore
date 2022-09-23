package com.bso.ioc;

public class Jefe implements IEmpleado {

	private ICreacionInforme Informe;
	
	
	
	public void setInforme(ICreacionInforme informe) {
		this.Informe = informe;
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.Informe.getInforme();
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return null;
	}

}
