package com.sigmadream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeAction implements Action {
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/index.html";
    }
}
