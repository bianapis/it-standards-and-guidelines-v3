package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceAnalysis;
import org.bian.dto.BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionPlatformsandInfrastructureRetrieveInputModel
 */
public class BQProductionPlatformsandInfrastructureRetrieveInputModel   {
  private Object productionPlatformsandInfrastructureRetrieveActionTaskRecord = null;

  private String productionPlatformsandInfrastructureRetrieveActionRequest = null;

  private BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceReport productionPlatformsandInfrastructureInstanceReport = null;

  private BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceAnalysis productionPlatformsandInfrastructureInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionPlatformsandInfrastructureRetrieveActionTaskRecord
  **/

  public Object getProductionPlatformsandInfrastructureRetrieveActionTaskRecord() {
    return productionPlatformsandInfrastructureRetrieveActionTaskRecord;
  }

  public void setProductionPlatformsandInfrastructureRetrieveActionTaskRecord(Object productionPlatformsandInfrastructureRetrieveActionTaskRecord) {
    this.productionPlatformsandInfrastructureRetrieveActionTaskRecord = productionPlatformsandInfrastructureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productionPlatformsandInfrastructureRetrieveActionRequest
  **/

  public String getProductionPlatformsandInfrastructureRetrieveActionRequest() {
    return productionPlatformsandInfrastructureRetrieveActionRequest;
  }

  public void setProductionPlatformsandInfrastructureRetrieveActionRequest(String productionPlatformsandInfrastructureRetrieveActionRequest) {
    this.productionPlatformsandInfrastructureRetrieveActionRequest = productionPlatformsandInfrastructureRetrieveActionRequest;
  }


  /**
   * Get productionPlatformsandInfrastructureInstanceReport
   * @return productionPlatformsandInfrastructureInstanceReport
  **/

  public BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceReport getProductionPlatformsandInfrastructureInstanceReport() {
    return productionPlatformsandInfrastructureInstanceReport;
  }

  public void setProductionPlatformsandInfrastructureInstanceReport(BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceReport productionPlatformsandInfrastructureInstanceReport) {
    this.productionPlatformsandInfrastructureInstanceReport = productionPlatformsandInfrastructureInstanceReport;
  }


  /**
   * Get productionPlatformsandInfrastructureInstanceAnalysis
   * @return productionPlatformsandInfrastructureInstanceAnalysis
  **/

  public BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceAnalysis getProductionPlatformsandInfrastructureInstanceAnalysis() {
    return productionPlatformsandInfrastructureInstanceAnalysis;
  }

  public void setProductionPlatformsandInfrastructureInstanceAnalysis(BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceAnalysis productionPlatformsandInfrastructureInstanceAnalysis) {
    this.productionPlatformsandInfrastructureInstanceAnalysis = productionPlatformsandInfrastructureInstanceAnalysis;
  }


}

