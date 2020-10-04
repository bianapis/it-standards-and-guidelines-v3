package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceAnalysis;
import org.bian.dto.CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRTechnologyStandardsSpecificationRetrieveInputModel
 */
public class CRTechnologyStandardsSpecificationRetrieveInputModel   {
  private Object technologyStandardsSpecificationRetrieveActionTaskRecord = null;

  private String technologyStandardsSpecificationRetrieveActionRequest = null;

  private CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceReportRecord technologyStandardsSpecificationInstanceReportRecord = null;

  private CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceAnalysis technologyStandardsSpecificationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return technologyStandardsSpecificationRetrieveActionTaskRecord
  **/

  public Object getTechnologyStandardsSpecificationRetrieveActionTaskRecord() {
    return technologyStandardsSpecificationRetrieveActionTaskRecord;
  }

  public void setTechnologyStandardsSpecificationRetrieveActionTaskRecord(Object technologyStandardsSpecificationRetrieveActionTaskRecord) {
    this.technologyStandardsSpecificationRetrieveActionTaskRecord = technologyStandardsSpecificationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return technologyStandardsSpecificationRetrieveActionRequest
  **/

  public String getTechnologyStandardsSpecificationRetrieveActionRequest() {
    return technologyStandardsSpecificationRetrieveActionRequest;
  }

  public void setTechnologyStandardsSpecificationRetrieveActionRequest(String technologyStandardsSpecificationRetrieveActionRequest) {
    this.technologyStandardsSpecificationRetrieveActionRequest = technologyStandardsSpecificationRetrieveActionRequest;
  }


  /**
   * Get technologyStandardsSpecificationInstanceReportRecord
   * @return technologyStandardsSpecificationInstanceReportRecord
  **/

  public CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceReportRecord getTechnologyStandardsSpecificationInstanceReportRecord() {
    return technologyStandardsSpecificationInstanceReportRecord;
  }

  public void setTechnologyStandardsSpecificationInstanceReportRecord(CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceReportRecord technologyStandardsSpecificationInstanceReportRecord) {
    this.technologyStandardsSpecificationInstanceReportRecord = technologyStandardsSpecificationInstanceReportRecord;
  }


  /**
   * Get technologyStandardsSpecificationInstanceAnalysis
   * @return technologyStandardsSpecificationInstanceAnalysis
  **/

  public CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceAnalysis getTechnologyStandardsSpecificationInstanceAnalysis() {
    return technologyStandardsSpecificationInstanceAnalysis;
  }

  public void setTechnologyStandardsSpecificationInstanceAnalysis(CRTechnologyStandardsSpecificationRetrieveInputModelTechnologyStandardsSpecificationInstanceAnalysis technologyStandardsSpecificationInstanceAnalysis) {
    this.technologyStandardsSpecificationInstanceAnalysis = technologyStandardsSpecificationInstanceAnalysis;
  }


}

