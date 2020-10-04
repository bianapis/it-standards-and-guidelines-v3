package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceReportRecord
 */
public class CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceReportRecord   {
  private String technologyStandardsSpecificationInstanceReportReference = null;

  private String technologyStandardsSpecificationInstanceReportType = null;

  private String technologyStandardsSpecificationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return technologyStandardsSpecificationInstanceReportReference
  **/

  public String getTechnologyStandardsSpecificationInstanceReportReference() {
    return technologyStandardsSpecificationInstanceReportReference;
  }

  public void setTechnologyStandardsSpecificationInstanceReportReference(String technologyStandardsSpecificationInstanceReportReference) {
    this.technologyStandardsSpecificationInstanceReportReference = technologyStandardsSpecificationInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return technologyStandardsSpecificationInstanceReportType
  **/

  public String getTechnologyStandardsSpecificationInstanceReportType() {
    return technologyStandardsSpecificationInstanceReportType;
  }

  public void setTechnologyStandardsSpecificationInstanceReportType(String technologyStandardsSpecificationInstanceReportType) {
    this.technologyStandardsSpecificationInstanceReportType = technologyStandardsSpecificationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return technologyStandardsSpecificationInstanceReportParameters
  **/

  public String getTechnologyStandardsSpecificationInstanceReportParameters() {
    return technologyStandardsSpecificationInstanceReportParameters;
  }

  public void setTechnologyStandardsSpecificationInstanceReportParameters(String technologyStandardsSpecificationInstanceReportParameters) {
    this.technologyStandardsSpecificationInstanceReportParameters = technologyStandardsSpecificationInstanceReportParameters;
  }


}

