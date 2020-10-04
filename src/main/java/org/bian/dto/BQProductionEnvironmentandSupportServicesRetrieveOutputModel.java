package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceAnalysis;
import org.bian.dto.BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductionEnvironmentandSupportServicesRetrieveOutputModel
 */
public class BQProductionEnvironmentandSupportServicesRetrieveOutputModel   {
  private String productionEnvironmentandSupportServicesPreconditions = null;

  private String productionEnvironmentandSupportServicesSpecificationSchedule = null;

  private String productionEnvironmentandSupportServicesVersionNumber = null;

  private String productionEnvironmentandSupportServices = null;

  private String productionEnvironmentandSupportServicesServiceType = null;

  private String productionEnvironmentandSupportServicesServiceDescription = null;

  private String productionEnvironmentandSupportServicesServiceInputsandOuputs = null;

  private String productionEnvironmentandSupportServicesServiceWorkProduct = null;

  private String productionEnvironmentandSupportServicesRetrieveActionTaskReference = null;

  private Object productionEnvironmentandSupportServicesRetrieveActionTaskRecord = null;

  private String productionEnvironmentandSupportServicesRetrieveActionResponse = null;

  private BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceReport productionEnvironmentandSupportServicesInstanceReport = null;

  private BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceAnalysis productionEnvironmentandSupportServicesInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Production Environment and Support Services instance retrieve service call 
   * @return productionEnvironmentandSupportServicesRetrieveActionTaskReference
  **/

  public String getProductionEnvironmentandSupportServicesRetrieveActionTaskReference() {
    return productionEnvironmentandSupportServicesRetrieveActionTaskReference;
  }

  public void setProductionEnvironmentandSupportServicesRetrieveActionTaskReference(String productionEnvironmentandSupportServicesRetrieveActionTaskReference) {
    this.productionEnvironmentandSupportServicesRetrieveActionTaskReference = productionEnvironmentandSupportServicesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productionEnvironmentandSupportServicesRetrieveActionTaskRecord
  **/

  public Object getProductionEnvironmentandSupportServicesRetrieveActionTaskRecord() {
    return productionEnvironmentandSupportServicesRetrieveActionTaskRecord;
  }

  public void setProductionEnvironmentandSupportServicesRetrieveActionTaskRecord(Object productionEnvironmentandSupportServicesRetrieveActionTaskRecord) {
    this.productionEnvironmentandSupportServicesRetrieveActionTaskRecord = productionEnvironmentandSupportServicesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productionEnvironmentandSupportServicesRetrieveActionResponse
  **/

  public String getProductionEnvironmentandSupportServicesRetrieveActionResponse() {
    return productionEnvironmentandSupportServicesRetrieveActionResponse;
  }

  public void setProductionEnvironmentandSupportServicesRetrieveActionResponse(String productionEnvironmentandSupportServicesRetrieveActionResponse) {
    this.productionEnvironmentandSupportServicesRetrieveActionResponse = productionEnvironmentandSupportServicesRetrieveActionResponse;
  }


  /**
   * Get productionEnvironmentandSupportServicesInstanceReport
   * @return productionEnvironmentandSupportServicesInstanceReport
  **/

  public BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceReport getProductionEnvironmentandSupportServicesInstanceReport() {
    return productionEnvironmentandSupportServicesInstanceReport;
  }

  public void setProductionEnvironmentandSupportServicesInstanceReport(BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceReport productionEnvironmentandSupportServicesInstanceReport) {
    this.productionEnvironmentandSupportServicesInstanceReport = productionEnvironmentandSupportServicesInstanceReport;
  }


  /**
   * Get productionEnvironmentandSupportServicesInstanceAnalysis
   * @return productionEnvironmentandSupportServicesInstanceAnalysis
  **/

  public BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceAnalysis getProductionEnvironmentandSupportServicesInstanceAnalysis() {
    return productionEnvironmentandSupportServicesInstanceAnalysis;
  }

  public void setProductionEnvironmentandSupportServicesInstanceAnalysis(BQProductionEnvironmentandSupportServicesRetrieveOutputModelProductionEnvironmentandSupportServicesInstanceAnalysis productionEnvironmentandSupportServicesInstanceAnalysis) {
    this.productionEnvironmentandSupportServicesInstanceAnalysis = productionEnvironmentandSupportServicesInstanceAnalysis;
  }


}

