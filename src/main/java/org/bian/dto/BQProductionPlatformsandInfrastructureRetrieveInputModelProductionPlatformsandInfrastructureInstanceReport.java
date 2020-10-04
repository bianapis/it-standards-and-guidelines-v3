package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceReport
 */
public class BQProductionPlatformsandInfrastructureRetrieveInputModelProductionPlatformsandInfrastructureInstanceReport   {
  private String productionPlatformsandInfrastructureInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productionPlatformsandInfrastructureInstanceReportReference
  **/

  public String getProductionPlatformsandInfrastructureInstanceReportReference() {
    return productionPlatformsandInfrastructureInstanceReportReference;
  }

  public void setProductionPlatformsandInfrastructureInstanceReportReference(String productionPlatformsandInfrastructureInstanceReportReference) {
    this.productionPlatformsandInfrastructureInstanceReportReference = productionPlatformsandInfrastructureInstanceReportReference;
  }


}

