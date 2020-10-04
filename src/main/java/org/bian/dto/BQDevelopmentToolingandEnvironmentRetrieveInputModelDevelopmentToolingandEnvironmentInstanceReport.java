package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceReport
 */
public class BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceReport   {
  private String developmentToolingandEnvironmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return developmentToolingandEnvironmentInstanceReportReference
  **/

  public String getDevelopmentToolingandEnvironmentInstanceReportReference() {
    return developmentToolingandEnvironmentInstanceReportReference;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReportReference(String developmentToolingandEnvironmentInstanceReportReference) {
    this.developmentToolingandEnvironmentInstanceReportReference = developmentToolingandEnvironmentInstanceReportReference;
  }


}

