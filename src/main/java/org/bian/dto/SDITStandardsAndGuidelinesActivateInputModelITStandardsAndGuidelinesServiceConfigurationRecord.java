package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecord
 */
public class SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecord   {
  private String iTStandardsAndGuidelinesServiceConfigurationSettingReference = null;

  private String iTStandardsAndGuidelinesServiceConfigurationSettingType = null;

  private SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup = null;


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

  public SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup getITStandardsAndGuidelinesServiceConfigurationSetup() {
    return iTStandardsAndGuidelinesServiceConfigurationSetup;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationSetup(SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceConfigurationSetup iTStandardsAndGuidelinesServiceConfigurationSetup) {
    this.iTStandardsAndGuidelinesServiceConfigurationSetup = iTStandardsAndGuidelinesServiceConfigurationSetup;
  }


}

