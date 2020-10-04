package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionPlatformsandInfrastructureInitiateOutputModel
 */
public class BQProductionPlatformsandInfrastructureInitiateOutputModel   {
  private String productionPlatformsandInfrastructureInstanceReference = null;

  private String productionPlatformsandInfrastructureInitiateActionReference = null;

  private Object productionPlatformsandInfrastructureInitiateActionRecord = null;

  private String productionPlatformsandInfrastructureInstanceStatus = null;

  private String productionPlatformsandInfrastructurePreconditions = null;

  private String productionPlatformsandInfrastructureSpecificationSchedule = null;

  private String productionPlatformsandInfrastructureVersionNumber = null;

  private String productionPlatformsandInfrastructure = null;

  private String productionPlatformsandInfrastructureServiceType = null;

  private String productionPlatformsandInfrastructureServiceDescription = null;

  private String productionPlatformsandInfrastructureServiceInputsandOuputs = null;

  private String productionPlatformsandInfrastructureServiceWorkProduct = null;

  private String productionPlatformsandInfrastructureServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Platforms and Infrastructure instance 
   * @return productionPlatformsandInfrastructureInstanceReference
  **/

  public String getProductionPlatformsandInfrastructureInstanceReference() {
    return productionPlatformsandInfrastructureInstanceReference;
  }

  public void setProductionPlatformsandInfrastructureInstanceReference(String productionPlatformsandInfrastructureInstanceReference) {
    this.productionPlatformsandInfrastructureInstanceReference = productionPlatformsandInfrastructureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productionPlatformsandInfrastructureInitiateActionReference
  **/

  public String getProductionPlatformsandInfrastructureInitiateActionReference() {
    return productionPlatformsandInfrastructureInitiateActionReference;
  }

  public void setProductionPlatformsandInfrastructureInitiateActionReference(String productionPlatformsandInfrastructureInitiateActionReference) {
    this.productionPlatformsandInfrastructureInitiateActionReference = productionPlatformsandInfrastructureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productionPlatformsandInfrastructureInitiateActionRecord
  **/

  public Object getProductionPlatformsandInfrastructureInitiateActionRecord() {
    return productionPlatformsandInfrastructureInitiateActionRecord;
  }

  public void setProductionPlatformsandInfrastructureInitiateActionRecord(Object productionPlatformsandInfrastructureInitiateActionRecord) {
    this.productionPlatformsandInfrastructureInitiateActionRecord = productionPlatformsandInfrastructureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Production Platforms and Infrastructure instance (e.g. initialised, pending, active) 
   * @return productionPlatformsandInfrastructureInstanceStatus
  **/

  public String getProductionPlatformsandInfrastructureInstanceStatus() {
    return productionPlatformsandInfrastructureInstanceStatus;
  }

  public void setProductionPlatformsandInfrastructureInstanceStatus(String productionPlatformsandInfrastructureInstanceStatus) {
    this.productionPlatformsandInfrastructureInstanceStatus = productionPlatformsandInfrastructureInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return productionPlatformsandInfrastructurePreconditions
  **/

  public String getProductionPlatformsandInfrastructurePreconditions() {
    return productionPlatformsandInfrastructurePreconditions;
  }

  public void setProductionPlatformsandInfrastructurePreconditions(String productionPlatformsandInfrastructurePreconditions) {
    this.productionPlatformsandInfrastructurePreconditions = productionPlatformsandInfrastructurePreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return productionPlatformsandInfrastructureSpecificationSchedule
  **/

  public String getProductionPlatformsandInfrastructureSpecificationSchedule() {
    return productionPlatformsandInfrastructureSpecificationSchedule;
  }

  public void setProductionPlatformsandInfrastructureSpecificationSchedule(String productionPlatformsandInfrastructureSpecificationSchedule) {
    this.productionPlatformsandInfrastructureSpecificationSchedule = productionPlatformsandInfrastructureSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return productionPlatformsandInfrastructureVersionNumber
  **/

  public String getProductionPlatformsandInfrastructureVersionNumber() {
    return productionPlatformsandInfrastructureVersionNumber;
  }

  public void setProductionPlatformsandInfrastructureVersionNumber(String productionPlatformsandInfrastructureVersionNumber) {
    this.productionPlatformsandInfrastructureVersionNumber = productionPlatformsandInfrastructureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Technology Standards Specification specific Business Service 
   * @return productionPlatformsandInfrastructure
  **/

  public String getProductionPlatformsandInfrastructure() {
    return productionPlatformsandInfrastructure;
  }

  public void setProductionPlatformsandInfrastructure(String productionPlatformsandInfrastructure) {
    this.productionPlatformsandInfrastructure = productionPlatformsandInfrastructure;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return productionPlatformsandInfrastructureServiceType
  **/

  public String getProductionPlatformsandInfrastructureServiceType() {
    return productionPlatformsandInfrastructureServiceType;
  }

  public void setProductionPlatformsandInfrastructureServiceType(String productionPlatformsandInfrastructureServiceType) {
    this.productionPlatformsandInfrastructureServiceType = productionPlatformsandInfrastructureServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return productionPlatformsandInfrastructureServiceDescription
  **/

  public String getProductionPlatformsandInfrastructureServiceDescription() {
    return productionPlatformsandInfrastructureServiceDescription;
  }

  public void setProductionPlatformsandInfrastructureServiceDescription(String productionPlatformsandInfrastructureServiceDescription) {
    this.productionPlatformsandInfrastructureServiceDescription = productionPlatformsandInfrastructureServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return productionPlatformsandInfrastructureServiceInputsandOuputs
  **/

  public String getProductionPlatformsandInfrastructureServiceInputsandOuputs() {
    return productionPlatformsandInfrastructureServiceInputsandOuputs;
  }

  public void setProductionPlatformsandInfrastructureServiceInputsandOuputs(String productionPlatformsandInfrastructureServiceInputsandOuputs) {
    this.productionPlatformsandInfrastructureServiceInputsandOuputs = productionPlatformsandInfrastructureServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return productionPlatformsandInfrastructureServiceWorkProduct
  **/

  public String getProductionPlatformsandInfrastructureServiceWorkProduct() {
    return productionPlatformsandInfrastructureServiceWorkProduct;
  }

  public void setProductionPlatformsandInfrastructureServiceWorkProduct(String productionPlatformsandInfrastructureServiceWorkProduct) {
    this.productionPlatformsandInfrastructureServiceWorkProduct = productionPlatformsandInfrastructureServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return productionPlatformsandInfrastructureServiceName
  **/

  public String getProductionPlatformsandInfrastructureServiceName() {
    return productionPlatformsandInfrastructureServiceName;
  }

  public void setProductionPlatformsandInfrastructureServiceName(String productionPlatformsandInfrastructureServiceName) {
    this.productionPlatformsandInfrastructureServiceName = productionPlatformsandInfrastructureServiceName;
  }


}

