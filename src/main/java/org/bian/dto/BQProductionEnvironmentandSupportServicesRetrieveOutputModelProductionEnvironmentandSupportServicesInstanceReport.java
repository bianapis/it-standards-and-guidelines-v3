package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceReport
 */
public class BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceReport   {
  private Object productionEnvironmentandSupportServicesInstanceReportRecord = null;

  private String productionEnvironmentandSupportServicesInstanceReportType = null;

  private String productionEnvironmentandSupportServicesInstanceReportParameters = null;

  private Object productionEnvironmentandSupportServicesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productionEnvironmentandSupportServicesInstanceReportRecord
  **/

  public Object getProductionEnvironmentandSupportServicesInstanceReportRecord() {
    return productionEnvironmentandSupportServicesInstanceReportRecord;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReportRecord(Object productionEnvironmentandSupportServicesInstanceReportRecord) {
    this.productionEnvironmentandSupportServicesInstanceReportRecord = productionEnvironmentandSupportServicesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productionEnvironmentandSupportServicesInstanceReportType
  **/

  public String getProductionEnvironmentandSupportServicesInstanceReportType() {
    return productionEnvironmentandSupportServicesInstanceReportType;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReportType(String productionEnvironmentandSupportServicesInstanceReportType) {
    this.productionEnvironmentandSupportServicesInstanceReportType = productionEnvironmentandSupportServicesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productionEnvironmentandSupportServicesInstanceReportParameters
  **/

  public String getProductionEnvironmentandSupportServicesInstanceReportParameters() {
    return productionEnvironmentandSupportServicesInstanceReportParameters;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReportParameters(String productionEnvironmentandSupportServicesInstanceReportParameters) {
    this.productionEnvironmentandSupportServicesInstanceReportParameters = productionEnvironmentandSupportServicesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productionEnvironmentandSupportServicesInstanceReport
  **/

  public Object getProductionEnvironmentandSupportServicesInstanceReport() {
    return productionEnvironmentandSupportServicesInstanceReport;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReport(Object productionEnvironmentandSupportServicesInstanceReport) {
    this.productionEnvironmentandSupportServicesInstanceReport = productionEnvironmentandSupportServicesInstanceReport;
  }


}

