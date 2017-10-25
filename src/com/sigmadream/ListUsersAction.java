package com.sigmadream;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUsersAction implements Action {
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        List<String> userList = new ArrayList<>();
        userList.add("���Ͽ�");
        userList.add("�̻���");
        userList.add("������");
        userList.add("�̼���");
        request.setAttribute("listusers", userList);
        return "/listusers.jsp";
    }
}
