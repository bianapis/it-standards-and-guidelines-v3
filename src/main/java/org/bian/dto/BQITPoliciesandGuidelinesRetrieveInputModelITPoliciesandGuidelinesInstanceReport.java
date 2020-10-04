package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceReport
 */
public class BQITPoliciesandGuidelinesRetrieveInputModelITPoliciesandGuidelinesInstanceReport   {
  private String iTPoliciesandGuidelinesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return iTPoliciesandGuidelinesInstanceReportReference
  **/

  public String getITPoliciesandGuidelinesInstanceReportReference() {
    return iTPoliciesandGuidelinesInstanceReportReference;
  }

  public void setITPoliciesandGuidelinesInstanceReportReference(String iTPoliciesandGuidelinesInstanceReportReference) {
    this.iTPoliciesandGuidelinesInstanceReportReference = iTPoliciesandGuidelinesInstanceReportReference;
  }


}

