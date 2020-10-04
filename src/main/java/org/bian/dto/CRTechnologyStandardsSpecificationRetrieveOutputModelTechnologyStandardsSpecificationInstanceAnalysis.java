package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationRetrieveOutputModelTechnologyStandardsSpecificationInstanceAnalysis
 */
public class CRTechnologyStandardsSpecificationRetrieveOutputModelTechnologyStandardsSpecificationInstanceAnalysis   {
  private String technologyStandardsSpecificationInstanceAnalysisData = null;

  private String technologyStandardsSpecificationInstanceAnalysisReportType = null;

  private Object technologyStandardsSpecificationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return technologyStandardsSpecificationInstanceAnalysisData
  **/

  public String getTechnologyStandardsSpecificationInstanceAnalysisData() {
    return technologyStandardsSpecificationInstanceAnalysisData;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysisData(String technologyStandardsSpecificationInstanceAnalysisData) {
    this.technologyStandardsSpecificationInstanceAnalysisData = technologyStandardsSpecificationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return technologyStandardsSpecificationInstanceAnalysisReportType
  **/

  public String getTechnologyStandardsSpecificationInstanceAnalysisReportType() {
    return technologyStandardsSpecificationInstanceAnalysisReportType;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysisReportType(String technologyStandardsSpecificationInstanceAnalysisReportType) {
    this.technologyStandardsSpecificationInstanceAnalysisReportType = technologyStandardsSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return technologyStandardsSpecificationInstanceAnalysisReport
  **/

  public Object getTechnologyStandardsSpecificationInstanceAnalysisReport() {
    return technologyStandardsSpecificationInstanceAnalysisReport;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysisReport(Object technologyStandardsSpecificationInstanceAnalysisReport) {
    this.technologyStandardsSpecificationInstanceAnalysisReport = technologyStandardsSpecificationInstanceAnalysisReport;
  }


}

