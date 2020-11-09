/**
 * 
 */
package com.export.excel.js.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.export.excel.js.demo.entity.Excel;

/**
 * @author Admin
 *
 */

@Repository
public interface ExcelRepository extends JpaRepository<Excel, Integer> {
	
	
	
}
