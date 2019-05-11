package com.xworkz.helpdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.helpdesk.constants.AppConstants;
import com.xworkz.helpdesk.dto.IssueTicketDTO;
import com.xworkz.helpdesk.exception.ControllerException;
import com.xworkz.helpdesk.exception.ServiceException;
import com.xworkz.helpdesk.service.IssueTicketService;

@Controller
@RequestMapping("/")
public class IssueTicketController {

	@Autowired // REf- DI
	private IssueTicketService issueTicketService;

	@Value("${controller.message}")
	private String controllerMessage;

	public IssueTicketController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/issueTicket")
	// Model-Obj
	// Head First Servlet's
	public String onSubmit(@ModelAttribute IssueTicketDTO issueTicketDTO, Model model) throws ControllerException {
		System.out.println("invoked onSubmit()");
		System.out.println(controllerMessage + ":\t" + issueTicketDTO);
		try {
			issueTicketService.validateAndSave(issueTicketDTO);
		} catch (ServiceException e) {
			e.printStackTrace();
			throw new ControllerException(e.getMessage());
		}
		model.addAttribute(AppConstants.ISSUE_TICKET_MODEL_KEY, issueTicketDTO);// request
																				// scope
		return AppConstants.ISSUE_TICKET_SUCCESS_PAGE;

	}

}
