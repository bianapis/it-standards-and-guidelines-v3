package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceReport
 */
public class BQProductionEnvironmentandSupportServicesRetrieveInputModelProductionEnvironmentandSupportServicesInstanceReport   {
  private String productionEnvironmentandSupportServicesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productionEnvironmentandSupportServicesInstanceReportReference
  **/

  public String getProductionEnvironmentandSupportServicesInstanceReportReference() {
    return productionEnvironmentandSupportServicesInstanceReportReference;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReportReference(String productionEnvironmentandSupportServicesInstanceReportReference) {
    this.productionEnvironmentandSupportServicesInstanceReportReference = productionEnvironmentandSupportServicesInstanceReportReference;
  }


}

