/*
* ${table.className}Dao.java 2012-09-03
* Copyright  © 2001-2012 必联网
* 京ICP备09004729号京公网安备110108008196号
*/
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.service;


import ${basepackage}.service.${className};

public interface ${className}Service{
	public Result save(${className} ${classNameLower});
	public Result delete(Long id);
	public Result update(${className} ${classNameLower});
	public Result list();
}
