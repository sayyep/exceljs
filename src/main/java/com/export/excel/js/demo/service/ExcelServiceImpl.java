/**
 * 
 */
package com.export.excel.js.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.export.excel.js.demo.entity.Excel;
import com.export.excel.js.demo.repository.ExcelRepository;

/**
 * @author Admin
 *
 */
@Service
public class ExcelServiceImpl implements ExcelService {

	@Autowired
	private ExcelRepository excelRepository;

	@Override
	public List<Excel> getAllExcelData() {
		return excelRepository.findAll();
	}

}
