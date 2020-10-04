package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedService;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesRetrieveOutputModel
 */
public class SDITStandardsAndGuidelinesRetrieveOutputModel   {
  private String iTStandardsAndGuidelinesRetrieveActionTaskReference = null;

  private Object iTStandardsAndGuidelinesRetrieveActionTaskRecord = null;

  private String iTStandardsAndGuidelinesRetrieveActionResponse = null;

  private SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesRetrieveActionRecord iTStandardsAndGuidelinesRetrieveActionRecord = null;

  private SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedService iTStandardsAndGuidelinesOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return iTStandardsAndGuidelinesRetrieveActionTaskReference
  **/

  public String getITStandardsAndGuidelinesRetrieveActionTaskReference() {
    return iTStandardsAndGuidelinesRetrieveActionTaskReference;
  }

  public void setITStandardsAndGuidelinesRetrieveActionTaskReference(String iTStandardsAndGuidelinesRetrieveActionTaskReference) {
    this.iTStandardsAndGuidelinesRetrieveActionTaskReference = iTStandardsAndGuidelinesRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return iTStandardsAndGuidelinesRetrieveActionResponse
  **/

  public String getITStandardsAndGuidelinesRetrieveActionResponse() {
    return iTStandardsAndGuidelinesRetrieveActionResponse;
  }

  public void setITStandardsAndGuidelinesRetrieveActionResponse(String iTStandardsAndGuidelinesRetrieveActionResponse) {
    this.iTStandardsAndGuidelinesRetrieveActionResponse = iTStandardsAndGuidelinesRetrieveActionResponse;
  }


  /**
   * Get iTStandardsAndGuidelinesRetrieveActionRecord
   * @return iTStandardsAndGuidelinesRetrieveActionRecord
  **/

  public SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesRetrieveActionRecord getITStandardsAndGuidelinesRetrieveActionRecord() {
    return iTStandardsAndGuidelinesRetrieveActionRecord;
  }

  public void setITStandardsAndGuidelinesRetrieveActionRecord(SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesRetrieveActionRecord iTStandardsAndGuidelinesRetrieveActionRecord) {
    this.iTStandardsAndGuidelinesRetrieveActionRecord = iTStandardsAndGuidelinesRetrieveActionRecord;
  }


  /**
   * Get iTStandardsAndGuidelinesOfferedService
   * @return iTStandardsAndGuidelinesOfferedService
  **/

  public SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedService getITStandardsAndGuidelinesOfferedService() {
    return iTStandardsAndGuidelinesOfferedService;
  }

  public void setITStandardsAndGuidelinesOfferedService(SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedService iTStandardsAndGuidelinesOfferedService) {
    this.iTStandardsAndGuidelinesOfferedService = iTStandardsAndGuidelinesOfferedService;
  }


}

