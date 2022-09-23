package com.bso.ioc;

public class Secretario implements IEmpleado {

	
	private ICreacionInforme informeNuevo;
	
	
	
	public void setInformeNuevo(ICreacionInforme informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return this.informeNuevo.getInforme();
	}

}
