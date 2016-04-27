<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.mapper;

public interface ${className}Mapper {
	
    int updateDeleted(Long id) ;
	
}
