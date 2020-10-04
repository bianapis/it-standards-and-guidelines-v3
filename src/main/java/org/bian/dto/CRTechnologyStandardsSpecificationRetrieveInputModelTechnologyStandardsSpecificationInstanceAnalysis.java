package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceAnalysis
 */
public class CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceAnalysis   {
  private String technologyStandardsSpecificationInstanceAnalysisReference = null;

  private String technologyStandardsSpecificationInstanceAnalysisReportType = null;

  private String technologyStandardsSpecificationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return technologyStandardsSpecificationInstanceAnalysisReference
  **/

  public String getTechnologyStandardsSpecificationInstanceAnalysisReference() {
    return technologyStandardsSpecificationInstanceAnalysisReference;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysisReference(String technologyStandardsSpecificationInstanceAnalysisReference) {
    this.technologyStandardsSpecificationInstanceAnalysisReference = technologyStandardsSpecificationInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return technologyStandardsSpecificationInstanceAnalysisReportType
  **/

  public String getTechnologyStandardsSpecificationInstanceAnalysisReportType() {
    return technologyStandardsSpecificationInstanceAnalysisReportType;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysisReportType(String technologyStandardsSpecificationInstanceAnalysisReportType) {
    this.technologyStandardsSpecificationInstanceAnalysisReportType = technologyStandardsSpecificationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return technologyStandardsSpecificationInstanceAnalysisParameters
  **/

  public String getTechnologyStandardsSpecificationInstanceAnalysisParameters() {
    return technologyStandardsSpecificationInstanceAnalysisParameters;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysisParameters(String technologyStandardsSpecificationInstanceAnalysisParameters) {
    this.technologyStandardsSpecificationInstanceAnalysisParameters = technologyStandardsSpecificationInstanceAnalysisParameters;
  }


}

