package br.com.furb.test;

import br.com.furb.dao.User;

public class TestarConexao {
	
	public static void main(String[] args) {
		try {
			User user = new User();
			System.out.println("CONECTADO");
		} catch (Exception e) {
			System.out.println("NÃO CONECTADO \n" + e.getMessage());
			e.printStackTrace();
		}
	}

}
