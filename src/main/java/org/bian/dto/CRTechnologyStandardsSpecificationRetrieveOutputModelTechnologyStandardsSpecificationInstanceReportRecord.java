package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationRetrieveOutputModelTechnologyStandardsSpecificationInstanceReportRecord
 */
public class CRTechnologyStandardsSpecificationRetrieveOutputModelTechnologyStandardsSpecificationInstanceReportRecord   {
  private String technologyStandardsSpecificationInstanceReportData = null;

  private String technologyStandardsSpecificationInstanceReportType = null;

  private Object technologyStandardsSpecificationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return technologyStandardsSpecificationInstanceReportData
  **/

  public String getTechnologyStandardsSpecificationInstanceReportData() {
    return technologyStandardsSpecificationInstanceReportData;
  }

  public void setTechnologyStandardsSpecificationInstanceReportData(String technologyStandardsSpecificationInstanceReportData) {
    this.technologyStandardsSpecificationInstanceReportData = technologyStandardsSpecificationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return technologyStandardsSpecificationInstanceReportType
  **/

  public String getTechnologyStandardsSpecificationInstanceReportType() {
    return technologyStandardsSpecificationInstanceReportType;
  }

  public void setTechnologyStandardsSpecificationInstanceReportType(String technologyStandardsSpecificationInstanceReportType) {
    this.technologyStandardsSpecificationInstanceReportType = technologyStandardsSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return technologyStandardsSpecificationInstanceReport
  **/

  public Object getTechnologyStandardsSpecificationInstanceReport() {
    return technologyStandardsSpecificationInstanceReport;
  }

  public void setTechnologyStandardsSpecificationInstanceReport(Object technologyStandardsSpecificationInstanceReport) {
    this.technologyStandardsSpecificationInstanceReport = technologyStandardsSpecificationInstanceReport;
  }


}

