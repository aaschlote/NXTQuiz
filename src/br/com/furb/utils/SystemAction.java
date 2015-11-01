package br.com.furb.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.furb.dao.User;

public class SystemAction {
	
	private HttpSession session;
	private static SystemAction instance = null;
	
	public static SystemAction getInstance() {
        if (instance == null) {
            instance = new SystemAction();
        }
        return instance;
    }	
	
	public User getSessionUser(){
		return (User) session.getAttribute("usuario");
	}
	
	public void setSession(HttpServletRequest request, User user){
		session = request.getSession();
		session.setAttribute("usuario", user);
	}
	
	public void disableSession(){
		session.invalidate();
	}

}
