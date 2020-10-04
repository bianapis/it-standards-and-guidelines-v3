package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceAnalysis;
import org.bian.dto.BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionEnvironmentandSupportServicesRetrieveInputModel
 */
public class BQProductionEnvironmentandSupportServicesRetrieveInputModel   {
  private Object productionEnvironmentandSupportServicesRetrieveActionTaskRecord = null;

  private String productionEnvironmentandSupportServicesRetrieveActionRequest = null;

  private BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceReport productionEnvironmentandSupportServicesInstanceReport = null;

  private BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceAnalysis productionEnvironmentandSupportServicesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionEnvironmentandSupportServicesRetrieveActionTaskRecord
  **/

  public Object getProductionEnvironmentandSupportServicesRetrieveActionTaskRecord() {
    return productionEnvironmentandSupportServicesRetrieveActionTaskRecord;
  }

  public void setProductionEnvironmentandSupportServicesRetrieveActionTaskRecord(Object productionEnvironmentandSupportServicesRetrieveActionTaskRecord) {
    this.productionEnvironmentandSupportServicesRetrieveActionTaskRecord = productionEnvironmentandSupportServicesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productionEnvironmentandSupportServicesRetrieveActionRequest
  **/

  public String getProductionEnvironmentandSupportServicesRetrieveActionRequest() {
    return productionEnvironmentandSupportServicesRetrieveActionRequest;
  }

  public void setProductionEnvironmentandSupportServicesRetrieveActionRequest(String productionEnvironmentandSupportServicesRetrieveActionRequest) {
    this.productionEnvironmentandSupportServicesRetrieveActionRequest = productionEnvironmentandSupportServicesRetrieveActionRequest;
  }


  /**
   * Get productionEnvironmentandSupportServicesInstanceReport
   * @return productionEnvironmentandSupportServicesInstanceReport
  **/

  public BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceReport getProductionEnvironmentandSupportServicesInstanceReport() {
    return productionEnvironmentandSupportServicesInstanceReport;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReport(BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceReport productionEnvironmentandSupportServicesInstanceReport) {
    this.productionEnvironmentandSupportServicesInstanceReport = productionEnvironmentandSupportServicesInstanceReport;
  }


  /**
   * Get productionEnvironmentandSupportServicesInstanceAnalysis
   * @return productionEnvironmentandSupportServicesInstanceAnalysis
  **/

  public BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceAnalysis getProductionEnvironmentandSupportServicesInstanceAnalysis() {
    return productionEnvironmentandSupportServicesInstanceAnalysis;
  }

  public void setProductionEnvironmentandSupportServicesInstanceAnalysis(BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceAnalysis productionEnvironmentandSupportServicesInstanceAnalysis) {
    this.productionEnvironmentandSupportServicesInstanceAnalysis = productionEnvironmentandSupportServicesInstanceAnalysis;
  }


}

