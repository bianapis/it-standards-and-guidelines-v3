/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class ItStandardsAndGuidelinesApiController {

	@Autowired
	ItStandardsAndGuidelinesApiService service;
	
	@Design.Activate
	public BianResponse<SDITStandardsAndGuidelinesActivateOutputModel> activate(@RequestBody BianRequest<SDITStandardsAndGuidelinesActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("developmenttoolingandenvironment")
	@Design.Capture
	public BianResponse<BQDevelopmentToolingandEnvironmentCaptureOutputModel> captureDevelopmenttoolingandenvironment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentToolingandEnvironmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureDevelopmenttoolingandenvironment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itpoliciesandguidelines")
	@Design.Capture
	public BianResponse<BQITPoliciesandGuidelinesCaptureOutputModel> captureItpoliciesandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITPoliciesandGuidelinesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureItpoliciesandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttestinganddeploymentmechanisms")
	@Design.Capture
	public BianResponse<BQProductTestingandDeploymentMechanismsCaptureOutputModel> captureProducttestinganddeploymentmechanisms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductTestingandDeploymentMechanismsCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProducttestinganddeploymentmechanisms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionenvironmentandsupportservices")
	@Design.Capture
	public BianResponse<BQProductionEnvironmentandSupportServicesCaptureOutputModel> captureProductionenvironmentandsupportservices(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionEnvironmentandSupportServicesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProductionenvironmentandsupportservices(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionplatformsandinfrastructure")
	@Design.Capture
	public BianResponse<BQProductionPlatformsandInfrastructureCaptureOutputModel> captureProductionplatformsandinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionPlatformsandInfrastructureCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProductionplatformsandinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Capture
	public BianResponse<CRTechnologyStandardsSpecificationCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRTechnologyStandardsSpecificationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Configure
	public BianResponse<SDITStandardsAndGuidelinesConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDITStandardsAndGuidelinesConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Control
	public BianResponse<CRTechnologyStandardsSpecificationControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRTechnologyStandardsSpecificationControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("developmenttoolingandenvironment")
	@Design.Exchange
	public BianResponse<BQDevelopmentToolingandEnvironmentExchangeOutputModel> exchangeDevelopmenttoolingandenvironment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentToolingandEnvironmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDevelopmenttoolingandenvironment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itpoliciesandguidelines")
	@Design.Exchange
	public BianResponse<BQITPoliciesandGuidelinesExchangeOutputModel> exchangeItpoliciesandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITPoliciesandGuidelinesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeItpoliciesandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttestinganddeploymentmechanisms")
	@Design.Exchange
	public BianResponse<BQProductTestingandDeploymentMechanismsExchangeOutputModel> exchangeProducttestinganddeploymentmechanisms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductTestingandDeploymentMechanismsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProducttestinganddeploymentmechanisms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionenvironmentandsupportservices")
	@Design.Exchange
	public BianResponse<BQProductionEnvironmentandSupportServicesExchangeOutputModel> exchangeProductionenvironmentandsupportservices(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionEnvironmentandSupportServicesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProductionenvironmentandsupportservices(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionplatformsandinfrastructure")
	@Design.Exchange
	public BianResponse<BQProductionPlatformsandInfrastructureExchangeOutputModel> exchangeProductionplatformsandinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionPlatformsandInfrastructureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeProductionplatformsandinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Exchange
	public BianResponse<CRTechnologyStandardsSpecificationExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRTechnologyStandardsSpecificationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Feedback
	public BianResponse<SDITStandardsAndGuidelinesFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDITStandardsAndGuidelinesFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Design.Initiate
	public BianResponse<CRTechnologyStandardsSpecificationInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRTechnologyStandardsSpecificationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("developmenttoolingandenvironment")
	@Design.Initiate
	public BianResponse<BQDevelopmentToolingandEnvironmentInitiateOutputModel> initiateDevelopmenttoolingandenvironment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDevelopmentToolingandEnvironmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDevelopmenttoolingandenvironment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("itpoliciesandguidelines")
	@Design.Initiate
	public BianResponse<BQITPoliciesandGuidelinesInitiateOutputModel> initiateItpoliciesandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQITPoliciesandGuidelinesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateItpoliciesandguidelines(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttestinganddeploymentmechanisms")
	@Design.Initiate
	public BianResponse<BQProductTestingandDeploymentMechanismsInitiateOutputModel> initiateProducttestinganddeploymentmechanisms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductTestingandDeploymentMechanismsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProducttestinganddeploymentmechanisms(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionenvironmentandsupportservices")
	@Design.Initiate
	public BianResponse<BQProductionEnvironmentandSupportServicesInitiateOutputModel> initiateProductionenvironmentandsupportservices(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductionEnvironmentandSupportServicesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProductionenvironmentandsupportservices(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionplatformsandinfrastructure")
	@Design.Initiate
	public BianResponse<BQProductionPlatformsandInfrastructureInitiateOutputModel> initiateProductionplatformsandinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductionPlatformsandInfrastructureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProductionplatformsandinfrastructure(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("developmenttoolingandenvironment")
	@Design.Request
	public BianResponse<BQDevelopmentToolingandEnvironmentRequestOutputModel> requestDevelopmenttoolingandenvironment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentToolingandEnvironmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestDevelopmenttoolingandenvironment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itpoliciesandguidelines")
	@Design.Request
	public BianResponse<BQITPoliciesandGuidelinesRequestOutputModel> requestItpoliciesandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITPoliciesandGuidelinesRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestItpoliciesandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttestinganddeploymentmechanisms")
	@Design.Request
	public BianResponse<BQProductTestingandDeploymentMechanismsRequestOutputModel> requestProducttestinganddeploymentmechanisms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductTestingandDeploymentMechanismsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProducttestinganddeploymentmechanisms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionenvironmentandsupportservices")
	@Design.Request
	public BianResponse<BQProductionEnvironmentandSupportServicesRequestOutputModel> requestProductionenvironmentandsupportservices(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionEnvironmentandSupportServicesRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProductionenvironmentandsupportservices(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionplatformsandinfrastructure")
	@Design.Request
	public BianResponse<BQProductionPlatformsandInfrastructureRequestOutputModel> requestProductionplatformsandinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionPlatformsandInfrastructureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestProductionplatformsandinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Request
	public BianResponse<CRTechnologyStandardsSpecificationRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRTechnologyStandardsSpecificationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Design.Retrieve
	public BianResponse<CRTechnologyStandardsSpecificationRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Design.RetrieveSD
	public BianResponse<SDITStandardsAndGuidelinesRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@BQ("developmenttoolingandenvironment")
	@Design.Retrieve
	public BianResponse<BQDevelopmentToolingandEnvironmentRetrieveOutputModel> retrieveDevelopmenttoolingandenvironment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevelopmenttoolingandenvironment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("itpoliciesandguidelines")
	@Design.Retrieve
	public BianResponse<BQITPoliciesandGuidelinesRetrieveOutputModel> retrieveItpoliciesandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveItpoliciesandguidelines(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("producttestinganddeploymentmechanisms")
	@Design.Retrieve
	public BianResponse<BQProductTestingandDeploymentMechanismsRetrieveOutputModel> retrieveProducttestinganddeploymentmechanisms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProducttestinganddeploymentmechanisms(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productionenvironmentandsupportservices")
	@Design.Retrieve
	public BianResponse<BQProductionEnvironmentandSupportServicesRetrieveOutputModel> retrieveProductionenvironmentandsupportservices(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductionenvironmentandsupportservices(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productionplatformsandinfrastructure")
	@Design.Retrieve
	public BianResponse<BQProductionPlatformsandInfrastructureRetrieveOutputModel> retrieveProductionplatformsandinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductionplatformsandinfrastructure(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Design.Update
	public BianResponse<CRTechnologyStandardsSpecificationUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRTechnologyStandardsSpecificationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("developmenttoolingandenvironment")
	@Design.Update
	public BianResponse<BQDevelopmentToolingandEnvironmentUpdateOutputModel> updateDevelopmenttoolingandenvironment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentToolingandEnvironmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDevelopmenttoolingandenvironment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("itpoliciesandguidelines")
	@Design.Update
	public BianResponse<BQITPoliciesandGuidelinesUpdateOutputModel> updateItpoliciesandguidelines(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQITPoliciesandGuidelinesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateItpoliciesandguidelines(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("producttestinganddeploymentmechanisms")
	@Design.Update
	public BianResponse<BQProductTestingandDeploymentMechanismsUpdateOutputModel> updateProducttestinganddeploymentmechanisms(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductTestingandDeploymentMechanismsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProducttestinganddeploymentmechanisms(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionenvironmentandsupportservices")
	@Design.Update
	public BianResponse<BQProductionEnvironmentandSupportServicesUpdateOutputModel> updateProductionenvironmentandsupportservices(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionEnvironmentandSupportServicesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductionenvironmentandsupportservices(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productionplatformsandinfrastructure")
	@Design.Update
	public BianResponse<BQProductionPlatformsandInfrastructureUpdateOutputModel> updateProductionplatformsandinfrastructure(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductionPlatformsandInfrastructureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductionplatformsandinfrastructure(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
