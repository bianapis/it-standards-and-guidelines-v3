package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecordITStandardsAndGuidelinesServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecord
 */
public class SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecord   {
  private String iTStandardsAndGuidelinesServiceType = null;

  private String iTStandardsAndGuidelinesServiceVersion = null;

  private String iTStandardsAndGuidelinesServiceDescription = null;

  private SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecordITStandardsAndGuidelinesServicePoliciesandGuidelines iTStandardsAndGuidelinesServicePoliciesandGuidelines = null;

  private String iTStandardsAndGuidelinesServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return iTStandardsAndGuidelinesServiceType
  **/

  public String getITStandardsAndGuidelinesServiceType() {
    return iTStandardsAndGuidelinesServiceType;
  }

  public void setITStandardsAndGuidelinesServiceType(String iTStandardsAndGuidelinesServiceType) {
    this.iTStandardsAndGuidelinesServiceType = iTStandardsAndGuidelinesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return iTStandardsAndGuidelinesServiceVersion
  **/

  public String getITStandardsAndGuidelinesServiceVersion() {
    return iTStandardsAndGuidelinesServiceVersion;
  }

  public void setITStandardsAndGuidelinesServiceVersion(String iTStandardsAndGuidelinesServiceVersion) {
    this.iTStandardsAndGuidelinesServiceVersion = iTStandardsAndGuidelinesServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return iTStandardsAndGuidelinesServiceDescription
  **/

  public String getITStandardsAndGuidelinesServiceDescription() {
    return iTStandardsAndGuidelinesServiceDescription;
  }

  public void setITStandardsAndGuidelinesServiceDescription(String iTStandardsAndGuidelinesServiceDescription) {
    this.iTStandardsAndGuidelinesServiceDescription = iTStandardsAndGuidelinesServiceDescription;
  }


  /**
   * Get iTStandardsAndGuidelinesServicePoliciesandGuidelines
   * @return iTStandardsAndGuidelinesServicePoliciesandGuidelines
  **/

  public SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecordITStandardsAndGuidelinesServicePoliciesandGuidelines getITStandardsAndGuidelinesServicePoliciesandGuidelines() {
    return iTStandardsAndGuidelinesServicePoliciesandGuidelines;
  }

  public void setITStandardsAndGuidelinesServicePoliciesandGuidelines(SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecordITStandardsAndGuidelinesServicePoliciesandGuidelines iTStandardsAndGuidelinesServicePoliciesandGuidelines) {
    this.iTStandardsAndGuidelinesServicePoliciesandGuidelines = iTStandardsAndGuidelinesServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return iTStandardsAndGuidelinesServiceSchedule
  **/

  public String getITStandardsAndGuidelinesServiceSchedule() {
    return iTStandardsAndGuidelinesServiceSchedule;
  }

  public void setITStandardsAndGuidelinesServiceSchedule(String iTStandardsAndGuidelinesServiceSchedule) {
    this.iTStandardsAndGuidelinesServiceSchedule = iTStandardsAndGuidelinesServiceSchedule;
  }


}

