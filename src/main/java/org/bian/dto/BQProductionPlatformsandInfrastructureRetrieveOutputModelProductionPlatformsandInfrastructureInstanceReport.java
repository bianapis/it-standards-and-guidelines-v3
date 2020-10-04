package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductionPlatformsandInfrastructureRetrieveOutputModelProductionPlatformsandInfrastructureInstanceReport
 */
public class BQProductionPlatformsandInfrastructureRetrieveOutputModelProductionPlatformsandInfrastructureInstanceReport   {
  private Object productionPlatformsandInfrastructureInstanceReportRecord = null;

  private String productionPlatformsandInfrastructureInstanceReportType = null;

  private String productionPlatformsandInfrastructureInstanceReportParameters = null;

  private Object productionPlatformsandInfrastructureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productionPlatformsandInfrastructureInstanceReportRecord
  **/

  public Object getProductionPlatformsandInfrastructureInstanceReportRecord() {
    return productionPlatformsandInfrastructureInstanceReportRecord;
  }

  public void setProductionPlatformsandInfrastructureInstanceReportRecord(Object productionPlatformsandInfrastructureInstanceReportRecord) {
    this.productionPlatformsandInfrastructureInstanceReportRecord = productionPlatformsandInfrastructureInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productionPlatformsandInfrastructureInstanceReportType
  **/

  public String getProductionPlatformsandInfrastructureInstanceReportType() {
    return productionPlatformsandInfrastructureInstanceReportType;
  }

  public void setProductionPlatformsandInfrastructureInstanceReportType(String productionPlatformsandInfrastructureInstanceReportType) {
    this.productionPlatformsandInfrastructureInstanceReportType = productionPlatformsandInfrastructureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productionPlatformsandInfrastructureInstanceReportParameters
  **/

  public String getProductionPlatformsandInfrastructureInstanceReportParameters() {
    return productionPlatformsandInfrastructureInstanceReportParameters;
  }

  public void setProductionPlatformsandInfrastructureInstanceReportParameters(String productionPlatformsandInfrastructureInstanceReportParameters) {
    this.productionPlatformsandInfrastructureInstanceReportParameters = productionPlatformsandInfrastructureInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productionPlatformsandInfrastructureInstanceReport
  **/

  public Object getProductionPlatformsandInfrastructureInstanceReport() {
    return productionPlatformsandInfrastructureInstanceReport;
  }

  public void setProductionPlatformsandInfrastructureInstanceReport(Object productionPlatformsandInfrastructureInstanceReport) {
    this.productionPlatformsandInfrastructureInstanceReport = productionPlatformsandInfrastructureInstanceReport;
  }


}

