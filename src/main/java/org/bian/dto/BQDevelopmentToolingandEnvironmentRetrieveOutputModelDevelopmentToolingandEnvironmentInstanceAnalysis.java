package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentToolingandEnvironmentRetrieveOutputModelDevelopmentToolingandEnvironmentInstanceAnalysis
 */
public class BQDevelopmentToolingandEnvironmentRetrieveOutputModelDevelopmentToolingandEnvironmentInstanceAnalysis   {
  private Object developmentToolingandEnvironmentInstanceAnalysisRecord = null;

  private String developmentToolingandEnvironmentInstanceAnalysisReportType = null;

  private String developmentToolingandEnvironmentInstanceAnalysisParameters = null;

  private Object developmentToolingandEnvironmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return developmentToolingandEnvironmentInstanceAnalysisRecord
  **/

  public Object getDevelopmentToolingandEnvironmentInstanceAnalysisRecord() {
    return developmentToolingandEnvironmentInstanceAnalysisRecord;
  }

  public void setDevelopmentToolingandEnvironmentInstanceAnalysisRecord(Object developmentToolingandEnvironmentInstanceAnalysisRecord) {
    this.developmentToolingandEnvironmentInstanceAnalysisRecord = developmentToolingandEnvironmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return developmentToolingandEnvironmentInstanceAnalysisReportType
  **/

  public String getDevelopmentToolingandEnvironmentInstanceAnalysisReportType() {
    return developmentToolingandEnvironmentInstanceAnalysisReportType;
  }

  public void setDevelopmentToolingandEnvironmentInstanceAnalysisReportType(String developmentToolingandEnvironmentInstanceAnalysisReportType) {
    this.developmentToolingandEnvironmentInstanceAnalysisReportType = developmentToolingandEnvironmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return developmentToolingandEnvironmentInstanceAnalysisParameters
  **/

  public String getDevelopmentToolingandEnvironmentInstanceAnalysisParameters() {
    return developmentToolingandEnvironmentInstanceAnalysisParameters;
  }

  public void setDevelopmentToolingandEnvironmentInstanceAnalysisParameters(String developmentToolingandEnvironmentInstanceAnalysisParameters) {
    this.developmentToolingandEnvironmentInstanceAnalysisParameters = developmentToolingandEnvironmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return developmentToolingandEnvironmentInstanceAnalysisReport
  **/

  public Object getDevelopmentToolingandEnvironmentInstanceAnalysisReport() {
    return developmentToolingandEnvironmentInstanceAnalysisReport;
  }

  public void setDevelopmentToolingandEnvironmentInstanceAnalysisReport(Object developmentToolingandEnvironmentInstanceAnalysisReport) {
    this.developmentToolingandEnvironmentInstanceAnalysisReport = developmentToolingandEnvironmentInstanceAnalysisReport;
  }


}

