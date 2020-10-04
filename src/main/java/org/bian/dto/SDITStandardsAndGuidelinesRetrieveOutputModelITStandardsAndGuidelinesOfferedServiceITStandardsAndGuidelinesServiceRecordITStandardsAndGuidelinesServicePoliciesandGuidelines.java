package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecordITStandardsAndGuidelinesServicePoliciesandGuidelines
 */
public class SDITStandardsAndGuidelinesRetrieveOutputModelITStandardsAndGuidelinesOfferedServiceITStandardsAndGuidelinesServiceRecordITStandardsAndGuidelinesServicePoliciesandGuidelines   {
  private String iTStandardsAndGuidelinesServiceEligibility = null;

  private String iTStandardsAndGuidelinesServiceIntendedUses = null;

  private String iTStandardsAndGuidelinesServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return iTStandardsAndGuidelinesServiceEligibility
  **/

  public String getITStandardsAndGuidelinesServiceEligibility() {
    return iTStandardsAndGuidelinesServiceEligibility;
  }

  public void setITStandardsAndGuidelinesServiceEligibility(String iTStandardsAndGuidelinesServiceEligibility) {
    this.iTStandardsAndGuidelinesServiceEligibility = iTStandardsAndGuidelinesServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return iTStandardsAndGuidelinesServiceIntendedUses
  **/

  public String getITStandardsAndGuidelinesServiceIntendedUses() {
    return iTStandardsAndGuidelinesServiceIntendedUses;
  }

  public void setITStandardsAndGuidelinesServiceIntendedUses(String iTStandardsAndGuidelinesServiceIntendedUses) {
    this.iTStandardsAndGuidelinesServiceIntendedUses = iTStandardsAndGuidelinesServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return iTStandardsAndGuidelinesServicePricingandTerms
  **/

  public String getITStandardsAndGuidelinesServicePricingandTerms() {
    return iTStandardsAndGuidelinesServicePricingandTerms;
  }

  public void setITStandardsAndGuidelinesServicePricingandTerms(String iTStandardsAndGuidelinesServicePricingandTerms) {
    this.iTStandardsAndGuidelinesServicePricingandTerms = iTStandardsAndGuidelinesServicePricingandTerms;
  }


}

