package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTestingandDeploymentMechanismsRetrieveOutputModelProductTestingandDeploymentMechanismsInstanceAnalysis
 */
public class BQProductTestingandDeploymentMechanismsRetrieveOutputModelProductTestingandDeploymentMechanismsInstanceAnalysis   {
  private Object productTestingandDeploymentMechanismsInstanceAnalysisRecord = null;

  private String productTestingandDeploymentMechanismsInstanceAnalysisReportType = null;

  private String productTestingandDeploymentMechanismsInstanceAnalysisParameters = null;

  private Object productTestingandDeploymentMechanismsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productTestingandDeploymentMechanismsInstanceAnalysisRecord
  **/

  public Object getProductTestingandDeploymentMechanismsInstanceAnalysisRecord() {
    return productTestingandDeploymentMechanismsInstanceAnalysisRecord;
  }

  public void setProductTestingandDeploymentMechanismsInstanceAnalysisRecord(Object productTestingandDeploymentMechanismsInstanceAnalysisRecord) {
    this.productTestingandDeploymentMechanismsInstanceAnalysisRecord = productTestingandDeploymentMechanismsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productTestingandDeploymentMechanismsInstanceAnalysisReportType
  **/

  public String getProductTestingandDeploymentMechanismsInstanceAnalysisReportType() {
    return productTestingandDeploymentMechanismsInstanceAnalysisReportType;
  }

  public void setProductTestingandDeploymentMechanismsInstanceAnalysisReportType(String productTestingandDeploymentMechanismsInstanceAnalysisReportType) {
    this.productTestingandDeploymentMechanismsInstanceAnalysisReportType = productTestingandDeploymentMechanismsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productTestingandDeploymentMechanismsInstanceAnalysisParameters
  **/

  public String getProductTestingandDeploymentMechanismsInstanceAnalysisParameters() {
    return productTestingandDeploymentMechanismsInstanceAnalysisParameters;
  }

  public void setProductTestingandDeploymentMechanismsInstanceAnalysisParameters(String productTestingandDeploymentMechanismsInstanceAnalysisParameters) {
    this.productTestingandDeploymentMechanismsInstanceAnalysisParameters = productTestingandDeploymentMechanismsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productTestingandDeploymentMechanismsInstanceAnalysisReport
  **/

  public Object getProductTestingandDeploymentMechanismsInstanceAnalysisReport() {
    return productTestingandDeploymentMechanismsInstanceAnalysisReport;
  }

  public void setProductTestingandDeploymentMechanismsInstanceAnalysisReport(Object productTestingandDeploymentMechanismsInstanceAnalysisReport) {
    this.productTestingandDeploymentMechanismsInstanceAnalysisReport = productTestingandDeploymentMechanismsInstanceAnalysisReport;
  }


}

