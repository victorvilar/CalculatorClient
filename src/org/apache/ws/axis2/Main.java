package org.apache.ws.axis2;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.CalculatorServiceStub.Adicao;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		CalculatorServiceStub css = new CalculatorServiceStub();
		Adicao ad = new Adicao();
		ad.setA(1);
		ad.setB(17);
		
		int result = css.adicao(ad).get_return();
		System.out.println(result);

	}

}
