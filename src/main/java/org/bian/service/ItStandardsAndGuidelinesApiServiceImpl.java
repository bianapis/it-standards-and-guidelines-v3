/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ItStandardsAndGuidelinesApiServiceImpl implements ItStandardsAndGuidelinesApiService {

	public SDITStandardsAndGuidelinesActivateOutputModel activate(SDITStandardsAndGuidelinesActivateInputModel request){
		return JsonReader.read("activate-SDITStandardsAndGuidelinesActivateOutputModel.json",new TypeReference<SDITStandardsAndGuidelinesActivateOutputModel>(){});
	}
	
	public BQDevelopmentToolingandEnvironmentCaptureOutputModel captureDevelopmenttoolingandenvironment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentToolingandEnvironmentCaptureInputModel request){
		return JsonReader.read("capture-BQDevelopmentToolingandEnvironmentCaptureOutputModel.json",new TypeReference<BQDevelopmentToolingandEnvironmentCaptureOutputModel>(){});
	}
	
	public BQITPoliciesandGuidelinesCaptureOutputModel captureItpoliciesandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITPoliciesandGuidelinesCaptureInputModel request){
		return JsonReader.read("capture-BQITPoliciesandGuidelinesCaptureOutputModel.json",new TypeReference<BQITPoliciesandGuidelinesCaptureOutputModel>(){});
	}
	
	public BQProductTestingandDeploymentMechanismsCaptureOutputModel captureProducttestinganddeploymentmechanisms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductTestingandDeploymentMechanismsCaptureInputModel request){
		return JsonReader.read("capture-BQProductTestingandDeploymentMechanismsCaptureOutputModel.json",new TypeReference<BQProductTestingandDeploymentMechanismsCaptureOutputModel>(){});
	}
	
	public BQProductionEnvironmentandSupportServicesCaptureOutputModel captureProductionenvironmentandsupportservices(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionEnvironmentandSupportServicesCaptureInputModel request){
		return JsonReader.read("capture-BQProductionEnvironmentandSupportServicesCaptureOutputModel.json",new TypeReference<BQProductionEnvironmentandSupportServicesCaptureOutputModel>(){});
	}
	
	public BQProductionPlatformsandInfrastructureCaptureOutputModel captureProductionplatformsandinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionPlatformsandInfrastructureCaptureInputModel request){
		return JsonReader.read("capture-BQProductionPlatformsandInfrastructureCaptureOutputModel.json",new TypeReference<BQProductionPlatformsandInfrastructureCaptureOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRTechnologyStandardsSpecificationCaptureInputModel request){
		return JsonReader.read("capture-CRTechnologyStandardsSpecificationCaptureOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationCaptureOutputModel>(){});
	}
	
	public SDITStandardsAndGuidelinesConfigureOutputModel configure(String sdReferenceId, SDITStandardsAndGuidelinesConfigureInputModel request){
		return JsonReader.read("configure-SDITStandardsAndGuidelinesConfigureOutputModel.json",new TypeReference<SDITStandardsAndGuidelinesConfigureOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationControlOutputModel control(String sdReferenceId, String crReferenceId, CRTechnologyStandardsSpecificationControlInputModel request){
		return JsonReader.read("control-CRTechnologyStandardsSpecificationControlOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationControlOutputModel>(){});
	}
	
	public BQDevelopmentToolingandEnvironmentExchangeOutputModel exchangeDevelopmenttoolingandenvironment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentToolingandEnvironmentExchangeInputModel request){
		return JsonReader.read("exchange-BQDevelopmentToolingandEnvironmentExchangeOutputModel.json",new TypeReference<BQDevelopmentToolingandEnvironmentExchangeOutputModel>(){});
	}
	
	public BQITPoliciesandGuidelinesExchangeOutputModel exchangeItpoliciesandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITPoliciesandGuidelinesExchangeInputModel request){
		return JsonReader.read("exchange-BQITPoliciesandGuidelinesExchangeOutputModel.json",new TypeReference<BQITPoliciesandGuidelinesExchangeOutputModel>(){});
	}
	
	public BQProductTestingandDeploymentMechanismsExchangeOutputModel exchangeProducttestinganddeploymentmechanisms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductTestingandDeploymentMechanismsExchangeInputModel request){
		return JsonReader.read("exchange-BQProductTestingandDeploymentMechanismsExchangeOutputModel.json",new TypeReference<BQProductTestingandDeploymentMechanismsExchangeOutputModel>(){});
	}
	
	public BQProductionEnvironmentandSupportServicesExchangeOutputModel exchangeProductionenvironmentandsupportservices(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionEnvironmentandSupportServicesExchangeInputModel request){
		return JsonReader.read("exchange-BQProductionEnvironmentandSupportServicesExchangeOutputModel.json",new TypeReference<BQProductionEnvironmentandSupportServicesExchangeOutputModel>(){});
	}
	
	public BQProductionPlatformsandInfrastructureExchangeOutputModel exchangeProductionplatformsandinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionPlatformsandInfrastructureExchangeInputModel request){
		return JsonReader.read("exchange-BQProductionPlatformsandInfrastructureExchangeOutputModel.json",new TypeReference<BQProductionPlatformsandInfrastructureExchangeOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRTechnologyStandardsSpecificationExchangeInputModel request){
		return JsonReader.read("exchange-CRTechnologyStandardsSpecificationExchangeOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationExchangeOutputModel>(){});
	}
	
	public SDITStandardsAndGuidelinesFeedbackOutputModel feedback(String sdReferenceId, SDITStandardsAndGuidelinesFeedbackInputModel request){
		return JsonReader.read("feedback-SDITStandardsAndGuidelinesFeedbackOutputModel.json",new TypeReference<SDITStandardsAndGuidelinesFeedbackOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationInitiateOutputModel initiate(String sdReferenceId, CRTechnologyStandardsSpecificationInitiateInputModel request){
		return JsonReader.read("initiate-CRTechnologyStandardsSpecificationInitiateOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationInitiateOutputModel>(){});
	}
	
	public BQDevelopmentToolingandEnvironmentInitiateOutputModel initiateDevelopmenttoolingandenvironment(String sdReferenceId, String crReferenceId, BQDevelopmentToolingandEnvironmentInitiateInputModel request){
		return JsonReader.read("initiate-BQDevelopmentToolingandEnvironmentInitiateOutputModel.json",new TypeReference<BQDevelopmentToolingandEnvironmentInitiateOutputModel>(){});
	}
	
	public BQITPoliciesandGuidelinesInitiateOutputModel initiateItpoliciesandguidelines(String sdReferenceId, String crReferenceId, BQITPoliciesandGuidelinesInitiateInputModel request){
		return JsonReader.read("initiate-BQITPoliciesandGuidelinesInitiateOutputModel.json",new TypeReference<BQITPoliciesandGuidelinesInitiateOutputModel>(){});
	}
	
	public BQProductTestingandDeploymentMechanismsInitiateOutputModel initiateProducttestinganddeploymentmechanisms(String sdReferenceId, String crReferenceId, BQProductTestingandDeploymentMechanismsInitiateInputModel request){
		return JsonReader.read("initiate-BQProductTestingandDeploymentMechanismsInitiateOutputModel.json",new TypeReference<BQProductTestingandDeploymentMechanismsInitiateOutputModel>(){});
	}
	
	public BQProductionEnvironmentandSupportServicesInitiateOutputModel initiateProductionenvironmentandsupportservices(String sdReferenceId, String crReferenceId, BQProductionEnvironmentandSupportServicesInitiateInputModel request){
		return JsonReader.read("initiate-BQProductionEnvironmentandSupportServicesInitiateOutputModel.json",new TypeReference<BQProductionEnvironmentandSupportServicesInitiateOutputModel>(){});
	}
	
	public BQProductionPlatformsandInfrastructureInitiateOutputModel initiateProductionplatformsandinfrastructure(String sdReferenceId, String crReferenceId, BQProductionPlatformsandInfrastructureInitiateInputModel request){
		return JsonReader.read("initiate-BQProductionPlatformsandInfrastructureInitiateOutputModel.json",new TypeReference<BQProductionPlatformsandInfrastructureInitiateOutputModel>(){});
	}
	
	public BQDevelopmentToolingandEnvironmentRequestOutputModel requestDevelopmenttoolingandenvironment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentToolingandEnvironmentRequestInputModel request){
		return JsonReader.read("request-BQDevelopmentToolingandEnvironmentRequestOutputModel.json",new TypeReference<BQDevelopmentToolingandEnvironmentRequestOutputModel>(){});
	}
	
	public BQITPoliciesandGuidelinesRequestOutputModel requestItpoliciesandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITPoliciesandGuidelinesRequestInputModel request){
		return JsonReader.read("request-BQITPoliciesandGuidelinesRequestOutputModel.json",new TypeReference<BQITPoliciesandGuidelinesRequestOutputModel>(){});
	}
	
	public BQProductTestingandDeploymentMechanismsRequestOutputModel requestProducttestinganddeploymentmechanisms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductTestingandDeploymentMechanismsRequestInputModel request){
		return JsonReader.read("request-BQProductTestingandDeploymentMechanismsRequestOutputModel.json",new TypeReference<BQProductTestingandDeploymentMechanismsRequestOutputModel>(){});
	}
	
	public BQProductionEnvironmentandSupportServicesRequestOutputModel requestProductionenvironmentandsupportservices(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionEnvironmentandSupportServicesRequestInputModel request){
		return JsonReader.read("request-BQProductionEnvironmentandSupportServicesRequestOutputModel.json",new TypeReference<BQProductionEnvironmentandSupportServicesRequestOutputModel>(){});
	}
	
	public BQProductionPlatformsandInfrastructureRequestOutputModel requestProductionplatformsandinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionPlatformsandInfrastructureRequestInputModel request){
		return JsonReader.read("request-BQProductionPlatformsandInfrastructureRequestOutputModel.json",new TypeReference<BQProductionPlatformsandInfrastructureRequestOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationRequestOutputModel request(String sdReferenceId, String crReferenceId, CRTechnologyStandardsSpecificationRequestInputModel request){
		return JsonReader.read("request-CRTechnologyStandardsSpecificationRequestOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationRequestOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRTechnologyStandardsSpecificationRetrieveOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDITStandardsAndGuidelinesRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDITStandardsAndGuidelinesRetrieveOutputModel.json",new TypeReference<SDITStandardsAndGuidelinesRetrieveOutputModel>(){});
	}
	
	public BQDevelopmentToolingandEnvironmentRetrieveOutputModel retrieveDevelopmenttoolingandenvironment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDevelopmentToolingandEnvironmentRetrieveOutputModel.json",new TypeReference<BQDevelopmentToolingandEnvironmentRetrieveOutputModel>(){});
	}
	
	public BQITPoliciesandGuidelinesRetrieveOutputModel retrieveItpoliciesandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQITPoliciesandGuidelinesRetrieveOutputModel.json",new TypeReference<BQITPoliciesandGuidelinesRetrieveOutputModel>(){});
	}
	
	public BQProductTestingandDeploymentMechanismsRetrieveOutputModel retrieveProducttestinganddeploymentmechanisms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductTestingandDeploymentMechanismsRetrieveOutputModel.json",new TypeReference<BQProductTestingandDeploymentMechanismsRetrieveOutputModel>(){});
	}
	
	public BQProductionEnvironmentandSupportServicesRetrieveOutputModel retrieveProductionenvironmentandsupportservices(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionEnvironmentandSupportServicesRetrieveOutputModel.json",new TypeReference<BQProductionEnvironmentandSupportServicesRetrieveOutputModel>(){});
	}
	
	public BQProductionPlatformsandInfrastructureRetrieveOutputModel retrieveProductionplatformsandinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductionPlatformsandInfrastructureRetrieveOutputModel.json",new TypeReference<BQProductionPlatformsandInfrastructureRetrieveOutputModel>(){});
	}
	
	public CRTechnologyStandardsSpecificationUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRTechnologyStandardsSpecificationUpdateInputModel request){
		return JsonReader.read("update-CRTechnologyStandardsSpecificationUpdateOutputModel.json",new TypeReference<CRTechnologyStandardsSpecificationUpdateOutputModel>(){});
	}
	
	public BQDevelopmentToolingandEnvironmentUpdateOutputModel updateDevelopmenttoolingandenvironment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentToolingandEnvironmentUpdateInputModel request){
		return JsonReader.read("update-BQDevelopmentToolingandEnvironmentUpdateOutputModel.json",new TypeReference<BQDevelopmentToolingandEnvironmentUpdateOutputModel>(){});
	}
	
	public BQITPoliciesandGuidelinesUpdateOutputModel updateItpoliciesandguidelines(String sdReferenceId, String crReferenceId, String bqReferenceId, BQITPoliciesandGuidelinesUpdateInputModel request){
		return JsonReader.read("update-BQITPoliciesandGuidelinesUpdateOutputModel.json",new TypeReference<BQITPoliciesandGuidelinesUpdateOutputModel>(){});
	}
	
	public BQProductTestingandDeploymentMechanismsUpdateOutputModel updateProducttestinganddeploymentmechanisms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductTestingandDeploymentMechanismsUpdateInputModel request){
		return JsonReader.read("update-BQProductTestingandDeploymentMechanismsUpdateOutputModel.json",new TypeReference<BQProductTestingandDeploymentMechanismsUpdateOutputModel>(){});
	}
	
	public BQProductionEnvironmentandSupportServicesUpdateOutputModel updateProductionenvironmentandsupportservices(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionEnvironmentandSupportServicesUpdateInputModel request){
		return JsonReader.read("update-BQProductionEnvironmentandSupportServicesUpdateOutputModel.json",new TypeReference<BQProductionEnvironmentandSupportServicesUpdateOutputModel>(){});
	}
	
	public BQProductionPlatformsandInfrastructureUpdateOutputModel updateProductionplatformsandinfrastructure(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductionPlatformsandInfrastructureUpdateInputModel request){
		return JsonReader.read("update-BQProductionPlatformsandInfrastructureUpdateOutputModel.json",new TypeReference<BQProductionPlatformsandInfrastructureUpdateOutputModel>(){});
	}
	
}
