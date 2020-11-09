/**
 * 
 */
package com.export.excel.js.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Admin
 *
 */

@Controller
@RequestMapping("/")
public class RouterController {

	@GetMapping()
	public String index(Model model) {
		return "index";
	}

}
