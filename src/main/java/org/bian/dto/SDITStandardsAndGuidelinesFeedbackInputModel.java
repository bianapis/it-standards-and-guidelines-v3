package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDITStandardsAndGuidelinesFeedbackInputModelITStandardsAndGuidelinesFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDITStandardsAndGuidelinesFeedbackInputModel
 */
public class SDITStandardsAndGuidelinesFeedbackInputModel   {
  private Object iTStandardsAndGuidelinesFeedbackActionTaskRecord = null;

  private SDITStandardsAndGuidelinesFeedbackInputModelITStandardsAndGuidelinesFeedbackActionRecord iTStandardsAndGuidelinesFeedbackActionRecord = null;


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

  public SDITStandardsAndGuidelinesFeedbackInputModelITStandardsAndGuidelinesFeedbackActionRecord getITStandardsAndGuidelinesFeedbackActionRecord() {
    return iTStandardsAndGuidelinesFeedbackActionRecord;
  }

  public void setITStandardsAndGuidelinesFeedbackActionRecord(SDITStandardsAndGuidelinesFeedbackInputModelITStandardsAndGuidelinesFeedbackActionRecord iTStandardsAndGuidelinesFeedbackActionRecord) {
    this.iTStandardsAndGuidelinesFeedbackActionRecord = iTStandardsAndGuidelinesFeedbackActionRecord;
  }


}

