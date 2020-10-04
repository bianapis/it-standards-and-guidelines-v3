package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceAnalysis
 */
public class BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceAnalysis   {
  private String iTPoliciesandGuidelinesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return iTPoliciesandGuidelinesInstanceAnalysisReference
  **/

  public String getITPoliciesandGuidelinesInstanceAnalysisReference() {
    return iTPoliciesandGuidelinesInstanceAnalysisReference;
  }

  public void setITPoliciesandGuidelinesInstanceAnalysisReference(String iTPoliciesandGuidelinesInstanceAnalysisReference) {
    this.iTPoliciesandGuidelinesInstanceAnalysisReference = iTPoliciesandGuidelinesInstanceAnalysisReference;
  }


}

