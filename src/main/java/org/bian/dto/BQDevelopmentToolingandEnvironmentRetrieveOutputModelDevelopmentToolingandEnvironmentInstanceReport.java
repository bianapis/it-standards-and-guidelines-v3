package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentToolingandEnvironmentRetrieveOutputModelDevelopmentToolingandEnvironmentInstanceReport
 */
public class BQDevelopmentToolingandEnvironmentRetrieveOutputModelDevelopmentToolingandEnvironmentInstanceReport   {
  private Object developmentToolingandEnvironmentInstanceReportRecord = null;

  private String developmentToolingandEnvironmentInstanceReportType = null;

  private String developmentToolingandEnvironmentInstanceReportParameters = null;

  private Object developmentToolingandEnvironmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return developmentToolingandEnvironmentInstanceReportRecord
  **/

  public Object getDevelopmentToolingandEnvironmentInstanceReportRecord() {
    return developmentToolingandEnvironmentInstanceReportRecord;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReportRecord(Object developmentToolingandEnvironmentInstanceReportRecord) {
    this.developmentToolingandEnvironmentInstanceReportRecord = developmentToolingandEnvironmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return developmentToolingandEnvironmentInstanceReportType
  **/

  public String getDevelopmentToolingandEnvironmentInstanceReportType() {
    return developmentToolingandEnvironmentInstanceReportType;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReportType(String developmentToolingandEnvironmentInstanceReportType) {
    this.developmentToolingandEnvironmentInstanceReportType = developmentToolingandEnvironmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return developmentToolingandEnvironmentInstanceReportParameters
  **/

  public String getDevelopmentToolingandEnvironmentInstanceReportParameters() {
    return developmentToolingandEnvironmentInstanceReportParameters;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReportParameters(String developmentToolingandEnvironmentInstanceReportParameters) {
    this.developmentToolingandEnvironmentInstanceReportParameters = developmentToolingandEnvironmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return developmentToolingandEnvironmentInstanceReport
  **/

  public Object getDevelopmentToolingandEnvironmentInstanceReport() {
    return developmentToolingandEnvironmentInstanceReport;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReport(Object developmentToolingandEnvironmentInstanceReport) {
    this.developmentToolingandEnvironmentInstanceReport = developmentToolingandEnvironmentInstanceReport;
  }


}

