package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedService
 */
public class SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedService   {
  private String iTStandardsAndGuidelinesServiceReference = null;

  private SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecord iTStandardsAndGuidelinesServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return iTStandardsAndGuidelinesServiceReference
  **/

  public String getITStandardsAndGuidelinesServiceReference() {
    return iTStandardsAndGuidelinesServiceReference;
  }

  public void setITStandardsAndGuidelinesServiceReference(String iTStandardsAndGuidelinesServiceReference) {
    this.iTStandardsAndGuidelinesServiceReference = iTStandardsAndGuidelinesServiceReference;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceRecord
   * @return iTStandardsAndGuidelinesServiceRecord
  **/

  public SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecord getITStandardsAndGuidelinesServiceRecord() {
    return iTStandardsAndGuidelinesServiceRecord;
  }

  public void setITStandardsAndGuidelinesServiceRecord(SDITStandardsAndGuidelinesRetrieveInputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecord iTStandardsAndGuidelinesServiceRecord) {
    this.iTStandardsAndGuidelinesServiceRecord = iTStandardsAndGuidelinesServiceRecord;
  }


}

