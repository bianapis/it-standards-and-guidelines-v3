package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceAnalysis
 */
public class BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceAnalysis   {
  private String developmentToolingandEnvironmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return developmentToolingandEnvironmentInstanceAnalysisReference
  **/

  public String getDevelopmentToolingandEnvironmentInstanceAnalysisReference() {
    return developmentToolingandEnvironmentInstanceAnalysisReference;
  }

  public void setDevelopmentToolingandEnvironmentInstanceAnalysisReference(String developmentToolingandEnvironmentInstanceAnalysisReference) {
    this.developmentToolingandEnvironmentInstanceAnalysisReference = developmentToolingandEnvironmentInstanceAnalysisReference;
  }


}

