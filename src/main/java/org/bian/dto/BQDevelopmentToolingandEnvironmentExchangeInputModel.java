package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTechnologyStandardsSpecificationExchangeInputModelTechnologyStandardsSpecificationExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQDevelopmentToolingandEnvironmentExchangeInputModel
 */
public class BQDevelopmentToolingandEnvironmentExchangeInputModel   {
  private String technologyStandardsSpecificationInstanceReference = null;

  private String developmentToolingandEnvironmentInstanceReference = null;

  private String developmentToolingandEnvironmentPreconditions = null;

  private String developmentToolingandEnvironmentSpecificationSchedule = null;

  private String developmentToolingandEnvironmentVersionNumber = null;

  private String developmentToolingandEnvironment = null;

  private String developmentToolingandEnvironmentServiceType = null;

  private String developmentToolingandEnvironmentServiceDescription = null;

  private String developmentToolingandEnvironmentServiceInputsandOuputs = null;

  private String developmentToolingandEnvironmentServiceWorkProduct = null;

  private String developmentToolingandEnvironmentServiceName = null;

  private Object developmentToolingandEnvironmentExchangeActionTaskRecord = null;

  private CRTechnologyStandardsSpecificationExchangeInputModelTechnologyStandardsSpecificationExchangeActionRequest developmentToolingandEnvironmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Technology Standards Specification instance 
   * @return technologyStandardsSpecificationInstanceReference
  **/

  public String getTechnologyStandardsSpecificationInstanceReference() {
    return technologyStandardsSpecificationInstanceReference;
  }

  public void setTechnologyStandardsSpecificationInstanceReference(String technologyStandardsSpecificationInstanceReference) {
    this.technologyStandardsSpecificationInstanceReference = technologyStandardsSpecificationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Development Tooling and Environment instance 
   * @return developmentToolingandEnvironmentInstanceReference
  **/

  public String getDevelopmentToolingandEnvironmentInstanceReference() {
    return developmentToolingandEnvironmentInstanceReference;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReference(String developmentToolingandEnvironmentInstanceReference) {
    this.developmentToolingandEnvironmentInstanceReference = developmentToolingandEnvironmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return developmentToolingandEnvironmentPreconditions
  **/

  public String getDevelopmentToolingandEnvironmentPreconditions() {
    return developmentToolingandEnvironmentPreconditions;
  }

  public void setDevelopmentToolingandEnvironmentPreconditions(String developmentToolingandEnvironmentPreconditions) {
    this.developmentToolingandEnvironmentPreconditions = developmentToolingandEnvironmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return developmentToolingandEnvironmentSpecificationSchedule
  **/

  public String getDevelopmentToolingandEnvironmentSpecificationSchedule() {
    return developmentToolingandEnvironmentSpecificationSchedule;
  }

  public void setDevelopmentToolingandEnvironmentSpecificationSchedule(String developmentToolingandEnvironmentSpecificationSchedule) {
    this.developmentToolingandEnvironmentSpecificationSchedule = developmentToolingandEnvironmentSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return developmentToolingandEnvironmentVersionNumber
  **/

  public String getDevelopmentToolingandEnvironmentVersionNumber() {
    return developmentToolingandEnvironmentVersionNumber;
  }

  public void setDevelopmentToolingandEnvironmentVersionNumber(String developmentToolingandEnvironmentVersionNumber) {
    this.developmentToolingandEnvironmentVersionNumber = developmentToolingandEnvironmentVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Technology Standards Specification specific Business Service 
   * @return developmentToolingandEnvironment
  **/

  public String getDevelopmentToolingandEnvironment() {
    return developmentToolingandEnvironment;
  }

  public void setDevelopmentToolingandEnvironment(String developmentToolingandEnvironment) {
    this.developmentToolingandEnvironment = developmentToolingandEnvironment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return developmentToolingandEnvironmentServiceType
  **/

  public String getDevelopmentToolingandEnvironmentServiceType() {
    return developmentToolingandEnvironmentServiceType;
  }

  public void setDevelopmentToolingandEnvironmentServiceType(String developmentToolingandEnvironmentServiceType) {
    this.developmentToolingandEnvironmentServiceType = developmentToolingandEnvironmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return developmentToolingandEnvironmentServiceDescription
  **/

  public String getDevelopmentToolingandEnvironmentServiceDescription() {
    return developmentToolingandEnvironmentServiceDescription;
  }

  public void setDevelopmentToolingandEnvironmentServiceDescription(String developmentToolingandEnvironmentServiceDescription) {
    this.developmentToolingandEnvironmentServiceDescription = developmentToolingandEnvironmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return developmentToolingandEnvironmentServiceInputsandOuputs
  **/

  public String getDevelopmentToolingandEnvironmentServiceInputsandOuputs() {
    return developmentToolingandEnvironmentServiceInputsandOuputs;
  }

  public void setDevelopmentToolingandEnvironmentServiceInputsandOuputs(String developmentToolingandEnvironmentServiceInputsandOuputs) {
    this.developmentToolingandEnvironmentServiceInputsandOuputs = developmentToolingandEnvironmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return developmentToolingandEnvironmentServiceWorkProduct
  **/

  public String getDevelopmentToolingandEnvironmentServiceWorkProduct() {
    return developmentToolingandEnvironmentServiceWorkProduct;
  }

  public void setDevelopmentToolingandEnvironmentServiceWorkProduct(String developmentToolingandEnvironmentServiceWorkProduct) {
    this.developmentToolingandEnvironmentServiceWorkProduct = developmentToolingandEnvironmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return developmentToolingandEnvironmentServiceName
  **/

  public String getDevelopmentToolingandEnvironmentServiceName() {
    return developmentToolingandEnvironmentServiceName;
  }

  public void setDevelopmentToolingandEnvironmentServiceName(String developmentToolingandEnvironmentServiceName) {
    this.developmentToolingandEnvironmentServiceName = developmentToolingandEnvironmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return developmentToolingandEnvironmentExchangeActionTaskRecord
  **/

  public Object getDevelopmentToolingandEnvironmentExchangeActionTaskRecord() {
    return developmentToolingandEnvironmentExchangeActionTaskRecord;
  }

  public void setDevelopmentToolingandEnvironmentExchangeActionTaskRecord(Object developmentToolingandEnvironmentExchangeActionTaskRecord) {
    this.developmentToolingandEnvironmentExchangeActionTaskRecord = developmentToolingandEnvironmentExchangeActionTaskRecord;
  }


  /**
   * Get developmentToolingandEnvironmentExchangeActionRequest
   * @return developmentToolingandEnvironmentExchangeActionRequest
  **/

  public CRTechnologyStandardsSpecificationExchangeInputModelTechnologyStandardsSpecificationExchangeActionRequest getDevelopmentToolingandEnvironmentExchangeActionRequest() {
    return developmentToolingandEnvironmentExchangeActionRequest;
  }

  public void setDevelopmentToolingandEnvironmentExchangeActionRequest(CRTechnologyStandardsSpecificationExchangeInputModelTechnologyStandardsSpecificationExchangeActionRequest developmentToolingandEnvironmentExchangeActionRequest) {
    this.developmentToolingandEnvironmentExchangeActionRequest = developmentToolingandEnvironmentExchangeActionRequest;
  }


}

