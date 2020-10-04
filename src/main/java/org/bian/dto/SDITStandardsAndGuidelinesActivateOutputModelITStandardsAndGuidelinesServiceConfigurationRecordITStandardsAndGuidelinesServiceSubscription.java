package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription
 */
public class SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription   {
  private String iTStandardsAndGuidelinesServiceSubscriberReference = null;

  private String iTStandardsAndGuidelinesServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return iTStandardsAndGuidelinesServiceSubscriberReference
  **/

  public String getITStandardsAndGuidelinesServiceSubscriberReference() {
    return iTStandardsAndGuidelinesServiceSubscriberReference;
  }

  public void setITStandardsAndGuidelinesServiceSubscriberReference(String iTStandardsAndGuidelinesServiceSubscriberReference) {
    this.iTStandardsAndGuidelinesServiceSubscriberReference = iTStandardsAndGuidelinesServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return iTStandardsAndGuidelinesServiceSubscriberAccessProfile
  **/

  public String getITStandardsAndGuidelinesServiceSubscriberAccessProfile() {
    return iTStandardsAndGuidelinesServiceSubscriberAccessProfile;
  }

  public void setITStandardsAndGuidelinesServiceSubscriberAccessProfile(String iTStandardsAndGuidelinesServiceSubscriberAccessProfile) {
    this.iTStandardsAndGuidelinesServiceSubscriberAccessProfile = iTStandardsAndGuidelinesServiceSubscriberAccessProfile;
  }


}

