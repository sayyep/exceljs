/**
 * 
 */
package com.export.excel.js.demo.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.export.excel.js.demo.entity.Excel;
import com.export.excel.js.demo.service.ExcelService;

/**
 * @author Admin
 *
 */

@RestController
@RequestMapping("/excels")
public class ExcelController {

	@Autowired
	private ExcelService excelService;

	@GetMapping
	public ResponseEntity<List<Excel>> excel() {
		return new ResponseEntity<List<Excel>>(excelService.getAllExcelData(), HttpStatus.OK);
	}

}
