package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesRetrieveOutputModelITPoliciesandGuidelinesInstanceReport
 */
public class BQITPoliciesandGuidelinesRetrieveOutputModelITPoliciesandGuidelinesInstanceReport   {
  private Object iTPoliciesandGuidelinesInstanceReportRecord = null;

  private String iTPoliciesandGuidelinesInstanceReportType = null;

  private String iTPoliciesandGuidelinesInstanceReportParameters = null;

  private Object iTPoliciesandGuidelinesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return iTPoliciesandGuidelinesInstanceReportRecord
  **/

  public Object getITPoliciesandGuidelinesInstanceReportRecord() {
    return iTPoliciesandGuidelinesInstanceReportRecord;
  }

  public void setITPoliciesandGuidelinesInstanceReportRecord(Object iTPoliciesandGuidelinesInstanceReportRecord) {
    this.iTPoliciesandGuidelinesInstanceReportRecord = iTPoliciesandGuidelinesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return iTPoliciesandGuidelinesInstanceReportType
  **/

  public String getITPoliciesandGuidelinesInstanceReportType() {
    return iTPoliciesandGuidelinesInstanceReportType;
  }

  public void setITPoliciesandGuidelinesInstanceReportType(String iTPoliciesandGuidelinesInstanceReportType) {
    this.iTPoliciesandGuidelinesInstanceReportType = iTPoliciesandGuidelinesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return iTPoliciesandGuidelinesInstanceReportParameters
  **/

  public String getITPoliciesandGuidelinesInstanceReportParameters() {
    return iTPoliciesandGuidelinesInstanceReportParameters;
  }

  public void setITPoliciesandGuidelinesInstanceReportParameters(String iTPoliciesandGuidelinesInstanceReportParameters) {
    this.iTPoliciesandGuidelinesInstanceReportParameters = iTPoliciesandGuidelinesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return iTPoliciesandGuidelinesInstanceReport
  **/

  public Object getITPoliciesandGuidelinesInstanceReport() {
    return iTPoliciesandGuidelinesInstanceReport;
  }

  public void setITPoliciesandGuidelinesInstanceReport(Object iTPoliciesandGuidelinesInstanceReport) {
    this.iTPoliciesandGuidelinesInstanceReport = iTPoliciesandGuidelinesInstanceReport;
  }


}

