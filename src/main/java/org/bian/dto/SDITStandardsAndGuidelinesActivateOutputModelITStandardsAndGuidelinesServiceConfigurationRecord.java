package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup;
import org.bian.dto.SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement;
import org.bian.dto.SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecord
 */
public class SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecord   {
  private String iTStandardsAndGuidelinesServiceConfigurationSettingReference = null;

  private String iTStandardsAndGuidelinesServiceConfigurationSettingDescription = null;

  private SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup = null;

  private SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription iTStandardsAndGuidelinesServiceSubscription = null;

  private SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement iTStandardsAndGuidelinesServiceAgreement = null;

  private String iTStandardsAndGuidelinesServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return iTStandardsAndGuidelinesServiceConfigurationSettingReference
  **/

  public String getITStandardsAndGuidelinesServiceConfigurationSettingReference() {
    return iTStandardsAndGuidelinesServiceConfigurationSettingReference;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationSettingReference(String iTStandardsAndGuidelinesServiceConfigurationSettingReference) {
    this.iTStandardsAndGuidelinesServiceConfigurationSettingReference = iTStandardsAndGuidelinesServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return iTStandardsAndGuidelinesServiceConfigurationSettingDescription
  **/

  public String getITStandardsAndGuidelinesServiceConfigurationSettingDescription() {
    return iTStandardsAndGuidelinesServiceConfigurationSettingDescription;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationSettingDescription(String iTStandardsAndGuidelinesServiceConfigurationSettingDescription) {
    this.iTStandardsAndGuidelinesServiceConfigurationSettingDescription = iTStandardsAndGuidelinesServiceConfigurationSettingDescription;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceConfigurationSetup
   * @return iTStandardsAndGuidelinesServiceConfigurationSetup
  **/

  public SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup getITStandardsAndGuidelinesServiceConfigurationSetup() {
    return iTStandardsAndGuidelinesServiceConfigurationSetup;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationSetup(SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup) {
    this.iTStandardsAndGuidelinesServiceConfigurationSetup = iTStandardsAndGuidelinesServiceConfigurationSetup;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceSubscription
   * @return iTStandardsAndGuidelinesServiceSubscription
  **/

  public SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription getITStandardsAndGuidelinesServiceSubscription() {
    return iTStandardsAndGuidelinesServiceSubscription;
  }

  public void setITStandardsAndGuidelinesServiceSubscription(SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription iTStandardsAndGuidelinesServiceSubscription) {
    this.iTStandardsAndGuidelinesServiceSubscription = iTStandardsAndGuidelinesServiceSubscription;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceAgreement
   * @return iTStandardsAndGuidelinesServiceAgreement
  **/

  public SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement getITStandardsAndGuidelinesServiceAgreement() {
    return iTStandardsAndGuidelinesServiceAgreement;
  }

  public void setITStandardsAndGuidelinesServiceAgreement(SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement iTStandardsAndGuidelinesServiceAgreement) {
    this.iTStandardsAndGuidelinesServiceAgreement = iTStandardsAndGuidelinesServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return iTStandardsAndGuidelinesServiceStatus
  **/

  public String getITStandardsAndGuidelinesServiceStatus() {
    return iTStandardsAndGuidelinesServiceStatus;
  }

  public void setITStandardsAndGuidelinesServiceStatus(String iTStandardsAndGuidelinesServiceStatus) {
    this.iTStandardsAndGuidelinesServiceStatus = iTStandardsAndGuidelinesServiceStatus;
  }


}

