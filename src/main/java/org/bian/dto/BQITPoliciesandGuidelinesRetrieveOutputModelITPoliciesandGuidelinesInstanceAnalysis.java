package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesRetrieveOutputModelITPoliciesandGuidelinesInstanceAnalysis
 */
public class BQITPoliciesandGuidelinesRetrieveOutputModelITPoliciesandGuidelinesInstanceAnalysis   {
  private Object iTPoliciesandGuidelinesInstanceAnalysisRecord = null;

  private String iTPoliciesandGuidelinesInstanceAnalysisReportType = null;

  private String iTPoliciesandGuidelinesInstanceAnalysisParameters = null;

  private Object iTPoliciesandGuidelinesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return iTPoliciesandGuidelinesInstanceAnalysisRecord
  **/

  public Object getITPoliciesandGuidelinesInstanceAnalysisRecord() {
    return iTPoliciesandGuidelinesInstanceAnalysisRecord;
  }

  public void setITPoliciesandGuidelinesInstanceAnalysisRecord(Object iTPoliciesandGuidelinesInstanceAnalysisRecord) {
    this.iTPoliciesandGuidelinesInstanceAnalysisRecord = iTPoliciesandGuidelinesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return iTPoliciesandGuidelinesInstanceAnalysisReportType
  **/

  public String getITPoliciesandGuidelinesInstanceAnalysisReportType() {
    return iTPoliciesandGuidelinesInstanceAnalysisReportType;
  }

  public void setITPoliciesandGuidelinesInstanceAnalysisReportType(String iTPoliciesandGuidelinesInstanceAnalysisReportType) {
    this.iTPoliciesandGuidelinesInstanceAnalysisReportType = iTPoliciesandGuidelinesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return iTPoliciesandGuidelinesInstanceAnalysisParameters
  **/

  public String getITPoliciesandGuidelinesInstanceAnalysisParameters() {
    return iTPoliciesandGuidelinesInstanceAnalysisParameters;
  }

  public void setITPoliciesandGuidelinesInstanceAnalysisParameters(String iTPoliciesandGuidelinesInstanceAnalysisParameters) {
    this.iTPoliciesandGuidelinesInstanceAnalysisParameters = iTPoliciesandGuidelinesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return iTPoliciesandGuidelinesInstanceAnalysisReport
  **/

  public Object getITPoliciesandGuidelinesInstanceAnalysisReport() {
    return iTPoliciesandGuidelinesInstanceAnalysisReport;
  }

  public void setITPoliciesandGuidelinesInstanceAnalysisReport(Object iTPoliciesandGuidelinesInstanceAnalysisReport) {
    this.iTPoliciesandGuidelinesInstanceAnalysisReport = iTPoliciesandGuidelinesInstanceAnalysisReport;
  }


}

