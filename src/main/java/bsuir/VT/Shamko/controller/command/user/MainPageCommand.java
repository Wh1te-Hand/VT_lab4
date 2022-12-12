package bsuir.VT.Shamko.controller.command.user;

import bsuir.VT.Shamko.controller.command.Command;
import bsuir.VT.Shamko.controller.command.CommandResult;
import bsuir.VT.Shamko.entity.Room;
import bsuir.VT.Shamko.exception.ServiceException;
import bsuir.VT.Shamko.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainPageCommand implements Command {

    private static final String MAIN_PAGE = "/WEB-INF/pages/makeOrder.jsp";
    private static final String ROOM_LIST = "roomList";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        RoomService roomService = new RoomService();
        List<Room> freeRoomList = roomService.findFree();
        request.setAttribute(ROOM_LIST, freeRoomList);
        return CommandResult.forward(MAIN_PAGE);
    }
}
