package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement;
import org.bian.dto.SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup;
import org.bian.dto.SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesConfigureOutputModelITStandardsAndGuidelinesServiceConfigurationRecord
 */
public class SDITStandardsAndGuidelinesConfigureOutputModelITStandardsAndGuidelinesServiceConfigurationRecord   {
  private String iTStandardsAndGuidelinesServiceConfigurationSettingDescription = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription iTStandardsAndGuidelinesServiceSubscription = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement iTStandardsAndGuidelinesServiceAgreement = null;

  private String iTStandardsAndGuidelinesServiceStatus = null;


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

  public SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup getITStandardsAndGuidelinesServiceConfigurationSetup() {
    return iTStandardsAndGuidelinesServiceConfigurationSetup;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationSetup(SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup) {
    this.iTStandardsAndGuidelinesServiceConfigurationSetup = iTStandardsAndGuidelinesServiceConfigurationSetup;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceSubscription
   * @return iTStandardsAndGuidelinesServiceSubscription
  **/

  public SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription getITStandardsAndGuidelinesServiceSubscription() {
    return iTStandardsAndGuidelinesServiceSubscription;
  }

  public void setITStandardsAndGuidelinesServiceSubscription(SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription iTStandardsAndGuidelinesServiceSubscription) {
    this.iTStandardsAndGuidelinesServiceSubscription = iTStandardsAndGuidelinesServiceSubscription;
  }


  /**
   * Get iTStandardsAndGuidelinesServiceAgreement
   * @return iTStandardsAndGuidelinesServiceAgreement
  **/

  public SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement getITStandardsAndGuidelinesServiceAgreement() {
    return iTStandardsAndGuidelinesServiceAgreement;
  }

  public void setITStandardsAndGuidelinesServiceAgreement(SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement iTStandardsAndGuidelinesServiceAgreement) {
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

