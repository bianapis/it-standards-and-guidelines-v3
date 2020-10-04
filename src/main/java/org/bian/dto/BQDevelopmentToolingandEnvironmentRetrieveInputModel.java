package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceAnalysis;
import org.bian.dto.BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQDevelopmentToolingandEnvironmentRetrieveInputModel
 */
public class BQDevelopmentToolingandEnvironmentRetrieveInputModel   {
  private Object developmentToolingandEnvironmentRetrieveActionTaskRecord = null;

  private String developmentToolingandEnvironmentRetrieveActionRequest = null;

  private BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceReport developmentToolingandEnvironmentInstanceReport = null;

  private BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceAnalysis developmentToolingandEnvironmentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return developmentToolingandEnvironmentRetrieveActionTaskRecord
  **/

  public Object getDevelopmentToolingandEnvironmentRetrieveActionTaskRecord() {
    return developmentToolingandEnvironmentRetrieveActionTaskRecord;
  }

  public void setDevelopmentToolingandEnvironmentRetrieveActionTaskRecord(Object developmentToolingandEnvironmentRetrieveActionTaskRecord) {
    this.developmentToolingandEnvironmentRetrieveActionTaskRecord = developmentToolingandEnvironmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return developmentToolingandEnvironmentRetrieveActionRequest
  **/

  public String getDevelopmentToolingandEnvironmentRetrieveActionRequest() {
    return developmentToolingandEnvironmentRetrieveActionRequest;
  }

  public void setDevelopmentToolingandEnvironmentRetrieveActionRequest(String developmentToolingandEnvironmentRetrieveActionRequest) {
    this.developmentToolingandEnvironmentRetrieveActionRequest = developmentToolingandEnvironmentRetrieveActionRequest;
  }


  /**
   * Get developmentToolingandEnvironmentInstanceReport
   * @return developmentToolingandEnvironmentInstanceReport
  **/

  public BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceReport getDevelopmentToolingandEnvironmentInstanceReport() {
    return developmentToolingandEnvironmentInstanceReport;
  }

  public void setDevelopmentToolingandEnvironmentInstanceReport(BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceReport developmentToolingandEnvironmentInstanceReport) {
    this.developmentToolingandEnvironmentInstanceReport = developmentToolingandEnvironmentInstanceReport;
  }


  /**
   * Get developmentToolingandEnvironmentInstanceAnalysis
   * @return developmentToolingandEnvironmentInstanceAnalysis
  **/

  public BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceAnalysis getDevelopmentToolingandEnvironmentInstanceAnalysis() {
    return developmentToolingandEnvironmentInstanceAnalysis;
  }

  public void setDevelopmentToolingandEnvironmentInstanceAnalysis(BQDevelopmentToolingandEnvironmentRetrieveInputModelDevelopmentToolingandEnvironmentInstanceAnalysis developmentToolingandEnvironmentInstanceAnalysis) {
    this.developmentToolingandEnvironmentInstanceAnalysis = developmentToolingandEnvironmentInstanceAnalysis;
  }


}

