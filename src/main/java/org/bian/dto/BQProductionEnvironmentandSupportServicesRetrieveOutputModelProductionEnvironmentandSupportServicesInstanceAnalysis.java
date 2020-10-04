package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceAnalysis
 */
public class BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceAnalysis   {
  private Object productionEnvironmentandSupportServicesInstanceAnalysisRecord = null;

  private String productionEnvironmentandSupportServicesInstanceAnalysisReportType = null;

  private String productionEnvironmentandSupportServicesInstanceAnalysisParameters = null;

  private Object productionEnvironmentandSupportServicesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productionEnvironmentandSupportServicesInstanceAnalysisRecord
  **/

  public Object getProductionEnvironmentandSupportServicesInstanceAnalysisRecord() {
    return productionEnvironmentandSupportServicesInstanceAnalysisRecord;
  }

  public void setProductionEnvironmentandSupportServicesInstanceAnalysisRecord(Object productionEnvironmentandSupportServicesInstanceAnalysisRecord) {
    this.productionEnvironmentandSupportServicesInstanceAnalysisRecord = productionEnvironmentandSupportServicesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productionEnvironmentandSupportServicesInstanceAnalysisReportType
  **/

  public String getProductionEnvironmentandSupportServicesInstanceAnalysisReportType() {
    return productionEnvironmentandSupportServicesInstanceAnalysisReportType;
  }

  public void setProductionEnvironmentandSupportServicesInstanceAnalysisReportType(String productionEnvironmentandSupportServicesInstanceAnalysisReportType) {
    this.productionEnvironmentandSupportServicesInstanceAnalysisReportType = productionEnvironmentandSupportServicesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productionEnvironmentandSupportServicesInstanceAnalysisParameters
  **/

  public String getProductionEnvironmentandSupportServicesInstanceAnalysisParameters() {
    return productionEnvironmentandSupportServicesInstanceAnalysisParameters;
  }

  public void setProductionEnvironmentandSupportServicesInstanceAnalysisParameters(String productionEnvironmentandSupportServicesInstanceAnalysisParameters) {
    this.productionEnvironmentandSupportServicesInstanceAnalysisParameters = productionEnvironmentandSupportServicesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productionEnvironmentandSupportServicesInstanceAnalysisReport
  **/

  public Object getProductionEnvironmentandSupportServicesInstanceAnalysisReport() {
    return productionEnvironmentandSupportServicesInstanceAnalysisReport;
  }

  public void setProductionEnvironmentandSupportServicesInstanceAnalysisReport(Object productionEnvironmentandSupportServicesInstanceAnalysisReport) {
    this.productionEnvironmentandSupportServicesInstanceAnalysisReport = productionEnvironmentandSupportServicesInstanceAnalysisReport;
  }


}

