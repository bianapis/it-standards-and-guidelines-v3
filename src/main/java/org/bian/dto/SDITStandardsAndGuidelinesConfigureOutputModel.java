package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesConfigureOutputModelITStandardsAndGuidelinesServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesConfigureOutputModel
 */
public class SDITStandardsAndGuidelinesConfigureOutputModel   {
  private String iTStandardsAndGuidelinesConfigurationActionTaskReference = null;

  private Object iTStandardsAndGuidelinesConfigurationActionTaskRecord = null;

  private SDITStandardsAndGuidelinesConfigureOutputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord = null;

  private String iTStandardsAndGuidelinesServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return iTStandardsAndGuidelinesConfigurationActionTaskReference
  **/

  public String getITStandardsAndGuidelinesConfigurationActionTaskReference() {
    return iTStandardsAndGuidelinesConfigurationActionTaskReference;
  }

  public void setITStandardsAndGuidelinesConfigurationActionTaskReference(String iTStandardsAndGuidelinesConfigurationActionTaskReference) {
    this.iTStandardsAndGuidelinesConfigurationActionTaskReference = iTStandardsAndGuidelinesConfigurationActionTaskReference;
  }


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
   * Get iTStandardsAndGuidelinesServiceConfigurationRecord
   * @return iTStandardsAndGuidelinesServiceConfigurationRecord
  **/

  public SDITStandardsAndGuidelinesConfigureOutputModelITStandardsAndGuidelinesServiceConfigurationRecord getITStandardsAndGuidelinesServiceConfigurationRecord() {
    return iTStandardsAndGuidelinesServiceConfigurationRecord;
  }

  public void setITStandardsAndGuidelinesServiceConfigurationRecord(SDITStandardsAndGuidelinesConfigureOutputModelITStandardsAndGuidelinesServiceConfigurationRecord iTStandardsAndGuidelinesServiceConfigurationRecord) {
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

