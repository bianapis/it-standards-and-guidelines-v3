package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesFeedbackOutputModelITStandardsAndGuidelinesFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesFeedbackOutputModel
 */
public class SDITStandardsAndGuidelinesFeedbackOutputModel   {
  private String iTStandardsAndGuidelinesFeedbackActionTaskReference = null;

  private Object iTStandardsAndGuidelinesFeedbackActionTaskRecord = null;

  private SDITStandardsAndGuidelinesFeedbackOutputModelITStandardsAndGuidelinesFeedbackActionRecord iTStandardsAndGuidelinesFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return iTStandardsAndGuidelinesFeedbackActionTaskReference
  **/

  public String getITStandardsAndGuidelinesFeedbackActionTaskReference() {
    return iTStandardsAndGuidelinesFeedbackActionTaskReference;
  }

  public void setITStandardsAndGuidelinesFeedbackActionTaskReference(String iTStandardsAndGuidelinesFeedbackActionTaskReference) {
    this.iTStandardsAndGuidelinesFeedbackActionTaskReference = iTStandardsAndGuidelinesFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return iTStandardsAndGuidelinesFeedbackActionTaskRecord
  **/

  public Object getITStandardsAndGuidelinesFeedbackActionTaskRecord() {
    return iTStandardsAndGuidelinesFeedbackActionTaskRecord;
  }

  public void setITStandardsAndGuidelinesFeedbackActionTaskRecord(Object iTStandardsAndGuidelinesFeedbackActionTaskRecord) {
    this.iTStandardsAndGuidelinesFeedbackActionTaskRecord = iTStandardsAndGuidelinesFeedbackActionTaskRecord;
  }


  /**
   * Get iTStandardsAndGuidelinesFeedbackActionRecord
   * @return iTStandardsAndGuidelinesFeedbackActionRecord
  **/

  public SDITStandardsAndGuidelinesFeedbackOutputModelITStandardsAndGuidelinesFeedbackActionRecord getITStandardsAndGuidelinesFeedbackActionRecord() {
    return iTStandardsAndGuidelinesFeedbackActionRecord;
  }

  public void setITStandardsAndGuidelinesFeedbackActionRecord(SDITStandardsAndGuidelinesFeedbackOutputModelITStandardsAndGuidelinesFeedbackActionRecord iTStandardsAndGuidelinesFeedbackActionRecord) {
    this.iTStandardsAndGuidelinesFeedbackActionRecord = iTStandardsAndGuidelinesFeedbackActionRecord;
  }


}

