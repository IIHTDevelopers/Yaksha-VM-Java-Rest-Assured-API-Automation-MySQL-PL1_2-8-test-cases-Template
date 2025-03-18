package rest;

import java.util.List;

import io.restassured.response.Response;

public class ApiUtil {

	private static final String BASE_URL = "https://healthapp.yaksha.com/api";

	/**
	 * @Test1 This method retrieves and verifies the list of stocks.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, itemIds, itemNames and genericNames.
	 */
	public CustomResponse getAllStocks(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		List<Object> itemIds = null;
		List<Object> itemNames = null;
		List<Object> genericNames = null;

		return new CustomResponse(response, statusCode, status, itemIds, itemNames, genericNames);
	}

	/**
	 * @Test2 This method retrieves and verifies the details of the main store.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, storeId, category and isActive.
	 */
	public CustomResponse getMainStore(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		Object storeId = null;
		Object category = null;
		Object isActive = null;

		return new CustomResponse(response, statusCode, status, storeId, category, isActive);
	}

	/**
	 * @Test3 This method retrieves and verifies the requisition list by date range.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, requisitionNos, requisitionStatuses and requisitionIds.
	 */
	public CustomResponse getRequisitionByDateRange(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		List<Object> requisitionNos = null;
		List<Object> requisitionStatuses = null;
		List<Object> requisitionIds = null;

		return new CustomResponse(response, statusCode, status, requisitionNos, requisitionStatuses, requisitionIds);
	}

	/**
	 * @Test4 This method retrieves and verifies the patient consumptions list.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, patientIds, hospitalNos and patientVisitIds.
	 */
	public CustomResponse getPatientConsumptions(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		List<Object> patientIds = null;
		List<Object> hospitalNos = null;
		List<Object> patientVisitIds = null;

		return new CustomResponse(response, statusCode, status, patientIds, hospitalNos, patientVisitIds);
	}

	/**
	 * @Test5 This method retrieves and verifies the patient consumption
	 *        information.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, patientName, hospitalNo and storeId.
	 */
	public CustomResponse getPatientConsumptionInfoByPatientIdAndVisitId(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		Object patientName = null;
		Object hospitalNo = null;
		Object storeId = null;

		return new CustomResponse(response, statusCode, status, patientName, hospitalNo, storeId);
	}

	/**
	 * @Test6 This method retrieves and verifies the billing scheme by scheme ID.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, schemeCode, schemeName and schemeId.
	 */
	public CustomResponse getBillingSchemeBySchemeId(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		Object schemeCode = null;
		Object schemeName = null;
		Object schemeId = null;

		return new CustomResponse(response, statusCode, status, schemeCode, schemeName, schemeId);
	}

	/**
	 * @Test7 This method retrieves and verifies the billing summary by patient ID.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, patientId and totalDue.
	 */
	public CustomResponse getBillingSummaryByPatientId(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		Object patientId = null;
		Object totalDue = null;

		return new CustomResponse(response, statusCode, status, patientId, totalDue);
	}

	/**
	 * @Test8 This method retrieves and verifies the consumptions list of a patient
	 *        by ID.
	 * 
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional request body
	 * @return CustomResponse - Contains response, statusCode, status, patientConsumptionIds, consumptionReceiptNos and totalAmounts.
	 */
	public CustomResponse getConsumptionsListOfAPatientById(String endpoint, Object body) {
		// write your code here

		Response response = null;

		int statusCode = 0;
		String status = "";

		List<Object> patientConsumptionIds = null;
		List<Object> consumptionReceiptNos = null;
		List<Object> totalAmounts = null;

		return new CustomResponse(response, statusCode, status, patientConsumptionIds, consumptionReceiptNos,
				totalAmounts);
	}
}
