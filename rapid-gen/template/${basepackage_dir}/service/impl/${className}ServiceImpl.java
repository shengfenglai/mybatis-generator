/*
* ${table.className}DaoImpl.java 2012-09-03
* Copyright  © 2001-2012 必联网
* 京ICP备09004729号京公网安备110108008196号
*/
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ${basepackage}.model.${className};
import  ${basepackage}.service. ${className}Service;
import  ${basepackage}.dao. ${className}Dao;
<#include "/java_imports.include">

@Service
public class ${className}ServiceImpl implements  ${className}Service{
	private static Logger logger = Logger.getLogger(${className}ServiceImpl.class);
	@Autowired
	private ${className}Dao ${classNameLower}Dao;
	
	public Result save(${className} ${classNameLower}){
		${classNameLower}Dao.save(${classNameLower});
		return Result.buildOkResult();		
	}
	public Result delete(Long id){
		int deleted =  ${classNameLower}Dao.updateDeleted(id);
		if(deleted>0){
			return Result.buildOkResult(deleted);			
		}
		return Result.FAIL;
	}
	public Result update(${className} ${classNameLower}){
		${classNameLower}Dao.update(${classNameLower});
		return Result.buildOkResult();			
	}
	public Result list(){
		return Result.buildOkResult(${classNameLower}Dao.list());
	}
}
