package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement
 */
public class SDITStandardsAndGuidelinesActivateOutputModelITStandardsAndGuidelinesServiceConfigurationRecordITStandardsAndGuidelinesServiceAgreement   {
  private String iTStandardsAndGuidelinesServiceAgreementReference = null;

  private String iTStandardsAndGuidelinesServiceUserReference = null;

  private String iTStandardsAndGuidelinesServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return iTStandardsAndGuidelinesServiceAgreementReference
  **/

  public String getITStandardsAndGuidelinesServiceAgreementReference() {
    return iTStandardsAndGuidelinesServiceAgreementReference;
  }

  public void setITStandardsAndGuidelinesServiceAgreementReference(String iTStandardsAndGuidelinesServiceAgreementReference) {
    this.iTStandardsAndGuidelinesServiceAgreementReference = iTStandardsAndGuidelinesServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return iTStandardsAndGuidelinesServiceUserReference
  **/

  public String getITStandardsAndGuidelinesServiceUserReference() {
    return iTStandardsAndGuidelinesServiceUserReference;
  }

  public void setITStandardsAndGuidelinesServiceUserReference(String iTStandardsAndGuidelinesServiceUserReference) {
    this.iTStandardsAndGuidelinesServiceUserReference = iTStandardsAndGuidelinesServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return iTStandardsAndGuidelinesServiceAgreementTermsandConditions
  **/

  public String getITStandardsAndGuidelinesServiceAgreementTermsandConditions() {
    return iTStandardsAndGuidelinesServiceAgreementTermsandConditions;
  }

  public void setITStandardsAndGuidelinesServiceAgreementTermsandConditions(String iTStandardsAndGuidelinesServiceAgreementTermsandConditions) {
    this.iTStandardsAndGuidelinesServiceAgreementTermsandConditions = iTStandardsAndGuidelinesServiceAgreementTermsandConditions;
  }


}

