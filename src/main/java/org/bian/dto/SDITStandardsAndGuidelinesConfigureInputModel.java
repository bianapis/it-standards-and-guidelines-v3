package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesConfigureInputModel
 */
public class SDITStandardsAndGuidelinesConfigureInputModel   {
  private Object iTStandardsAndGuidelinesConfigurationActionTaskRecord = null;

  private String iTStandardsAndGuidelinesServicingSessionReference = null;

  private String iTStandardsAndGuidelinesServiceReference = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return iTStandardsAndGuidelinesConfigurationActionTaskRecord
  **/

  public Object getITStandardsAndGuidelinesConfigurationActionTaskRecord() {
    return iTStandardsAndGuidelinesConfigurationActionTaskRecord;
  }

  public void setITStandardsAndGuidelinesConfigurationActionTaskRecord(Object iTStandardsAndGuidelinesConfigurationActionTaskRecord) {
    this.iTStandardsAndGuidelinesConfigurationActionTaskRecord = iTStandardsAndGuidelinesConfigurationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return iTStandardsAndGuidelinesServicingSessionReference
  **/

  public String getITStandardsAndGuidelinesServicingSessionReference() {
    return iTStandardsAndGuidelinesServicingSessionReference;
  }

  public void setITStandardsAndGuidelinesServicingSessionReference(String iTStandardsAndGuidelinesServicingSessionReference) {
    this.iTStandardsAndGuidelinesServicingSessionReference = iTStandardsAndGuidelinesServicingSessionReference;
  }


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
   * Get iTStandardsAndGuidelinesServiceConfigurationRecord
   * @return iTStandardsAndGuidelinesServiceConfigurationRecord
  **/

  public SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecord getITStandardsAndGuidelinesServiceConfigurationRecord() {
    return iTStandardsAndGuidelinesServiceConfigurationRecord;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationRecord(SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord) {
    this.iTStandardsAndGuidelinesServiceConfigurationRecord = iTStandardsAndGuidelinesServiceConfigurationRecord;
  }


}

