package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedService;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesRetrieveInputModel
 */
public class SDITStandardsAndGuidelinesRetrieveInputModel   {
  private Object iTStandardsAndGuidelinesRetrieveActionTaskRecord = null;

  private String iTStandardsAndGuidelinesRetrieveActionRequest = null;

  private SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecord iTStandardsAndGuidelinesRetrieveActionRecord = null;

  private SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedService iTStandardsAndGuidelinesOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return iTStandardsAndGuidelinesRetrieveActionTaskRecord
  **/

  public Object getITStandardsAndGuidelinesRetrieveActionTaskRecord() {
    return iTStandardsAndGuidelinesRetrieveActionTaskRecord;
  }

  public void setITStandardsAndGuidelinesRetrieveActionTaskRecord(Object iTStandardsAndGuidelinesRetrieveActionTaskRecord) {
    this.iTStandardsAndGuidelinesRetrieveActionTaskRecord = iTStandardsAndGuidelinesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return iTStandardsAndGuidelinesRetrieveActionRequest
  **/

  public String getITStandardsAndGuidelinesRetrieveActionRequest() {
    return iTStandardsAndGuidelinesRetrieveActionRequest;
  }

  public void setITStandardsAndGuidelinesRetrieveActionRequest(String iTStandardsAndGuidelinesRetrieveActionRequest) {
    this.iTStandardsAndGuidelinesRetrieveActionRequest = iTStandardsAndGuidelinesRetrieveActionRequest;
  }


  /**
   * Get iTStandardsAndGuidelinesRetrieveActionRecord
   * @return iTStandardsAndGuidelinesRetrieveActionRecord
  **/

  public SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecord getITStandardsAndGuidelinesRetrieveActionRecord() {
    return iTStandardsAndGuidelinesRetrieveActionRecord;
  }

  public void setITStandardsAndGuidelinesRetrieveActionRecord(SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesRetrieveActionRecord iTStandardsAndGuidelinesRetrieveActionRecord) {
    this.iTStandardsAndGuidelinesRetrieveActionRecord = iTStandardsAndGuidelinesRetrieveActionRecord;
  }


  /**
   * Get iTStandardsAndGuidelinesOfferedService
   * @return iTStandardsAndGuidelinesOfferedService
  **/

  public SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedService getITStandardsAndGuidelinesOfferedService() {
    return iTStandardsAndGuidelinesOfferedService;
  }

  public void setITStandardsAndGuidelinesOfferedService(SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedService iTStandardsAndGuidelinesOfferedService) {
    this.iTStandardsAndGuidelinesOfferedService = iTStandardsAndGuidelinesOfferedService;
  }


}

