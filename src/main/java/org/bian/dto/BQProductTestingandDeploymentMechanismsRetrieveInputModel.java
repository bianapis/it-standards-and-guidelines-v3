package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceAnalysis;
import org.bian.dto.BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductTestingandDeploymentMechanismsRetrieveInputModel
 */
public class BQProductTestingandDeploymentMechanismsRetrieveInputModel   {
  private Object productTestingandDeploymentMechanismsRetrieveActionTaskRecord = null;

  private String productTestingandDeploymentMechanismsRetrieveActionRequest = null;

  private BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceReport productTestingandDeploymentMechanismsInstanceReport = null;

  private BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceAnalysis productTestingandDeploymentMechanismsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productTestingandDeploymentMechanismsRetrieveActionTaskRecord
  **/

  public Object getProductTestingandDeploymentMechanismsRetrieveActionTaskRecord() {
    return productTestingandDeploymentMechanismsRetrieveActionTaskRecord;
  }

  public void setProductTestingandDeploymentMechanismsRetrieveActionTaskRecord(Object productTestingandDeploymentMechanismsRetrieveActionTaskRecord) {
    this.productTestingandDeploymentMechanismsRetrieveActionTaskRecord = productTestingandDeploymentMechanismsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productTestingandDeploymentMechanismsRetrieveActionRequest
  **/

  public String getProductTestingandDeploymentMechanismsRetrieveActionRequest() {
    return productTestingandDeploymentMechanismsRetrieveActionRequest;
  }

  public void setProductTestingandDeploymentMechanismsRetrieveActionRequest(String productTestingandDeploymentMechanismsRetrieveActionRequest) {
    this.productTestingandDeploymentMechanismsRetrieveActionRequest = productTestingandDeploymentMechanismsRetrieveActionRequest;
  }


  /**
   * Get productTestingandDeploymentMechanismsInstanceReport
   * @return productTestingandDeploymentMechanismsInstanceReport
  **/

  public BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceReport getProductTestingandDeploymentMechanismsInstanceReport() {
    return productTestingandDeploymentMechanismsInstanceReport;
  }

  public void setProductTestingandDeploymentMechanismsInstanceReport(BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceReport productTestingandDeploymentMechanismsInstanceReport) {
    this.productTestingandDeploymentMechanismsInstanceReport = productTestingandDeploymentMechanismsInstanceReport;
  }


  /**
   * Get productTestingandDeploymentMechanismsInstanceAnalysis
   * @return productTestingandDeploymentMechanismsInstanceAnalysis
  **/

  public BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceAnalysis getProductTestingandDeploymentMechanismsInstanceAnalysis() {
    return productTestingandDeploymentMechanismsInstanceAnalysis;
  }

  public void setProductTestingandDeploymentMechanismsInstanceAnalysis(BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceAnalysis productTestingandDeploymentMechanismsInstanceAnalysis) {
    this.productTestingandDeploymentMechanismsInstanceAnalysis = productTestingandDeploymentMechanismsInstanceAnalysis;
  }


}

