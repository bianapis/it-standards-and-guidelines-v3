package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionPlatformsandInfrastructureRequestOutputModel
 */
public class BQProductionPlatformsandInfrastructureRequestOutputModel   {
  private String productionPlatformsandInfrastructurePreconditions = null;

  private String productionPlatformsandInfrastructureSpecificationSchedule = null;

  private String productionPlatformsandInfrastructureVersionNumber = null;

  private String productionPlatformsandInfrastructure = null;

  private String productionPlatformsandInfrastructureServiceType = null;

  private String productionPlatformsandInfrastructureServiceDescription = null;

  private String productionPlatformsandInfrastructureServiceInputsandOuputs = null;

  private String productionPlatformsandInfrastructureServiceWorkProduct = null;

  private String productionPlatformsandInfrastructureServiceName = null;

  private String productionPlatformsandInfrastructureRequestActionTaskReference = null;

  private Object productionPlatformsandInfrastructureRequestActionTaskRecord = null;

  private String productionPlatformsandInfrastructureRequestRecordReference = null;

  private Object requestResponseRecord = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Platforms and Infrastructure instance request service call 
   * @return productionPlatformsandInfrastructureRequestActionTaskReference
  **/

  public String getProductionPlatformsandInfrastructureRequestActionTaskReference() {
    return productionPlatformsandInfrastructureRequestActionTaskReference;
  }

  public void setProductionPlatformsandInfrastructureRequestActionTaskReference(String productionPlatformsandInfrastructureRequestActionTaskReference) {
    this.productionPlatformsandInfrastructureRequestActionTaskReference = productionPlatformsandInfrastructureRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return productionPlatformsandInfrastructureRequestActionTaskRecord
  **/

  public Object getProductionPlatformsandInfrastructureRequestActionTaskRecord() {
    return productionPlatformsandInfrastructureRequestActionTaskRecord;
  }

  public void setProductionPlatformsandInfrastructureRequestActionTaskRecord(Object productionPlatformsandInfrastructureRequestActionTaskRecord) {
    this.productionPlatformsandInfrastructureRequestActionTaskRecord = productionPlatformsandInfrastructureRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Platforms and Infrastructure service request record 
   * @return productionPlatformsandInfrastructureRequestRecordReference
  **/

  public String getProductionPlatformsandInfrastructureRequestRecordReference() {
    return productionPlatformsandInfrastructureRequestRecordReference;
  }

  public void setProductionPlatformsandInfrastructureRequestRecordReference(String productionPlatformsandInfrastructureRequestRecordReference) {
    this.productionPlatformsandInfrastructureRequestRecordReference = productionPlatformsandInfrastructureRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}
