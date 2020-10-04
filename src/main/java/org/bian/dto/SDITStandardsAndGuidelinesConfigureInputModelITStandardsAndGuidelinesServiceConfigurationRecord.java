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
 * SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecord
 */
public class SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecord   {
  private String iTStandardsAndGuidelinesServiceConfigurationSettingReference = null;

  private String iTStandardsAndGuidelinesServiceConfigurationSettingType = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceSubscription iTStandardsAndGuidelinesServiceSubscription = null;

  private SDITStandardsAndGuidelinesConfigureInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement iTStandardsAndGuidelinesServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return iTStandardsAndGuidelinesServiceConfigurationSettingType
  **/

  public String getITStandardsAndGuidelinesServiceConfigurationSettingType() {
    return iTStandardsAndGuidelinesServiceConfigurationSettingType;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationSettingType(String iTStandardsAndGuidelinesServiceConfigurationSettingType) {
    this.iTStandardsAndGuidelinesServiceConfigurationSettingType = iTStandardsAndGuidelinesServiceConfigurationSettingType;
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


}

