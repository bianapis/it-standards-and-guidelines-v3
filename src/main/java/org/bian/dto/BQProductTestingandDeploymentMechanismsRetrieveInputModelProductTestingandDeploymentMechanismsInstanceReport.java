package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceReport
 */
public class BQProductTestingandDeploymentMechanismsRetrieveInputModelProductTestingandDeploymentMechanismsInstanceReport   {
  private String productTestingandDeploymentMechanismsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productTestingandDeploymentMechanismsInstanceReportReference
  **/

  public String getProductTestingandDeploymentMechanismsInstanceReportReference() {
    return productTestingandDeploymentMechanismsInstanceReportReference;
  }

  public void setProductTestingandDeploymentMechanismsInstanceReportReference(String productTestingandDeploymentMechanismsInstanceReportReference) {
    this.productTestingandDeploymentMechanismsInstanceReportReference = productTestingandDeploymentMechanismsInstanceReportReference;
  }


}

