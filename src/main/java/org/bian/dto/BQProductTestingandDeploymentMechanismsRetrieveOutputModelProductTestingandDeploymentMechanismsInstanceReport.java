package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTestingandDeploymentMechanismsRetrieveOutputModelProductTestingandDeploymentMechanismsInstanceReport
 */
public class BQProductTestingandDeploymentMechanismsRetrieveOutputModelProductTestingandDeploymentMechanismsInstanceReport   {
  private Object productTestingandDeploymentMechanismsInstanceReportRecord = null;

  private String productTestingandDeploymentMechanismsInstanceReportType = null;

  private String productTestingandDeploymentMechanismsInstanceReportParameters = null;

  private Object productTestingandDeploymentMechanismsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productTestingandDeploymentMechanismsInstanceReportRecord
  **/

  public Object getProductTestingandDeploymentMechanismsInstanceReportRecord() {
    return productTestingandDeploymentMechanismsInstanceReportRecord;
  }

  public void setProductTestingandDeploymentMechanismsInstanceReportRecord(Object productTestingandDeploymentMechanismsInstanceReportRecord) {
    this.productTestingandDeploymentMechanismsInstanceReportRecord = productTestingandDeploymentMechanismsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productTestingandDeploymentMechanismsInstanceReportType
  **/

  public String getProductTestingandDeploymentMechanismsInstanceReportType() {
    return productTestingandDeploymentMechanismsInstanceReportType;
  }

  public void setProductTestingandDeploymentMechanismsInstanceReportType(String productTestingandDeploymentMechanismsInstanceReportType) {
    this.productTestingandDeploymentMechanismsInstanceReportType = productTestingandDeploymentMechanismsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productTestingandDeploymentMechanismsInstanceReportParameters
  **/

  public String getProductTestingandDeploymentMechanismsInstanceReportParameters() {
    return productTestingandDeploymentMechanismsInstanceReportParameters;
  }

  public void setProductTestingandDeploymentMechanismsInstanceReportParameters(String productTestingandDeploymentMechanismsInstanceReportParameters) {
    this.productTestingandDeploymentMechanismsInstanceReportParameters = productTestingandDeploymentMechanismsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productTestingandDeploymentMechanismsInstanceReport
  **/

  public Object getProductTestingandDeploymentMechanismsInstanceReport() {
    return productTestingandDeploymentMechanismsInstanceReport;
  }

  public void setProductTestingandDeploymentMechanismsInstanceReport(Object productTestingandDeploymentMechanismsInstanceReport) {
    this.productTestingandDeploymentMechanismsInstanceReport = productTestingandDeploymentMechanismsInstanceReport;
  }


}

