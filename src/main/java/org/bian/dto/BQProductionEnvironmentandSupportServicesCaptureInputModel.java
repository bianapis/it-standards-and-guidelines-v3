package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTechnologyStandardsSpecificationCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQProductionEnvironmentandSupportServicesCaptureInputModel
 */
public class BQProductionEnvironmentandSupportServicesCaptureInputModel   {
  private String technologyStandardsSpecificationInstanceReference = null;

  private String productionEnvironmentandSupportServicesInstanceReference = null;

  private String productionEnvironmentandSupportServicesPreconditions = null;

  private String productionEnvironmentandSupportServicesSpecificationSchedule = null;

  private String productionEnvironmentandSupportServicesVersionNumber = null;

  private String productionEnvironmentandSupportServices = null;

  private String productionEnvironmentandSupportServicesServiceType = null;

  private String productionEnvironmentandSupportServicesServiceDescription = null;

  private String productionEnvironmentandSupportServicesServiceInputsandOuputs = null;

  private String productionEnvironmentandSupportServicesServiceWorkProduct = null;

  private Object productionEnvironmentandSupportServicesCaptureActionTaskRecord = null;

  private CRTechnologyStandardsSpecificationCaptureInputModelCaptureRecordType captureRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Production Environment and Support Services instance 
   * @return productionEnvironmentandSupportServicesInstanceReference
  **/

  public String getProductionEnvironmentandSupportServicesInstanceReference() {
    return productionEnvironmentandSupportServicesInstanceReference;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReference(String productionEnvironmentandSupportServicesInstanceReference) {
    this.productionEnvironmentandSupportServicesInstanceReference = productionEnvironmentandSupportServicesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the specification aspect can be defined 
   * @return productionEnvironmentandSupportServicesPreconditions
  **/

  public String getProductionEnvironmentandSupportServicesPreconditions() {
    return productionEnvironmentandSupportServicesPreconditions;
  }

  public void setProductionEnvironmentandSupportServicesPreconditions(String productionEnvironmentandSupportServicesPreconditions) {
    this.productionEnvironmentandSupportServicesPreconditions = productionEnvironmentandSupportServicesPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of the definition and update/revisions of the specification aspect 
   * @return productionEnvironmentandSupportServicesSpecificationSchedule
  **/

  public String getProductionEnvironmentandSupportServicesSpecificationSchedule() {
    return productionEnvironmentandSupportServicesSpecificationSchedule;
  }

  public void setProductionEnvironmentandSupportServicesSpecificationSchedule(String productionEnvironmentandSupportServicesSpecificationSchedule) {
    this.productionEnvironmentandSupportServicesSpecificationSchedule = productionEnvironmentandSupportServicesSpecificationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current version, and version history as appropriate for the specification aspect 
   * @return productionEnvironmentandSupportServicesVersionNumber
  **/

  public String getProductionEnvironmentandSupportServicesVersionNumber() {
    return productionEnvironmentandSupportServicesVersionNumber;
  }

  public void setProductionEnvironmentandSupportServicesVersionNumber(String productionEnvironmentandSupportServicesVersionNumber) {
    this.productionEnvironmentandSupportServicesVersionNumber = productionEnvironmentandSupportServicesVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Technology Standards Specification specific Business Service 
   * @return productionEnvironmentandSupportServices
  **/

  public String getProductionEnvironmentandSupportServices() {
    return productionEnvironmentandSupportServices;
  }

  public void setProductionEnvironmentandSupportServices(String productionEnvironmentandSupportServices) {
    this.productionEnvironmentandSupportServices = productionEnvironmentandSupportServices;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return productionEnvironmentandSupportServicesServiceType
  **/

  public String getProductionEnvironmentandSupportServicesServiceType() {
    return productionEnvironmentandSupportServicesServiceType;
  }

  public void setProductionEnvironmentandSupportServicesServiceType(String productionEnvironmentandSupportServicesServiceType) {
    this.productionEnvironmentandSupportServicesServiceType = productionEnvironmentandSupportServicesServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return productionEnvironmentandSupportServicesServiceDescription
  **/

  public String getProductionEnvironmentandSupportServicesServiceDescription() {
    return productionEnvironmentandSupportServicesServiceDescription;
  }

  public void setProductionEnvironmentandSupportServicesServiceDescription(String productionEnvironmentandSupportServicesServiceDescription) {
    this.productionEnvironmentandSupportServicesServiceDescription = productionEnvironmentandSupportServicesServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return productionEnvironmentandSupportServicesServiceInputsandOuputs
  **/

  public String getProductionEnvironmentandSupportServicesServiceInputsandOuputs() {
    return productionEnvironmentandSupportServicesServiceInputsandOuputs;
  }

  public void setProductionEnvironmentandSupportServicesServiceInputsandOuputs(String productionEnvironmentandSupportServicesServiceInputsandOuputs) {
    this.productionEnvironmentandSupportServicesServiceInputsandOuputs = productionEnvironmentandSupportServicesServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return productionEnvironmentandSupportServicesServiceWorkProduct
  **/

  public String getProductionEnvironmentandSupportServicesServiceWorkProduct() {
    return productionEnvironmentandSupportServicesServiceWorkProduct;
  }

  public void setProductionEnvironmentandSupportServicesServiceWorkProduct(String productionEnvironmentandSupportServicesServiceWorkProduct) {
    this.productionEnvironmentandSupportServicesServiceWorkProduct = productionEnvironmentandSupportServicesServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return productionEnvironmentandSupportServicesCaptureActionTaskRecord
  **/

  public Object getProductionEnvironmentandSupportServicesCaptureActionTaskRecord() {
    return productionEnvironmentandSupportServicesCaptureActionTaskRecord;
  }

  public void setProductionEnvironmentandSupportServicesCaptureActionTaskRecord(Object productionEnvironmentandSupportServicesCaptureActionTaskRecord) {
    this.productionEnvironmentandSupportServicesCaptureActionTaskRecord = productionEnvironmentandSupportServicesCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRTechnologyStandardsSpecificationCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRTechnologyStandardsSpecificationCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

