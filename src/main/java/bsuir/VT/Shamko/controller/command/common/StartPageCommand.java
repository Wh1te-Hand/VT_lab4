package bsuir.VT.Shamko.controller.command.common;

import bsuir.VT.Shamko.controller.command.Command;
import bsuir.VT.Shamko.controller.command.CommandResult;
import bsuir.VT.Shamko.exception.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartPageCommand implements Command {

    private static final String LOGIN_PAGE = "/index.jsp";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        return CommandResult.forward(LOGIN_PAGE);
    }
}
