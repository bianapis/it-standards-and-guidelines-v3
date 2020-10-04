package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesActivateInputModel
 */
public class SDITStandardsAndGuidelinesActivateInputModel   {
  private Object iTStandardsAndGuidelinesActivationActionTaskRecord = null;

  private String iTStandardsAndGuidelinesCenterReference = null;

  private String iTStandardsAndGuidelinesServiceReference = null;

  private SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return iTStandardsAndGuidelinesCenterReference
  **/

  public String getITStandardsAndGuidelinesCenterReference() {
    return iTStandardsAndGuidelinesCenterReference;
  }

  public void setITStandardsAndGuidelinesCenterReference(String iTStandardsAndGuidelinesCenterReference) {
    this.iTStandardsAndGuidelinesCenterReference = iTStandardsAndGuidelinesCenterReference;
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

  public SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecord getITStandardsAndGuidelinesServiceConfigurationRecord() {
    return iTStandardsAndGuidelinesServiceConfigurationRecord;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationRecord(SDITStandardsAndGuidelinesActivateInputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord) {
    this.iTStandardsAndGuidelinesServiceConfigurationRecord = iTStandardsAndGuidelinesServiceConfigurationRecord;
  }


}

