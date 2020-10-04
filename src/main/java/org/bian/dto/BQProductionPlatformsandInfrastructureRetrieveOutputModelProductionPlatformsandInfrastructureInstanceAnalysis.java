package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionPlatformsandInfrastructureRetrieveOutputModelProductionPlatformsandInfrastructureInstanceAnalysis
 */
public class BQProductionPlatformsandInfrastructureRetrieveOutputModelProductionPlatformsandInfrastructureInstanceAnalysis   {
  private Object productionPlatformsandInfrastructureInstanceAnalysisRecord = null;

  private String productionPlatformsandInfrastructureInstanceAnalysisReportType = null;

  private String productionPlatformsandInfrastructureInstanceAnalysisParameters = null;

  private Object productionPlatformsandInfrastructureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productionPlatformsandInfrastructureInstanceAnalysisRecord
  **/

  public Object getProductionPlatformsandInfrastructureInstanceAnalysisRecord() {
    return productionPlatformsandInfrastructureInstanceAnalysisRecord;
  }

  public void setProductionPlatformsandInfrastructureInstanceAnalysisRecord(Object productionPlatformsandInfrastructureInstanceAnalysisRecord) {
    this.productionPlatformsandInfrastructureInstanceAnalysisRecord = productionPlatformsandInfrastructureInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productionPlatformsandInfrastructureInstanceAnalysisReportType
  **/

  public String getProductionPlatformsandInfrastructureInstanceAnalysisReportType() {
    return productionPlatformsandInfrastructureInstanceAnalysisReportType;
  }

  public void setProductionPlatformsandInfrastructureInstanceAnalysisReportType(String productionPlatformsandInfrastructureInstanceAnalysisReportType) {
    this.productionPlatformsandInfrastructureInstanceAnalysisReportType = productionPlatformsandInfrastructureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productionPlatformsandInfrastructureInstanceAnalysisParameters
  **/

  public String getProductionPlatformsandInfrastructureInstanceAnalysisParameters() {
    return productionPlatformsandInfrastructureInstanceAnalysisParameters;
  }

  public void setProductionPlatformsandInfrastructureInstanceAnalysisParameters(String productionPlatformsandInfrastructureInstanceAnalysisParameters) {
    this.productionPlatformsandInfrastructureInstanceAnalysisParameters = productionPlatformsandInfrastructureInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productionPlatformsandInfrastructureInstanceAnalysisReport
  **/

  public Object getProductionPlatformsandInfrastructureInstanceAnalysisReport() {
    return productionPlatformsandInfrastructureInstanceAnalysisReport;
  }

  public void setProductionPlatformsandInfrastructureInstanceAnalysisReport(Object productionPlatformsandInfrastructureInstanceAnalysisReport) {
    this.productionPlatformsandInfrastructureInstanceAnalysisReport = productionPlatformsandInfrastructureInstanceAnalysisReport;
  }


}

