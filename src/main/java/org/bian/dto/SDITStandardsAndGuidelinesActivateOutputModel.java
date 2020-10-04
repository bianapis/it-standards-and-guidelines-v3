package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesActivateOutputModel
 */
public class SDITStandardsAndGuidelinesActivateOutputModel   {
  private String iTStandardsAndGuidelinesActivationActionTaskReference = null;

  private Object iTStandardsAndGuidelinesActivationActionTaskRecord = null;

  private String iTStandardsAndGuidelinesServicingSessionReference = null;

  private Object iTStandardsAndGuidelinesServicingSessionRecord = null;

  private SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord = null;

  private String iTStandardsAndGuidelinesServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return iTStandardsAndGuidelinesActivationActionTaskReference
  **/

  public String getITStandardsAndGuidelinesActivationActionTaskReference() {
    return iTStandardsAndGuidelinesActivationActionTaskReference;
  }

  public void setITStandardsAndGuidelinesActivationActionTaskReference(String iTStandardsAndGuidelinesActivationActionTaskReference) {
    this.iTStandardsAndGuidelinesActivationActionTaskReference = iTStandardsAndGuidelinesActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return iTStandardsAndGuidelinesActivationActionTaskRecord
  **/

  public Object getITStandardsAndGuidelinesActivationActionTaskRecord() {
    return iTStandardsAndGuidelinesActivationActionTaskRecord;
  }

  public void setITStandardsAndGuidelinesActivationActionTaskRecord(Object iTStandardsAndGuidelinesActivationActionTaskRecord) {
    this.iTStandardsAndGuidelinesActivationActionTaskRecord = iTStandardsAndGuidelinesActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return iTStandardsAndGuidelinesServicingSessionRecord
  **/

  public Object getITStandardsAndGuidelinesServicingSessionRecord() {
    return iTStandardsAndGuidelinesServicingSessionRecord;
  }

  public void setITStandardsAndGuidelinesServicingSessionRecord(Object iTStandardsAndGuidelinesServicingSessionRecord) {
    this.iTStandardsAndGuidelinesServicingSessionRecord = iTStandardsAndGuidelinesServicingSessionRecord;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceConfigurationRecord
   * @return iTStandardsAndGuidelinesServiceConfigurationRecord
  **/

  public SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecord getITStandardsAndGuidelinesServiceConfigurationRecord() {
    return iTStandardsAndGuidelinesServiceConfigurationRecord;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationRecord(SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord) {
    this.iTStandardsAndGuidelinesServiceConfigurationRecord = iTStandardsAndGuidelinesServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return iTStandardsAndGuidelinesServicingSessionStatus
  **/

  public String getITStandardsAndGuidelinesServicingSessionStatus() {
    return iTStandardsAndGuidelinesServicingSessionStatus;
  }

  public void setITStandardsAndGuidelinesServicingSessionStatus(String iTStandardsAndGuidelinesServicingSessionStatus) {
    this.iTStandardsAndGuidelinesServicingSessionStatus = iTStandardsAndGuidelinesServicingSessionStatus;
  }


}

