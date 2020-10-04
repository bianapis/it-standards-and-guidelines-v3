package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceAnalysis;
import org.bian.dto.BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesRetrieveInputModel
 */
public class BQITPoliciesandGuidelinesRetrieveInputModel   {
  private Object iTPoliciesandGuidelinesRetrieveActionTaskRecord = null;

  private String iTPoliciesandGuidelinesRetrieveActionRequest = null;

  private BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceReport iTPoliciesandGuidelinesInstanceReport = null;

  private BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceAnalysis iTPoliciesandGuidelinesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTPoliciesandGuidelinesRetrieveActionTaskRecord
  **/

  public Object getITPoliciesandGuidelinesRetrieveActionTaskRecord() {
    return iTPoliciesandGuidelinesRetrieveActionTaskRecord;
  }

  public void setITPoliciesandGuidelinesRetrieveActionTaskRecord(Object iTPoliciesandGuidelinesRetrieveActionTaskRecord) {
    this.iTPoliciesandGuidelinesRetrieveActionTaskRecord = iTPoliciesandGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return iTPoliciesandGuidelinesRetrieveActionRequest
  **/

  public String getITPoliciesandGuidelinesRetrieveActionRequest() {
    return iTPoliciesandGuidelinesRetrieveActionRequest;
  }

  public void setITPoliciesandGuidelinesRetrieveActionRequest(String iTPoliciesandGuidelinesRetrieveActionRequest) {
    this.iTPoliciesandGuidelinesRetrieveActionRequest = iTPoliciesandGuidelinesRetrieveActionRequest;
  }


  /**
   * Get iTPoliciesandGuidelinesInstanceReport
   * @return iTPoliciesandGuidelinesInstanceReport
  **/

  public BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceReport getITPoliciesandGuidelinesInstanceReport() {
    return iTPoliciesandGuidelinesInstanceReport;
  }

  public void setITPoliciesandGuidelinesInstanceReport(BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceReport iTPoliciesandGuidelinesInstanceReport) {
    this.iTPoliciesandGuidelinesInstanceReport = iTPoliciesandGuidelinesInstanceReport;
  }


  /**
   * Get iTPoliciesandGuidelinesInstanceAnalysis
   * @return iTPoliciesandGuidelinesInstanceAnalysis
  **/

  public BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceAnalysis getITPoliciesandGuidelinesInstanceAnalysis() {
    return iTPoliciesandGuidelinesInstanceAnalysis;
  }

  public void setITPoliciesandGuidelinesInstanceAnalysis(BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceAnalysis iTPoliciesandGuidelinesInstanceAnalysis) {
    this.iTPoliciesandGuidelinesInstanceAnalysis = iTPoliciesandGuidelinesInstanceAnalysis;
  }


}

